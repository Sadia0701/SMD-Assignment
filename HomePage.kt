package com.example.booknest

class HomePage {
    // HomePage.kt
    @Composable
    fun HomePage(navController: NavController) {
        // Dummy book data
        val books = listOf(
            Book("Book 1", "Author 1", "Description 1"),
            Book("Book 2", "Author 2", "Description 2"),
            // Add more books as needed
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // List of books
            LazyColumn {
                items(books) { book ->
                    BookItem(book = book, onItemClick = {
                        // Navigate to book detail screen
                        navController.navigate(Screen.BookDetail.route)
                    })
                }
            }
        }
    }

}