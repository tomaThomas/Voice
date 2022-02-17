package voice.bookOverview

sealed class BookOverviewState {

  data class Content(
    val playing: Boolean,
    val currentBookPresent: Boolean,
    val categoriesWithContents: Map<BookOverviewCategory, BookOverviewCategoryContent>,
    val columnCount: Int
  ) : BookOverviewState() {

    val useGrid = columnCount > 1
  }

  object Loading : BookOverviewState()

  object NoFolderSet : BookOverviewState()
}

data class BookOverviewCategoryContent(
  val books: List<BookOverviewViewState>,
)