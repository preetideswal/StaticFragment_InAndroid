package com.example.staticfragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.*;
public class Staticfragment extends Fragment {
   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.staticfragment, parent, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
    }
}