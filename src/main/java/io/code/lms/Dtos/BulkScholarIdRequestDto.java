package io.code.lms.Dtos;

import com.google.gson.Gson;

import java.util.List;

public class BulkScholarIdRequestDto {

    private List<Integer>scholarIds;

    public List<Integer> getScholarIds() {
        return scholarIds;
    }

    public void setScholarIds(List<Integer> scholarIds) {
        this.scholarIds = scholarIds;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
