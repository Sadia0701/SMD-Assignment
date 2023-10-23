import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.layout.TextAlign
import androidx.compose.foundation.text.layout.TextAlign.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun ComposeArticleScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        // Load image using painterResource() and set it to fill the entire screen's width
        Image(
            painter = painterResource(id = R.drawable.jetpack_compose_image),
            contentDescription = null, // Provide a meaningful description
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp) // Adjust the height as needed
        )

        // Set the first Text composable to a 24sp font size and 16dp padding
        Text(
            text = stringResource(id = R.string.jetpack_compose_title),
            fontSize = 24.sp,
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 16.dp)
        )

        // Set the second Text composable to default font size, 16dp padding, and Justify text align
        Text(
            text = stringResource(id = R.string.jetpack_compose_description),
            fontSize = 16.sp,
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth(),
            textAlign = Justified
        )

        // Set the third Text composable to default font size, 16dp padding, and Justify text align
        Text(
            text = stringResource(id = R.string.jetpack_compose_tutorial),
            fontSize = 16.sp,
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 16.dp)
                .fillMaxWidth(),
            textAlign = Justified
        )
    }
}

@Composable
@Preview
fun ComposeArticleScreenPreview() {
    // Preview your ComposeArticleScreen
    ComposeArticleScreen()
}
