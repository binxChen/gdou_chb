package gdou.gdou_chb.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import gdou.gdou_chb.R;
import gdou.gdou_chb.contract.UserCenterContract;
import gdou.gdou_chb.util.MVP.BaseFragment;

/**
 * Created by Z1shiki on 2016/11/16.
 */

public class UserCenterFragment extends BaseFragment implements UserCenterContract.View {

    private UserCenterContract.Presenter mPresenter;

    public UserCenterFragment() { //Requires empty public constructor
    }

    public static UserCenterFragment newInstanceState() {
        return new UserCenterFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.subscribe();
    }

    @Override
    public void onPause() {
        super.onPause();
        mPresenter.unsubscribe();
    }

    @Override
    public void setPresenter(@NonNull UserCenterContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.usercenter_frag, container, false);



        //setup
        ButterKnife.bind(this, root);



        return root;
    }


}