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
public class StudentInfoPage extends Page {

    public static final String NAME_DATA_KEY = "name";
    public static final String ADDRESS_DATA_KEY = "address";
    public static final String SCHOOL_DATA_KEY = "school";
    public static final String AGE_DATA_KEY = "age";
    public static final String BIRTH_DATE_DATA_KEY = "birth_date";
    public static final String PHONE_DATA_KEY = "phone";
    public static final String EMAIL_DATA_KEY = "email";


    public StudentInfoPage(ModelCallbacks callbacks, String title) {
        super(callbacks, title);
    }

    @Override
    public Fragment createFragment() {
        return StudentInfoFragment.create(getKey());
    }

    @Override
    public void getReviewItems(ArrayList<ReviewItem> dest) {
        dest.add(new ReviewItem("Student name", mData.getString(NAME_DATA_KEY), getKey(), -1));
        dest.add(new ReviewItem("Student email", mData.getString(EMAIL_DATA_KEY), getKey(), -1));
        dest.add(new ReviewItem("Student number", mData.getString(PHONE_DATA_KEY), getKey(), -1));
        dest.add(new ReviewItem("Student age", mData.getString(AGE_DATA_KEY), getKey(), -1));
        dest.add(new ReviewItem("Student birthdate", mData.getString(BIRTH_DATE_DATA_KEY), getKey(), -1));
        dest.add(new ReviewItem("Student school", mData.getString(SCHOOL_DATA_KEY), getKey(), -1));
        dest.add(new ReviewItem("Student address", mData.getString(ADDRESS_DATA_KEY), getKey(), -1));
    }

    @Override
    public boolean isCompleted() {
        return !TextUtils.isEmpty(mData.getString(NAME_DATA_KEY));
    }
}
