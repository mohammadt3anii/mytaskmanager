package com.dogar.mytaskmanager.di.component;

import android.content.Context;

import com.dogar.mytaskmanager.di.module.AppModule;
import com.dogar.mytaskmanager.di.module.ListAppModule;
import com.dogar.mytaskmanager.fragment.AppListFragment;
import com.dogar.mytaskmanager.mvp.AppListPresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
		AppModule.class,
})
public interface AppComponent extends MainGraph {
	void inject(AppListPresenter presenter);
}