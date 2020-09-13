package com.sunnyweather.android.logic.model;

import java.util.List;
import java.util.Objects;

public class PlaceResponse {
    String status;
    List<Place> places;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlaceResponse)) return false;
        PlaceResponse that = (PlaceResponse) o;
        return status.equals(that.status) &&
                places.equals(that.places);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, places);
    }

    @Override
    public String toString() {
        return "PlaceResponse{" +
                "status='" + status + '\'' +
                ", places=" + places +
                '}';
    }
}

class Place{
    String name;
    Location location;
    String formatted_address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Place)) return false;
        Place place = (Place) o;
        return name.equals(place.name) &&
                location.equals(place.location) &&
                formatted_address.equals(place.formatted_address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, formatted_address);
    }

    @Override
    public String toString() {
        return "Place{" +
                "name='" + name + '\'' +
                ", location=" + location +
                ", formatted_address='" + formatted_address + '\'' +
                '}';
    }
}

class Location{
    String lng;
    String lat;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return lng.equals(location.lng) &&
                lat.equals(location.lat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lng, lat);
    }

    @Override
    public String toString() {
        return "Location{" +
                "lng='" + lng + '\'' +
                ", lat='" + lat + '\'' +
                '}';
    }
}
