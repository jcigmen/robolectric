package com.xtremelabs.robolectric.shadows;

import com.google.android.maps.GeoPoint;
import com.xtremelabs.robolectric.util.Implementation;
import com.xtremelabs.robolectric.util.Implements;

import static com.xtremelabs.robolectric.Robolectric.shadowOf_;
import static com.xtremelabs.robolectric.shadows.ShadowMapView.fromE6;

@SuppressWarnings({"UnusedDeclaration"})
@Implements(GeoPoint.class)
public class ShadowGeoPoint {
    private int lat;
    private int lng;

    public void __constructor__(int lat, int lng) {
        this.lat = lat;
        this.lng = lng;
    }

    @Implementation
    public int getLatitudeE6() {
        return lat;
    }

    @Implementation
    public int getLongitudeE6() {
        return lng;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        o = shadowOf_(o);
        if (o == null) return false;
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;

        ShadowGeoPoint that = (ShadowGeoPoint) o;

        if (lat != that.lat) return false;
        if (lng != that.lng) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lat;
        result = 31 * result + lng;
        return result;
    }

    @Override public String toString() {
        return "ShadowGeoPoint{" +
                "lat=" + fromE6(lat) +
                ", lng=" + fromE6(lng) +
                '}';
    }

    public int getLat() {
        return lat;
    }

    public int getLng() {
        return lng;
    }
}
