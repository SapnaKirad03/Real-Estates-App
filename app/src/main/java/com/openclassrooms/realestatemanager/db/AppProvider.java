package com.openclassrooms.realestatemanager.db;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class AppProvider extends ContentProvider {
    private Context context;

    @Override
    public boolean onCreate() {
        this.context = getContext();
        return false;
    }

    @androidx.annotation.Nullable
    @Override
    public Cursor query(@androidx.annotation.NonNull Uri uri,
                        @androidx.annotation.Nullable String[] projection,
                        @androidx.annotation.Nullable String selection,
                        @androidx.annotation.Nullable String[] selectionArgs,
                        @androidx.annotation.Nullable String sortOrder) {
        return RoomDB.getInstance(context).getDao().getRealEstateWithCursor();
    }

    @androidx.annotation.Nullable
    @Override
    public String getType(@androidx.annotation.NonNull Uri uri) {
        return null;
    }

    @androidx.annotation.Nullable
    @Override
    public Uri insert(@androidx.annotation.NonNull Uri uri,
                      @androidx.annotation.Nullable ContentValues values) {
        return null;
    }

    @Override
    public int delete(@androidx.annotation.NonNull Uri uri,
                      @androidx.annotation.Nullable String selection,
                      @androidx.annotation.Nullable String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(@androidx.annotation.NonNull Uri uri,
                      @androidx.annotation.Nullable ContentValues values,
                      @androidx.annotation.Nullable String selection,
                      @androidx.annotation.Nullable String[] selectionArgs) {
        return 0;
    }
}
