package com.malav.multiplepageregistration.pages;

import android.support.v4.app.Fragment;
import android.text.TextUtils;

import com.tech.freak.wizardpager.model.ModelCallbacks;
import com.tech.freak.wizardpager.model.Page;
import com.tech.freak.wizardpager.model.ReviewItem;

import java.util.ArrayList;

/**
 * Created by malav on 01-05-2016.
 */
public class FatherInfoPage extends Page {

    public static final String NAME_DATA_KEY = "name";
    public static final String PHONE_DATA_KEY = "phone";
    public static final String EMAIL_DATA_KEY = "email";

    public FatherInfoPage(ModelCallbacks callbacks, String title) {
        super(callbacks, title);
    }

    @Override
    public Fragment createFragment() {
        return FatherInfoFragment.create(getKey());
    }

    @Override
    public void getReviewItems(ArrayList<ReviewItem> dest) {
        dest.add(new ReviewItem("Father's name", mData.getString(NAME_DATA_KEY), getKey(), -1));
        dest.add(new ReviewItem("Father's email", mData.getString(EMAIL_DATA_KEY), getKey(), -1));
        dest.add(new ReviewItem("Father's number", mData.getString(PHONE_DATA_KEY), getKey(), -1));
    }

    @Override
    public boolean isCompleted() {
        return !TextUtils.isEmpty(mData.getString(NAME_DATA_KEY));
    }
}