package cbassdagreat.github.desafiopasswordstrengthmvp.presenter;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import cbassdagreat.github.desafiopasswordstrengthmvp.modelo.Password;
import cbassdagreat.github.desafiopasswordstrengthmvp.modelo.Verify;

public class MainPresenterImpl implements MainPresenter {

    private Password password;
    private MVP view;

    public MainPresenterImpl(MVP view) {
        this.view = view;
    }


    @Override
    public int verify(String password, int Color) {

            int total = 0;

            if (hasNum(password)) {
                total++;
            }
            if (hasCaps(password)) {
                total++;
            }
            if (hasLength(password)) {
                total++;
            }
            return total;
        }


        private boolean hasCaps (String password)
        {
            //int total= 0;
            for (char letra : password.toCharArray()) {
                if (Character.isUpperCase(letra)) {
                    return true;
                    //      total++;
                }
                // else
                // {
                //     break;
                // }
            }
            return false; //total == pass.length();
        }

        public boolean hasNum (String password){

            //int total = 0;

            for (char letra : password.toCharArray()) {
                if (Character.isDigit(letra)) {
                    return true;
                    //      total++;
                }

                // else
                // {
                //     break;
                // }
            }
            return false;//total == pass.length();

        }

        public boolean hasLength (String password){
            if (password.length() >= 5) {
                return true;
            } else {
                return false;
            }

        }
    }
