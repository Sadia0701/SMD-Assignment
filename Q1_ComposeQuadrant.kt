import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color

@Composable
fun ComposableCard(title: String, description: String) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .background(Color.LightGray)  // Assuming a light gray background for the card
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = title,
                style = TextStyle(
                    fontSize = 20.sp,  // Adjust as per your needs
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = description,
                style = MaterialTheme.typography.body1
            )
        }
    }
}

@Composable
fun ComposablesScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Layout(
            content = {
                ComposableCard("Text composable", "Displays text and follows the recommended Material Design guidelines.")
                ComposableCard("Image composable", "Creates a composable that lays out and draws a given Painter class object.")
                ComposableCard("Row composable", "A layout composable that places its children in a horizontal sequence.")
                ComposableCard("Column composable", "A layout composable that places its children in a vertical sequence.")
            }
        ) { measurables, constraints ->
            val width = constraints.maxWidth / 2
            val height = constraints.maxHeight / 2

            val placeables = measurables.map { measurable ->
                measurable.measure(constraints.copy(maxWidth = width, maxHeight = height))
            }

            layout(constraints.maxWidth, constraints.maxHeight) {
                placeables[0].place(0, 0)
                placeables[1].place(width, 0)
                placeables[2].place(0, height)
                placeables[3].place(width, height)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewComposablesScreen() {
    ComposablesScreen()
}
