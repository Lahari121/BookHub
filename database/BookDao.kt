package com.android.bookhub.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BookDao {
    @Insert
    fun insertBook(bookEntity: BookEntity)

    @Delete
    fun deleteBook(bookEntity: BookEntity)

    @Query("Select * FROM book")
    fun getAllBooks():List<BookEntity>

    @Query("Select * FROM book WHERE book_id= :bookId")
    fun getBookById(bookId:String):BookEntity
}
