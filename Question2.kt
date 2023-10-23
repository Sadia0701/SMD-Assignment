import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Cloud
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.painterResource

@Composable
fun WeatherAppUI() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
                .padding(16.dp)
        ) {
            // Header with City Name and Search Icon
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "MUMBAI", fontWeight = FontWeight.Bold, color = Color.White)
                Icon(imageVector = Icons.Default.Search, contentDescription = null, tint = Color.White)
            }

            // Date and Time Info
            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "13 FEB, SAT", color = Color.White)
                Text(text = "02:00PM", color = Color.White)
            }

            // City Image (For simplicity, using colored box as placeholder)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .background(Color.Blue)
                    .padding(top = 16.dp)
            )

            // Weekday Weather
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                WeatherDayItem(day = "SAT", temp = "28°C", icon = Icons.Default.Cloud)
                WeatherDayItem(day = "SUN", temp = "31°C", icon = Icons.Default.Cloud)
                WeatherDayItem(day = "MON", temp = "31°C", icon = Icons.Default.Cloud)
                WeatherDayItem(day = "TUE", temp = "32°C", icon = Icons.Default.Cloud)
                WeatherDayItem(day = "WED", temp = "32°C", icon = Icons.Default.Cloud)
            }

            // Locations
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(top = 16.dp)
                    .padding(8.dp)
            ) {
                Column {
                    LocationItem(city = "Mumbai", condition = "Sunny", temp = "28°C")
                    LocationItem(city = "Indore", condition = "Smoke", temp = "24°C")
                    LocationItem(city = "Bhopal", condition = "Clear", temp = "21°C")
                }
            }
        }
    }
}

@Composable
fun WeatherDayItem(day: String, temp: String, icon: androidx.compose.ui.graphics.vector.ImageVector) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = day, color = Color.White)
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )
        Text(text = temp, color = Color.White)
    }
}

@Composable
fun LocationItem(city: String, condition: String, temp: String) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = city, fontWeight = FontWeight.Bold)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = temp, fontWeight = FontWeight.Bold, color = Color.Gray)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = condition)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WeatherAppUIPreview() {
    WeatherAppUI()
}
