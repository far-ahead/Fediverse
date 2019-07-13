package com.farahead.fediverse.di

import com.google.gson.Gson
import com.farahead.fediverse.db.AccountManager
import com.farahead.fediverse.db.AppDatabase
import com.farahead.fediverse.network.MastodonApi
import com.farahead.fediverse.repository.TimelineRepository
import com.farahead.fediverse.repository.TimelineRepositoryImpl
import com.farahead.fediverse.util.HtmlConverter
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {
    @Provides
    fun providesTimelineRepository(db: AppDatabase, mastodonApi: MastodonApi,
                                   accountManager: AccountManager, gson: Gson,
                                   htmlConverter: HtmlConverter): TimelineRepository {
        return TimelineRepositoryImpl(db.timelineDao(), mastodonApi, accountManager, gson,
                htmlConverter)
    }
}