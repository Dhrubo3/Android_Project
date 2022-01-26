package com.dhrubo.myappbanner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {


    private RecyclerView categoryRecycleView;
    private CategoryAdapter categoryAdapter;

    ///////////////

    private ViewPager bannersliderViewPager;
    private List<SliderModel>sliderModelList;
    ///////////////



    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.home_fargment,container, false);

        categoryRecycleView = view.findViewById(R.id.category_recyclerview());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        categoryRecycleView.setLayoutManager(layoutManager);

        final List<CategoryModel>categoryModelList = new ArrayList<~>();
        categoryModelList.add(new CategoryModel("links","Home"));
        categoryModelList.add(new CategoryModel("links","Electronics"));
        categoryModelList.add(new CategoryModel("links","Appliances"));
        categoryModelList.add(new CategoryModel("links","Furniture"));
        categoryModelList.add(new CategoryModel("links","Fashion"));
        categoryModelList.add(new CategoryModel("links","Toys"));
        categoryModelList.add(new CategoryModel("links","sports"));
        categoryModelList.add(new CategoryModel("links","Wall Arts"));
        categoryModelList.add(new CategoryModel("links","Books"));
        categoryModelList.add(new CategoryModel("links","Shoes"));

        categoryAdapter = new CategoryAdapter(categoryModelList);
        categoryRecycleView.setAdapter(categoryAdapter);
        categoryAdapter.notifyDatasetChanged();




        bannersliderViewPager = view.findViewById(R.id.banner_slide_view_pager);

        sliderModelList = new ArrayList<sliderModel>();
        sliderModelList.add(new sliderModel(R.mipmap.home_icon));
        sliderModelList.add(new sliderModel(R.mipmap.custom_error_icon));


        sliderModelList.add(new sliderModel(R.mipmap.green_email));
        sliderModelList.add(new sliderModel(R.mipmap.red_email));


        sliderModelList.add(new sliderModel(R.mipmap.app_icon));
        sliderModelList.add(new sliderModel(R.mipmap.ic_launcher));
        sliderModelList.add(new sliderModel(R.mipmap.cart_black));
        sliderModelList.add(new sliderModel(R.mipmap.profile_placeholder));
        sliderModelList.add(new sliderModel(R.mipmap.home_icon));
        sliderModelList.add(new sliderModel(R.mipmap.custom_error_icon));

        sliderModelList.add(new sliderModel(R.mipmap.green_email));
        sliderModelList.add(new sliderModel(R.mipmap.red_email));


        SliderAdapter sliderAdapter = new SliderAdapter(sliderModelList);
        bannersliderViewPager.setClipToPadding(false);
        bannersliderViewPager.setPageMargin(20);


        return view;
    }


}
