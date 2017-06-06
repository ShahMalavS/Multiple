package com.malav.multiplepageregistration;

import android.content.Context;

import com.malav.multiplepageregistration.pages.BrotherInfoPage;
import com.malav.multiplepageregistration.pages.FatherInfoPage;
import com.malav.multiplepageregistration.pages.MotherInfoPage;
import com.malav.multiplepageregistration.pages.SisterInfoPage;
import com.malav.multiplepageregistration.pages.StudentInfoPage;
import com.tech.freak.wizardpager.model.AbstractWizardModel;
import com.tech.freak.wizardpager.model.PageList;

/**
 * Created by malav on 01-05-2016.
 */
public class RegistrationModal extends AbstractWizardModel {
    public RegistrationModal(Context context) {
        super(context);
    }

    @Override
    protected PageList onNewRootPageList() {
        return new PageList(new StudentInfoPage(this, "Student Information").setRequired(true),
                new FatherInfoPage(this, "Father Information"),
                new MotherInfoPage(this, "Mother Information"),
                new BrotherInfoPage(this, "Brother Information"),
                new SisterInfoPage(this, "Sister Information"));
    }
}
