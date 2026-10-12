
package com.example

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.TvType

class ExampleProvider : MainAPI() {
    override var mainUrl = "https://www.cinehype.sc/"
    override var name = "CineHype"
    override val supportedTypes = setOf(
        TvType.Movie,
        TvType.TvSeries
    )

    override var lang = "en"
    override val hasMainPage = false

    override suspend fun search(query: String): List<SearchResponse> {
        // Search implementation will be added after
        // confirming a permitted metadata source.
        return emptyList()
    }
}
