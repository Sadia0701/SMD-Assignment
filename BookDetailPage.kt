package com.example.booknest

class BookDetailPage {
    // BookDetailPage.kt
    @Composable
    fun BookDetailPage(navController: NavController) {
        // TODO: Implement book detail screen
        // You can retrieve the selected book from the navigation arguments
    }
    @Composable
    fun BookDetailPage(navController: NavController, book: Book) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Book title
            Text(
                text = book.title,
                style = typography.h4,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Author
            Text(
                text = "By ${book.author}",
                style = typography.body2,
                color = Color.Gray,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Description
            Text(
                text = book.description,
                style = typography.body2,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Add more details about the book as needed

            // Back button
            Button(
                onClick = {
                    navController.popBackStack()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                Text("Back to Home")
            }
        }
    }
}
