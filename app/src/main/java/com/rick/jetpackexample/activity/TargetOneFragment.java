package com.rick.jetpackexample.activity;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rick.jetpackexample.R;
import com.rick.jetpackexample.databinding.FragmentTargetOneBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TargetOneFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TargetOneFragment extends Fragment {

    FragmentTargetOneBinding mBinding;

    public interface TargetOneFragmentClickListener {
        public void tvFragmentTwoClicked();
    }

    public TargetOneFragmentClickListener listener;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TargetOneFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TargetOneFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TargetOneFragment newInstance(String param1, String param2) {
        TargetOneFragment fragment = new TargetOneFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.e("Life Circle", "FragmentOne ----------------------------- onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Life Circle", "FragmentOne ----------------------------- onCreate");
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.e("Life Circle", "FragmentOne ----------------------------- onCreateView");
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_target_one, container, false);
        mBinding.tvTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.tvFragmentTwoClicked();
                }
            }
        });
        return mBinding.getRoot();
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("Life Circle", "FragmentOne ----------------------------- onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("Life Circle", "FragmentOne ----------------------------- onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Life Circle", "FragmentOne ----------------------------- onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Life Circle", "FragmentOne ----------------------------- onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("Life Circle", "FragmentOne ----------------------------- onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("Life Circle", "FragmentOne ----------------------------- onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Life Circle", "FragmentOne ----------------------------- onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("Life Circle", "FragmentOne ----------------------------- onDetach");
    }
}
