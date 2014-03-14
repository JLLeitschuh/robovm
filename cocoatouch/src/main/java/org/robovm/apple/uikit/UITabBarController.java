/*
 * Copyright (C) 2014 Trillian AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.uikit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITabBarController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*/implements UITabBarDelegate/*</implements>*/ {

    /*<ptr>*/public static class UITabBarControllerPtr extends Ptr<UITabBarController, UITabBarControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITabBarController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UITabBarController() {}
    protected UITabBarController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "viewControllers")
    public native NSArray<?> getViewControllers();
    @Property(selector = "setViewControllers:")
    public native void setViewControllers(NSArray<?> v);
    @Property(selector = "selectedViewController")
    public native UIViewController getSelectedViewController();
    @Property(selector = "setSelectedViewController:")
    public native void setSelectedViewController(UIViewController v);
    @Property(selector = "selectedIndex")
    public native @MachineSizedUInt long getSelectedIndex();
    @Property(selector = "setSelectedIndex:")
    public native void setSelectedIndex(@MachineSizedUInt long v);
    @Property(selector = "moreNavigationController")
    public native UINavigationController getMoreNavigationController();
    @Property(selector = "customizableViewControllers")
    public native NSArray<?> getCustomizableViewControllers();
    @Property(selector = "setCustomizableViewControllers:")
    public native void setCustomizableViewControllers(NSArray<?> v);
    @Property(selector = "tabBar")
    public native UITabBar getTabBar();
    @Property(selector = "delegate")
    public native UITabBarControllerDelegate getDelegate();
    @Property(selector = "setDelegate:")
    public native void setDelegate(UITabBarControllerDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setViewControllers:animated:")
    public native void setViewControllers$animated$(NSArray<?> viewControllers, boolean animated);
    @Method(selector = "tabBar:didSelectItem:")
    public native void didSelectItem(UITabBar tabBar, UITabBarItem item);
    @Method(selector = "tabBar:willBeginCustomizingItems:")
    public native void willBeginCustomizingItems(UITabBar tabBar, NSArray<?> items);
    @Method(selector = "tabBar:didBeginCustomizingItems:")
    public native void didBeginCustomizingItems(UITabBar tabBar, NSArray<?> items);
    @Method(selector = "tabBar:willEndCustomizingItems:changed:")
    public native void willEndCustomizingItems(UITabBar tabBar, NSArray<?> items, boolean changed);
    @Method(selector = "tabBar:didEndCustomizingItems:changed:")
    public native void didEndCustomizingItems(UITabBar tabBar, NSArray<?> items, boolean changed);
    /*</methods>*/
}