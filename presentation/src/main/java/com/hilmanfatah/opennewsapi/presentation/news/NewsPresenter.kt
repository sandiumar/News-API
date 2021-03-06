package com.hilmanfatah.opennewsapi.presentation.news

import com.hilmanfatah.domain.model.NewsItem
import io.reactivex.Flowable

/**
 * Created by hilmanfatah on 24/01/18.
 */
interface NewsPresenter {

    fun getArticles(source: String)
            : Flowable<List<NewsItem>?>


}