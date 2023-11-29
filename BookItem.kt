package com.example.booknest

class BookItem {
    // BookItem.kt
    @Composable
    fun BookItem(book: Book, onItemClick: () -> Unit) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = onItemClick)
                .padding(8.dp)
        ) {
            // Book title
            Text(
                text = book.title,
                style = typography.h6,
                fontWeight = FontWeight.Bold
            )

            // Author
            Text(
                text = "By ${book.author}",
                style = typography.body2,
                color = Color.Gray
            )

            // Description
            Text(
                text = book.description,
                style = typography.body2,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}