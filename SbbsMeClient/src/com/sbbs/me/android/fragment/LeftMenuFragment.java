package com.sbbs.me.android.fragment;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.rarnu.devlib.base.BaseFragment;
import com.rarnu.utils.ResourceUtils;
import com.sbbs.me.android.R;

public class LeftMenuFragment extends BaseFragment {

	ListView lvMenu, lvExit;
	TextView tvLeftTitle;
	ImageView ivLogo;
	
	List<String> listMenu, listExit;
	ArrayAdapter<String> adapterMenu, adapterExit;
	
	public LeftMenuFragment() {
		super();
		tagText = ResourceUtils.getString(R.tag.tag_menu_left);
	}

	@Override
	public int getBarTitle() {
		return R.string.app_name;
	}

	@Override
	public int getBarTitleWithPath() {
		return R.string.app_name;
	}

	@Override
	public String getCustomTitle() {
		return null;
	}

	@Override
	public void initComponents() {
		lvMenu = (ListView) innerView.findViewById(R.id.lvMenu);
		lvExit = (ListView) innerView.findViewById(R.id.lvExit);
		tvLeftTitle = (TextView) innerView.findViewById(R.id.tvLeftTitle);
		ivLogo = (ImageView) innerView.findViewById(R.id.ivLogo);

		listMenu = new ArrayList<String>();
		listMenu.add(getString(R.string.lm_home));
		listMenu.add(getString(R.string.lm_postnew));
		listMenu.add(getString(R.string.lm_recent));
		listMenu.add(getString(R.string.lm_hottags));
		listMenu.add(getString(R.string.lm_ongithub));
		listExit = new ArrayList<String>();
		listExit.add(getString(R.string.lm_exit));
		adapterMenu = new ArrayAdapter<String>(getActivity(),
				R.layout.item_menu, listMenu);
		adapterExit = new ArrayAdapter<String>(getActivity(),
				R.layout.item_menu, listExit);
		lvMenu.setAdapter(adapterMenu);
		lvExit.setAdapter(adapterExit);
	}

	@Override
	public void initEvents() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initLogic() {
		// TODO Auto-generated method stub

	}

	@Override
	public int getFragmentLayoutResId() {
		return R.layout.menu_left;
	}

	@Override
	public String getMainActivityName() {
		return "";
	}

	@Override
	public void initMenu(Menu menu) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onGetNewArguments(Bundle bn) {
		// TODO Auto-generated method stub

	}

	@Override
	public Bundle getFragmentState() {
		// TODO Auto-generated method stub
		return null;
	}

}
