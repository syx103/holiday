package com.example.databiningtexttwo;

import androidx.databinding.ObservableField;
import androidx.databinding.ObservableFloat;

public class OGood {
    private ObservableField<String> name;
    private ObservableField<String> detail;
    private ObservableFloat pirce;
    public OGood(String name,String detail,float pirce) {
        this.detail = new ObservableField<>(detail);
        this.name = new ObservableField<>(name);
        this.pirce = new ObservableFloat(pirce);
    }

    public ObservableField<String> getName() {
        return name;
    }

    public ObservableField<String> getDetail() {
        return detail;
    }

    public ObservableFloat getPirce() {
        return pirce;
    }
}
