package com.ohgiraffers.semi_project;

public class MapDTO {
    private String placeName;
    private LocalDate startDate;
    private LocalDate endDate;

    public MapDTO() {
    }

    public MapDTO(String placeName, LocalDate startDate, LocalDate endDate) {
        this.placeName = placeName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "MapDTO{" +
                "placeName='" + placeName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}