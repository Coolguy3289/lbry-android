package io.lbry.lbrynet.reactpackages;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import io.lbry.lbrynet.reactmodules.DownloadManagerModule;
import io.lbry.lbrynet.reactmodules.ScreenOrientationModule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LbryReactPackage implements ReactPackage {
    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();

        modules.add(new DownloadManagerModule(reactContext));
        modules.add(new ScreenOrientationModule(reactContext));
        
        return modules;
    }
}