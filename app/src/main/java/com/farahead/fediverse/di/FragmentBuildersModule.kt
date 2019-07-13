/* Copyright 2018 charlag
 *
 * This file is a part of Tusky.
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation; either version 3 of the
 * License, or (at your option) any later version.
 *
 * Tusky is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with Tusky; if not,
 * see <http://www.gnu.org/licenses>. */


package com.farahead.fediverse.di

import com.farahead.fediverse.AccountsInListFragment
import com.farahead.fediverse.components.conversation.ConversationsFragment
import com.farahead.fediverse.components.instancemute.fragment.InstanceListFragment
import com.farahead.fediverse.fragment.*
import com.farahead.fediverse.fragment.preference.AccountPreferencesFragment
import com.farahead.fediverse.fragment.preference.NotificationPreferencesFragment
import com.farahead.fediverse.components.report.fragments.ReportDoneFragment
import com.farahead.fediverse.components.report.fragments.ReportNoteFragment
import com.farahead.fediverse.components.report.fragments.ReportStatusesFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by charlag on 3/24/18.
 */

@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun accountListFragment(): AccountListFragment

    @ContributesAndroidInjector
    abstract fun accountMediaFragment(): AccountMediaFragment

    @ContributesAndroidInjector
    abstract fun viewThreadFragment(): ViewThreadFragment

    @ContributesAndroidInjector
    abstract fun timelineFragment(): TimelineFragment

    @ContributesAndroidInjector
    abstract fun notificationsFragment(): NotificationsFragment

    @ContributesAndroidInjector
    abstract fun searchFragment(): SearchFragment

    @ContributesAndroidInjector
    abstract fun notificationPreferencesFragment(): NotificationPreferencesFragment

    @ContributesAndroidInjector
    abstract fun accountPreferencesFragment(): AccountPreferencesFragment

    @ContributesAndroidInjector
    abstract fun directMessagesPreferencesFragment(): ConversationsFragment

    @ContributesAndroidInjector
    abstract fun accountInListsFragment(): AccountsInListFragment

    @ContributesAndroidInjector
    abstract fun reportStatusesFragment(): ReportStatusesFragment

    @ContributesAndroidInjector
    abstract fun reportNoteFragment(): ReportNoteFragment

    @ContributesAndroidInjector
    abstract fun reportDoneFragment(): ReportDoneFragment

    @ContributesAndroidInjector
    abstract fun instanceListFragment(): InstanceListFragment
}
