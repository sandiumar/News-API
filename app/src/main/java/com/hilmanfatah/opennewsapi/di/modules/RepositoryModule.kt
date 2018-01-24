package com.hilmanfatah.opennewsapi.di.modules

import com.hilmanfatah.opennewsapi.domain.repository.ArticleRepository
import com.hilmanfatah.opennewsapi.domain.repository.SourceRepository
import com.hilmanfatah.opennewsapi.storage.repository.ArticleRepositoryImpl
import com.hilmanfatah.opennewsapi.storage.repository.SourceRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by hilmanfatah on 24/01/18.
 */
@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun providesSourceRepo(sourceRepository: SourceRepositoryImpl): SourceRepository = sourceRepository

    @Provides
    @Singleton
    fun providesArticleRepo(articleRepositoryImpl: ArticleRepositoryImpl): ArticleRepository = articleRepositoryImpl

}