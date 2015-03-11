package agiledragons.map_try2;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.Menu;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


import com.google.android.gms.maps.MapFragment;

import com.google.android.gms.maps.model.Marker;

import com.google.android.gms.maps.CameraUpdateFactory;



public class MapsActivity extends FragmentActivity {
    static final LatLng ALGONQUIN = new LatLng(45.3469, -75.7594);
    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
                .getMap();
        Marker hamburg = map.addMarker(new MarkerOptions().position(ALGONQUIN)
                .title("Algonquin College"));

        // Move the camera instantly to hamburg with a zoom of 15.
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(ALGONQUIN, 15));

        // Zoom in, animating the camera.
        map.animateCamera(CameraUpdateFactory.zoomTo(16), 2000, null);
    }


}