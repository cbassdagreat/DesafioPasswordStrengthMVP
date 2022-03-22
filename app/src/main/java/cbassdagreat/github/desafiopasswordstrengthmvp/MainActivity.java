package cbassdagreat.github.desafiopasswordstrengthmvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Collections;

import cbassdagreat.github.desafiopasswordstrengthmvp.databinding.ActivityMainBinding;
import cbassdagreat.github.desafiopasswordstrengthmvp.presenter.MVP;
import cbassdagreat.github.desafiopasswordstrengthmvp.presenter.MainPresenterImpl;

public class MainActivity extends AppCompatActivity implements MVP {
    private ActivityMainBinding binding;
    private MainPresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        binding.setLifecycleOwner(this);

    }

    public void analysis() {

    }

    @Override
    public void verify() {

    }
}