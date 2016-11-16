package com.example.gryazin.rsswidget.data;

import com.example.gryazin.rsswidget.domain.FeedItem;
import com.example.gryazin.rsswidget.domain.RssSettings;

import java.util.Collection;
import java.util.Map;
import java.util.SortedSet;

/**
 * Created by Zver on 15.11.2016.
 */

public interface Repository {
    public SortedSet<? extends FeedItem> getAllFeedsByWidgetId(int widgetId);
    public Collection<? extends RssSettings> getAllSettings();
    public Long getUpdateTimestamp();

    /*TODO PLAN
    transfer object - to view model
    position keeper - make view state for each id

            MAKE IT BY STEPS!
    1. Settings Activity refactor.
        - only one setting
        - verify setting
        - SAVE SETTINGS
        - make results
        - run services
    2.  Make RenderService working on fake REPO
        - fake Repo by odd id
        - read settings
        - read from repo
        - ENABLE dagger
        - render! - CHECK HERE
    3.  Enable ViewState
        - add buttons and rendering
        - save view state
        - read view state on buttons click
        - re-render on button clicks - CHECK HERE
    4.  Make Alarms
        -make alarms for rendering - see timestamp update.
    5.  Make NetworkService.
    6. Polish by notes... MB tests.

    */
}
