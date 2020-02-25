package com.example.mytextfour;

import androidx.databinding.ObservableField;

public class DataBean {
    private ObservableField<String> name;
    private ObservableField<String> detail;
    public DataBean (ObservableField<String> name,ObservableField<String> detail) {
        this.detail = detail;
        this.name = name;
    }

    public ObservableField<String> getDetail() {
        return detail;
    }

    public ObservableField<String> getName() {
        return name;
    }
}
