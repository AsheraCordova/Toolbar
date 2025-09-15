package com.ashera.toolbar;
//start - imports
import java.util.*;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.*;
import android.widget.*;
import android.view.View.*;

import com.ashera.widget.BaseHasWidgets;

import android.annotation.SuppressLint;

import com.ashera.core.IFragment;
import com.ashera.widget.bus.*;
import com.ashera.converter.*;
import com.ashera.widget.bus.Event.*;
import com.ashera.widget.*;
import com.ashera.widget.IWidgetLifeCycleListener.*;
import com.ashera.layout.*;

import android.graphics.Canvas;
import android.widget.*;
import androidx.core.view.*;
import android.view.*;

import static com.ashera.widget.IWidget.*;
//end - imports

import androidx.appcompat.widget.Toolbar;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.badge.BadgeDrawable;
import java.util.Map.Entry;

@SuppressLint("NewApi")
public class ToolbarImpl extends BaseHasWidgets {
	//start - body
	public final static String LOCAL_NAME = "androidx.appcompat.widget.Toolbar"; 
	public final static String GROUP_NAME = "androidx.appcompat.widget.Toolbar";
	private androidx.appcompat.widget.Toolbar toolbar;
	

	
	@Override
	public void loadAttributes(String localName) {
		ViewGroupImpl.register(localName);

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeNumbers").withType("array").withArrayType("int").withOrder(10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("menuItemIds").withType("array").withArrayType("id").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeBackgroundColors").withType("array").withArrayType("color").withOrder(10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeTextColors").withType("array").withArrayType("color").withOrder(10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeAlphas").withType("array").withArrayType("int").withOrder(10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeMaxCharacterCounts").withType("array").withArrayType("int").withOrder(10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeGravities").withType("array").withArrayType("gravity").withOrder(10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeHorizontalOffsets").withType("array").withArrayType("dimension").withOrder(10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeVerticalOffsets").withType("array").withArrayType("dimension").withOrder(10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeIsVisibles").withType("array").withArrayType("boolean").withOrder(10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeTextAppearanceResources").withType("array").withArrayType("style").withOrder(10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("title").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("subtitle").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("gravity").withType("gravity").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("titleMargin").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("titleMarginStart").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("titleMarginEnd").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("titleMarginTop").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("titleMarginBottom").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("titleMargins").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("contentInsetStart").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("contentInsetEnd").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("contentInsetLeft").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("contentInsetRight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("contentInsetStartWithNavigation").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("contentInsetEndWithActions").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxButtonHeight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("buttonGravity").withType("gravity").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("collapseIcon").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("collapseContentDescription").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("navigationIcon").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("navigationContentDescription").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("logo").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("logoDescription").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("titleTextColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("subtitleTextColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("menu").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onNavigationIconClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("overflowIcon").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onMenuItemClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("actionLayoutEventIds").withType("array").withArrayType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("searchview_attributes").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onQueryTextSubmit").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onQueryTextChange").withType("string"));
	
	loadCustomAttributes(localName);
	}
	
	public ToolbarImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  ToolbarImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  ToolbarImpl(String groupName, String localname) {
		super(groupName, localname);
	}

	@Override
	public IWidget newInstance() {
		return new ToolbarImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
Context context = (Context) fragment.getRootActivity();
	Object systemStyle = params.get("systemStyle");
	Object systemAndroidAttrStyle = params.get("systemAndroidAttrStyle");
	
	if (systemStyle == null && systemAndroidAttrStyle == null) {
		toolbar = new ToolbarExt(context);
	} else {
		int defStyleAttr = 0;
		int defStyleRes = 0;
		
		if (systemStyle != null) {
			defStyleRes = context.getResources().getIdentifier((String) systemStyle, "style", context.getPackageName());	
		}
		
		if (systemAndroidAttrStyle != null) {
			defStyleAttr = context.getResources().getIdentifier((String) systemAndroidAttrStyle, "attr", "android");	
		}
		
		if (defStyleRes == 0) {
			toolbar = new ToolbarExt(context, null, defStyleAttr);	
		} else {
		}
		
	}

		
		nativeCreate(params);
		
		
		ViewGroupImpl.registerCommandConveter(this);

	}

	@Override
	public Object asWidget() {
		return toolbar;
	}

	@Override
	public boolean remove(IWidget w) {
		boolean remove = super.remove(w);
		toolbar.removeView((View) w.asWidget());
		return remove;
	}
	
	@Override
    public boolean remove(int index) {
		IWidget widget = widgets.get(index);
        boolean remove = super.remove(index);

        if (index + 1 <= toolbar.getChildCount()) {
            toolbar.removeViewAt(index);
        }    
        return remove;
    }

	
	@Override
	public void add(IWidget w, int index) {
		if (index != -2) {
			View view = (View) w.asWidget();
			createLayoutParams(view);
			    if (index == -1) {
			        toolbar.addView(view);
			    } else {
			        toolbar.addView(view, index);
			    }
		}
		
		ViewGroupImpl.nativeAddView(asNativeWidget(), w.asNativeWidget());
		super.add(w, index);
	}
	
	private void createLayoutParams(View view) {
		androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) view.getLayoutParams();
		
		layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) view.getLayoutParams();
		if (layoutParams == null) {
			layoutParams = new androidx.appcompat.widget.Toolbar.LayoutParams(-2, -2);
			view.setLayoutParams(layoutParams);
		}  else {
			layoutParams.height = -2;
			layoutParams.width = -2;
		}
	}
	
	private androidx.appcompat.widget.Toolbar.LayoutParams getLayoutParams(View view) {
		return (androidx.appcompat.widget.Toolbar.LayoutParams) view.getLayoutParams();		
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setChildAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue) {
		View view = (View) w.asWidget();
		androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = getLayoutParams(view);
		ViewGroupImpl.setChildAttribute(w, key, objValue, layoutParams);		
		
		switch (key.getAttributeName()) {
		case "layout_width":
			layoutParams.width = (int) objValue;
			break;	
		case "layout_height":
			layoutParams.height = (int) objValue;
			break;
		default:
			break;
		}
		
		
		view.setLayoutParams(layoutParams);		
	}
	
	@SuppressLint("NewApi")
	@Override
	public Object getChildAttribute(IWidget w, WidgetAttribute key) {
		Object attributeValue = ViewGroupImpl.getChildAttribute(w, key);		
		if (attributeValue != null) {
			return attributeValue;
		}
		View view = (View) w.asWidget();
		androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = getLayoutParams(view);

		switch (key.getAttributeName()) {
		case "layout_width":
			return layoutParams.width;
		case "layout_height":
			return layoutParams.height;
		}
		
		return null;

	}
	
		
	public class ToolbarExt extends androidx.appcompat.widget.Toolbar implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		
		public IWidget getWidget() {
			return ToolbarImpl.this;
		}
		private int mMaxWidth = -1;
		private int mMaxHeight = -1;
		@Override
		public void setMaxWidth(int width) {
			mMaxWidth = width;
		}
		@Override
		public void setMaxHeight(int height) {
			mMaxHeight = height;
		}
		@Override
		public int getMaxWidth() {
			return mMaxWidth;
		}
		@Override
		public int getMaxHeight() {
			return mMaxHeight;
		}

		public ToolbarExt(Context context, android.util.AttributeSet attrs, int defStyleAttr) {
	        super(context, attrs, defStyleAttr);
	    }

		public ToolbarExt(Context context) {
			super(context);
			
		}
		
		@Override
		public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

			if(mMaxWidth > 0) {
	        	widthMeasureSpec = MeasureSpec.makeMeasureSpec(mMaxWidth, MeasureSpec.AT_MOST);
	        }
	        if(mMaxHeight > 0) {
	            heightMeasureSpec = MeasureSpec.makeMeasureSpec(mMaxHeight, MeasureSpec.AT_MOST);

	        }

	        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
			IWidgetLifeCycleListener listener = (IWidgetLifeCycleListener) getListener();
			if (listener != null) {
			    measureFinished.setWidth(getMeasuredWidth());
			    measureFinished.setHeight(getMeasuredHeight());
				listener.eventOccurred(EventId.measureFinished, measureFinished);
			}
		}
		
		@Override
		protected void onLayout(boolean changed, int l, int t, int r, int b) {
			super.onLayout(changed, l, t, r, b);
			
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			
			replayBufferedEvents();
			
			IWidgetLifeCycleListener listener = (IWidgetLifeCycleListener) getListener();
			if (listener != null) {
				onLayoutEvent.setB(b);
				onLayoutEvent.setL(l);
				onLayoutEvent.setR(r);
				onLayoutEvent.setT(t);
				onLayoutEvent.setChanged(changed);
				listener.eventOccurred(EventId.onLayout, onLayoutEvent);
			}
			
			if (isInvalidateOnFrameChange() && isInitialised()) {
				ToolbarImpl.this.invalidate();
			}
		}	
		
		@Override
		public void onDraw(Canvas canvas) {
			Runnable runnable = () -> super.onDraw(canvas);
			executeMethodListeners("onDraw", runnable, canvas);
		}

		@Override
		public void draw(Canvas canvas) {
			Runnable runnable = () -> super.draw(canvas);
			executeMethodListeners("draw", runnable, canvas);
		}

		@SuppressLint("WrongCall")
		@Override
		public void execute(String method, Object... args) {
			switch (method) {
				case "onDraw":
					setOnMethodCalled(true);
					super.onDraw((Canvas) args[0]);
					break;

				case "draw":
					setOnMethodCalled(true);
					super.draw((Canvas) args[0]);
					break;

				default:
					break;
			}
		}

		public void updateMeasuredDimension(int width, int height) {
			setMeasuredDimension(width, height);
		}


		@Override
		public ILifeCycleDecorator newInstance(IWidget widget) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void setAttribute(WidgetAttribute widgetAttribute,
				String strValue, Object objValue) {
			throw new UnsupportedOperationException();
		}		
		

		@Override
		public List<String> getMethods() {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public void initialized() {
			throw new UnsupportedOperationException();
		}
		
        @Override
        public Object getAttribute(WidgetAttribute widgetAttribute) {
            throw new UnsupportedOperationException();
        }
        @Override
        public void drawableStateChanged() {
        	super.drawableStateChanged();
        	if (!isWidgetDisposed()) {
        		ViewImpl.drawableStateChanged(ToolbarImpl.this);
        	}
        }
        
    	public void setState0(float value) {
    		ViewImpl.setState(ToolbarImpl.this, 0, value);
    	}
    	public void setState0(int value) {
    		ViewImpl.setState(ToolbarImpl.this, 0, value);
    	}
    	public void setState0(double value) {
    		ViewImpl.setState(ToolbarImpl.this, 0, value);
    	}
    	
    	public void setState0(Float value) {
    		ViewImpl.setState(ToolbarImpl.this, 0, value);
    	}
    	public void setState0(Integer value) {
    		ViewImpl.setState(ToolbarImpl.this, 0, value);
    	}
    	public void setState0(Double value) {
    		ViewImpl.setState(ToolbarImpl.this, 0, value);
    	}
    	public void setState0(Object value) {
    		ViewImpl.setState(ToolbarImpl.this, 0, value);
    	}
    	public void setState1(float value) {
    		ViewImpl.setState(ToolbarImpl.this, 1, value);
    	}
    	public void setState1(int value) {
    		ViewImpl.setState(ToolbarImpl.this, 1, value);
    	}
    	public void setState1(double value) {
    		ViewImpl.setState(ToolbarImpl.this, 1, value);
    	}
    	
    	public void setState1(Float value) {
    		ViewImpl.setState(ToolbarImpl.this, 1, value);
    	}
    	public void setState1(Integer value) {
    		ViewImpl.setState(ToolbarImpl.this, 1, value);
    	}
    	public void setState1(Double value) {
    		ViewImpl.setState(ToolbarImpl.this, 1, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(ToolbarImpl.this, 1, value);
    	}
    	public void setState2(float value) {
    		ViewImpl.setState(ToolbarImpl.this, 2, value);
    	}
    	public void setState2(int value) {
    		ViewImpl.setState(ToolbarImpl.this, 2, value);
    	}
    	public void setState2(double value) {
    		ViewImpl.setState(ToolbarImpl.this, 2, value);
    	}
    	
    	public void setState2(Float value) {
    		ViewImpl.setState(ToolbarImpl.this, 2, value);
    	}
    	public void setState2(Integer value) {
    		ViewImpl.setState(ToolbarImpl.this, 2, value);
    	}
    	public void setState2(Double value) {
    		ViewImpl.setState(ToolbarImpl.this, 2, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(ToolbarImpl.this, 2, value);
    	}
    	public void setState3(float value) {
    		ViewImpl.setState(ToolbarImpl.this, 3, value);
    	}
    	public void setState3(int value) {
    		ViewImpl.setState(ToolbarImpl.this, 3, value);
    	}
    	public void setState3(double value) {
    		ViewImpl.setState(ToolbarImpl.this, 3, value);
    	}
    	
    	public void setState3(Float value) {
    		ViewImpl.setState(ToolbarImpl.this, 3, value);
    	}
    	public void setState3(Integer value) {
    		ViewImpl.setState(ToolbarImpl.this, 3, value);
    	}
    	public void setState3(Double value) {
    		ViewImpl.setState(ToolbarImpl.this, 3, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(ToolbarImpl.this, 3, value);
    	}
    	public void setState4(float value) {
    		ViewImpl.setState(ToolbarImpl.this, 4, value);
    	}
    	public void setState4(int value) {
    		ViewImpl.setState(ToolbarImpl.this, 4, value);
    	}
    	public void setState4(double value) {
    		ViewImpl.setState(ToolbarImpl.this, 4, value);
    	}
    	
    	public void setState4(Float value) {
    		ViewImpl.setState(ToolbarImpl.this, 4, value);
    	}
    	public void setState4(Integer value) {
    		ViewImpl.setState(ToolbarImpl.this, 4, value);
    	}
    	public void setState4(Double value) {
    		ViewImpl.setState(ToolbarImpl.this, 4, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(ToolbarImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(ToolbarImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(ToolbarImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(ToolbarImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(ToolbarImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(ToolbarImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(ToolbarImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(ToolbarImpl.this);
        }
     
	
	}
	@Override
	public Class getViewClass() {
		return ToolbarExt.class;
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
				ViewGroupImpl.setAttribute(this,  key, strValue, objValue, decorator);
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "badgeNumbers": {


		setBadgeNumbers(objValue);



			}
			break;
			case "menuItemIds": {


		setBadgeMenuItemIds(objValue);



			}
			break;
			case "badgeBackgroundColors": {


		setBadgeBackgroundColors(objValue);



			}
			break;
			case "badgeTextColors": {


		setBadgeTextColors(objValue);



			}
			break;
			case "badgeAlphas": {


		setBadgeAlphas(objValue);



			}
			break;
			case "badgeMaxCharacterCounts": {


		setBadgeMaxCharacterCounts(objValue);



			}
			break;
			case "badgeGravities": {


		setBadgeGravities(objValue);



			}
			break;
			case "badgeHorizontalOffsets": {


		setBadgeHorizontalOffsets(objValue);



			}
			break;
			case "badgeVerticalOffsets": {


		setBadgeVerticalOffsets(objValue);



			}
			break;
			case "badgeIsVisibles": {


		setBadgeIsVisibles(objValue);



			}
			break;
			case "badgeTextAppearanceResources": {


		setTextAppearanceResources(objValue);



			}
			break;
			case "title": {


	toolbar.setTitle((CharSequence)objValue);



			}
			break;
			case "subtitle": {


	toolbar.setSubtitle((CharSequence)objValue);



			}
			break;
			case "gravity": {


		setGravity(objValue);



			}
			break;
			case "titleMargin": {


		setTitleMargin(objValue);



			}
			break;
			case "titleMarginStart": {


	toolbar.setTitleMarginStart((int)objValue);



			}
			break;
			case "titleMarginEnd": {


	toolbar.setTitleMarginEnd((int)objValue);



			}
			break;
			case "titleMarginTop": {


	toolbar.setTitleMarginTop((int)objValue);



			}
			break;
			case "titleMarginBottom": {


	toolbar.setTitleMarginBottom((int)objValue);



			}
			break;
			case "titleMargins": {


		setTitleMargin(objValue);



			}
			break;
			case "contentInsetStart": {


		setContentInsetStart(objValue);



			}
			break;
			case "contentInsetEnd": {


		setContentInsetEnd(objValue);



			}
			break;
			case "contentInsetLeft": {


		setContentInsetStart(objValue);



			}
			break;
			case "contentInsetRight": {


		setContentInsetEnd(objValue);



			}
			break;
			case "contentInsetStartWithNavigation": {


	toolbar.setContentInsetStartWithNavigation((int)objValue);



			}
			break;
			case "contentInsetEndWithActions": {


	toolbar.setContentInsetEndWithActions((int)objValue);



			}
			break;
			case "maxButtonHeight": {


		setMaxButtonHeight(objValue);



			}
			break;
			case "buttonGravity": {


		setButtonGravity(objValue);



			}
			break;
			case "collapseIcon": {


	toolbar.setCollapseIcon((Drawable)objValue);



			}
			break;
			case "collapseContentDescription": {


	toolbar.setCollapseContentDescription((CharSequence)objValue);



			}
			break;
			case "navigationIcon": {


	toolbar.setNavigationIcon((Drawable)objValue);



			}
			break;
			case "navigationContentDescription": {


	toolbar.setNavigationContentDescription((CharSequence)objValue);



			}
			break;
			case "logo": {


	toolbar.setLogo((Drawable)objValue);



			}
			break;
			case "logoDescription": {


	toolbar.setLogoDescription((String)objValue);



			}
			break;
			case "titleTextColor": {


	toolbar.setTitleTextColor((int)objValue);



			}
			break;
			case "subtitleTextColor": {


	toolbar.setSubtitleTextColor((int)objValue);



			}
			break;
			case "menu": {


		setMenu(objValue);



			}
			break;
			case "onNavigationIconClick": {


		toolbar.setNavigationOnClickListener(new OnClickListener(this, strValue));



			}
			break;
			case "overflowIcon": {


	toolbar.setOverflowIcon((Drawable)objValue);



			}
			break;
			case "onMenuItemClick": {


		toolbar.setOnMenuItemClickListener(new OnMenuItemClickListener(this, strValue, "onMenuItemClick"));



			}
			break;
			case "actionLayoutEventIds": {


		setActionLayoutEventIds(objValue);



			}
			break;
			case "searchview_attributes": {


		setSearchviewAttributes(objValue);



			}
			break;
			case "onQueryTextSubmit": {


		setOnQueryTextListener("onQueryTextSubmit", strValue, objValue);



			}
			break;
			case "onQueryTextChange": {


		setOnQueryTextListener("onQueryTextChange", strValue, objValue);



			}
			break;
		default:
			break;
		}
		
	}
	
	@Override
	@SuppressLint("NewApi")
	public Object getAttribute(WidgetAttribute key, ILifeCycleDecorator decorator) {
		Object attributeValue = ViewGroupImpl.getAttribute(this, key, decorator);
		if (attributeValue != null) {
			return attributeValue;
		}
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
		}
		return null;
	}


	@Override
    public Object asNativeWidget() {
        return toolbar;
    }
    private void nativeCreate(Map<String, Object> params) {
    }
    
    @Override
    public void requestLayout() {
    	if (isInitialised()) {
    		ViewImpl.requestLayout(this, asNativeWidget());
    	}
    }
    
    @Override
    public void invalidate() {
    	if (isInitialised()) {
    		ViewImpl.invalidate(this, asNativeWidget());
    	}
    }
    
	

private List<Object> badgeMenuItemIds;
private void setBadgeBackgroundColors(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setBackgroundColor((int) value);
	});
}

public static interface ValueSetter {
	void setValueOnBadgeDrawable(BadgeDrawable badgeDrawable, Object value);
}
private void setValueOnBadgeDrawable(Object objValue, ValueSetter valueSetter) {
	if (badgeMenuItemIds != null) {
		List<Object> badgeAttrs = PluginInvoker.getList(objValue);
		
		for (int i = 0; i < badgeMenuItemIds.size(); i++) {
			int id = (int) badgeMenuItemIds.get(i);
			BadgeDrawable badge = this.getOrCreateBadge(id);
			Object value = badgeAttrs.get(i);
			valueSetter.setValueOnBadgeDrawable(badge, value);
		}
	}
}

private void setBadgeMenuItemIds(Object objValue) {
	badgeMenuItemIds = PluginInvoker.getList(objValue);
}

private void setBadgeNumbers(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setNumber((int) value);
	});
}

private void setBadgeVerticalOffsets(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setVerticalOffset((int) value);
	});	
}

private void setBadgeHorizontalOffsets(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setHorizontalOffset((int) value);
	});	
}

private void setBadgeGravities(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setBadgeGravity((int) value);
	});	
}

private void setBadgeMaxCharacterCounts(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setMaxCharacterCount((int) value);
	});	
}

private void setBadgeAlphas(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setAlpha((int) value);
	});	
}

private void setBadgeTextColors(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setBadgeTextColor((int) value);
	});
}

private void setBadgeIsVisibles(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setVisible((boolean) value);
	});
}



@SuppressLint("RestrictedApi")
private void setTextAppearanceResources(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setTextAppearance((int) value);
	});
}



	public static void parseMenu(com.ashera.widget.HasWidgets parent, Menu menu, String json, com.ashera.core.IFragment fragment) {
		Map<String, Object> jsonMap = com.ashera.widget.PluginInvoker.unmarshal(json, java.util.Map.class);
		
		if (jsonMap.containsKey("menu")) {
			Map<String, Object> menuMap = com.ashera.widget.PluginInvoker.getMap(jsonMap.get("menu"));
			parseGroupAndItem(parent, menu, fragment, menuMap, 0); 			
		}
	}

	private static void parseGroupAndItem(com.ashera.widget.HasWidgets parent, Menu menu,
			com.ashera.core.IFragment fragment, Map<String, Object> parentMap, int groupId) {
		for (Iterator<Entry<String, Object>> iterator = parentMap.entrySet().iterator(); iterator.hasNext();) {
			Entry<String, Object> entry = iterator.next();
			Object item = entry.getValue();
			switch (entry.getKey()) {
			case "item":
				createMenuItemMapOrList(parent, menu, fragment, item, groupId);
				break;
			case "group":
				List<Object> itemList = com.ashera.widget.PluginInvoker.getList(item);
				if (itemList != null) {
					for (Object itemObj : itemList) {
						parseGroup(parent, menu, fragment, itemObj);
					}
				} else {
					parseGroup(parent, menu, fragment, item);
				}
				break;
			default:
				break;
			}
		}
	}

	private static void parseGroup(com.ashera.widget.HasWidgets parent, Menu menu,
			com.ashera.core.IFragment fragment, Object item) {
		Map<String, Object> itemMap = com.ashera.widget.PluginInvoker.getMap(item);
		int menugroupId = 0;
		if (itemMap.containsKey("@android:id")) {
			menugroupId = (int) com.ashera.widget.PluginInvoker.convertFrom(com.ashera.widget.PluginInvoker.getConverter("id"), 
					null, itemMap.get("@android:id"), fragment);
		}
		
		parseGroupAndItem(parent, menu, fragment, itemMap, menugroupId);
	}

	private static void createMenuItemMapOrList(com.ashera.widget.HasWidgets parent, Menu menu,
			com.ashera.core.IFragment fragment, Object item, int groupId) {
		List<Object> itemList = com.ashera.widget.PluginInvoker.getList(item);
		if (itemList != null) {
			for (Object itemObj : itemList) {
				createMenuItem(parent, menu, fragment, itemObj, groupId);
			}
		} else {
			createMenuItem(parent, menu, fragment, item, groupId);
		}
	}

	private static void createMenuItem(com.ashera.widget.HasWidgets parent, Menu menu, com.ashera.core.IFragment fragment, Object payLoad, int groupId) {
		Map<String, Object> itemMap = com.ashera.widget.PluginInvoker.getMap(payLoad);
		
		//"@android:id" : "@+id/menu_main_setting", "@android:icon" : "@drawable/icon", "@app:showAsAction" : "always", "@android:title" : "Setting"
		int id = 0;
		int categoryOrder = 0;
		String title = "";
		Drawable icon = null;
		int showAsAction = -1;
		if (itemMap.containsKey("@android:id")) {
			id = (int) com.ashera.widget.PluginInvoker.convertFrom(com.ashera.widget.PluginInvoker.getConverter("id"), 
					null, itemMap.get("@android:id"), fragment);
		}

		if (itemMap.containsKey("@android:title")) {
			title = (String) com.ashera.widget.PluginInvoker.convertFrom(com.ashera.widget.PluginInvoker.getConverter("resourcestring"), 
					null, itemMap.get("@android:title"), fragment);
		}
		
		if (itemMap.containsKey("@android:icon")) {
			icon = (Drawable) com.ashera.widget.PluginInvoker.convertFrom(com.ashera.widget.PluginInvoker.getConverter("drawable"), 
					null, itemMap.get("@android:icon"), fragment);
		}
		
		if (itemMap.containsKey("@app:showAsAction")) {
			// load attributes of ActionMenuView do not remove this
			com.ashera.widget.WidgetFactory.get("androidx.appcompat.widget.ActionMenuView", false);
			showAsAction = (int) com.ashera.widget.PluginInvoker.convertFrom(com.ashera.widget.PluginInvoker.getConverter("androidx.appcompat.widget.ActionMenuView.showAsAction"), 
					null, itemMap.get("@app:showAsAction"), fragment);
		}
		MenuItem menuItem = menu.add(groupId, id, categoryOrder, title);
		menuItem.setEnabled(true);
		menuItem.setVisible(true);
		boolean actionViewSpecified = false;
        if (itemMap.containsKey("@app:actionViewClass")) {
            View actionView = getActionView(parent, (String) itemMap.get("@app:actionViewClass"));
            menuItem.setActionView(actionView);
            actionViewSpecified = true;
        }
        
        if (itemMap.containsKey("@app:actionLayout")) {
        	String actionLayout = (String) itemMap.get("@app:actionLayout");
			createActionLayout(parent, menuItem, actionLayout);
        }
        
        if (itemMap.containsKey("@android:actionLayout")) {
        	String actionLayout = (String) itemMap.get("@android:actionLayout");
			createActionLayout(parent, menuItem, actionLayout);
        }
		
		if (icon != null) {
			menuItem.setIcon(icon);
		}
		if (showAsAction != -1) {
			menuItem.setShowAsAction(showAsAction);
		}
		
		if (itemMap.containsKey("menu")) {
			Map<String, Object> menuMap = com.ashera.widget.PluginInvoker.getMap(itemMap.get("menu"));			
			Menu subMenu = getSubMenu(menu, menuItem);			
			parseGroupAndItem(parent, subMenu, fragment, menuMap, 0);
		}
	}

	private static void createActionLayout(com.ashera.widget.HasWidgets parent, MenuItem menuItem,
			String actionLayout) {
		IWidget template = (IWidget) parent.quickConvert(actionLayout, "template");
		IWidget widget = template.loadLazyWidgets(parent);
		menuItem.setActionView((View) widget.asWidget());
	}
	
	

	@SuppressLint("NewApi")
private static class OnClickListener implements View.OnClickListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnClickListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnClickListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onClick(View v){
    
	if (action == null || action.equals("onClick")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onClick");
	    java.util.Map<String, Object> obj = getOnClickEventObj(v);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, v);
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return;
}//#####

public java.util.Map<String, Object> getOnClickEventObj(View v) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "click");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onClick", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnMenuItemClickListener implements Toolbar.OnMenuItemClickListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnMenuItemClickListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnMenuItemClickListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public boolean onMenuItemClick(MenuItem item){
    boolean result = true;
    
	if (action == null || action.equals("onMenuItemClick")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onMenuItemClick");
	    java.util.Map<String, Object> obj = getOnMenuItemClickEventObj(item);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 Object commandResult = EventCommandFactory.getCommand(commandName).executeCommand(w, obj, item);
		    	 if (commandResult != null) {
		    		 result = (boolean) commandResult;
		    	 }
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return result;
}//#####

public java.util.Map<String, Object> getOnMenuItemClickEventObj(MenuItem item) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "menuitemclick");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        ViewImpl.addEventInfo(obj, item, w.getFragment());
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onMenuItemClick", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnQueryTextListener implements SearchView.OnQueryTextListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnQueryTextListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnQueryTextListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public boolean onQueryTextSubmit(String query){
    boolean result = true;
    
	if (action == null || action.equals("onQueryTextSubmit")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onQueryTextSubmit");
	    java.util.Map<String, Object> obj = getOnQueryTextSubmitEventObj(query);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 Object commandResult = EventCommandFactory.getCommand(commandName).executeCommand(w, obj, query);
		    	 if (commandResult != null) {
		    		 result = (boolean) commandResult;
		    	 }
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return result;
}//#####

public java.util.Map<String, Object> getOnQueryTextSubmitEventObj(String query) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "querytextsubmit");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "query", query);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onQueryTextSubmit", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}public boolean onQueryTextChange(String newText){
    boolean result = true;
    
	if (action == null || action.equals("onQueryTextChange")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onQueryTextChange");
	    java.util.Map<String, Object> obj = getOnQueryTextChangeEventObj(newText);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 Object commandResult = EventCommandFactory.getCommand(commandName).executeCommand(w, obj, newText);
		    	 if (commandResult != null) {
		    		 result = (boolean) commandResult;
		    	 }
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return result;
}//#####

public java.util.Map<String, Object> getOnQueryTextChangeEventObj(String newText) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "querytextchange");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "newText", newText);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onQueryTextChange", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}


	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			toolbar.setId((int) quickConvert(id, "id"));
		}
	}
	
    

		//end - body


	private void setMenu(Object objValue) {
		com.ashera.core.IActivity activity = fragment.getRootActivity();
		androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) activity;
		toolbar.getMenu().clear();
		String menuId = (String) objValue;
		String inlineResource = fragment.getInlineResource(menuId);
		if (fragment.getRootDirectory() == null && inlineResource == null) {
			toolbar.inflateMenu(toolbar.getResources().getIdentifier(menuId, "menu", fragmentActivity.getPackageName()));
		} else {
			String json;
			if (inlineResource != null) {
				json = PluginInvoker.xml2json(inlineResource, fragment);
			} else {
				String key = menuId.replace("@menu/", "");
				json = com.ashera.utils.ResourceBundleUtils.getString("menu/menu", key, fragment);
			}
			parseMenu(this, toolbar.getMenu(), json, fragment);
		}
		MenuCompat.setGroupDividerEnabled(toolbar.getMenu(), true);
	}
	
	//start - toolbar
	private void setContentInsetEnd(Object objValue) {
		toolbar.setContentInsetsRelative(toolbar.getContentInsetStart(), (int) objValue);
	}

	private void setContentInsetStart(Object objValue) {
		toolbar.setContentInsetsRelative((int) objValue, toolbar.getContentInsetEnd());
	}
	
	
	private void setTitleMargin(Object objValue) {
		toolbar.setTitleMargin((int) objValue, (int) objValue, (int) objValue, (int) objValue);
		
	}
	
	private SearchView.OnQueryTextListener onQueryTextSubmit;
	private SearchView.OnQueryTextListener onQueryTextChange;
	
	
	private void setOnQueryTextListener(String action, String strValue, Object objValue) {
		SearchView.OnQueryTextListener onQueryTextListener;
		if (objValue instanceof String) {
			onQueryTextListener = new OnQueryTextListener(this, strValue, action);
			if (action.equals("onQueryTextSubmit")) {
				onQueryTextSubmit = onQueryTextListener;
			}
			if (action.equals("onQueryTextChange")) {
				onQueryTextChange = onQueryTextListener;
			}
		} else {
			onQueryTextChange = null;
			onQueryTextSubmit = null;
			onQueryTextListener = (SearchView.OnQueryTextListener) objValue; 
		}

		int menuSize = toolbar.getMenu().size();
		
		for (int i = 0; i < menuSize; i++) {
			MenuItem menu = toolbar.getMenu().getItem(i);
			
			if (menu.getActionView() instanceof SearchView) {
				if (onQueryTextSubmit == null && onQueryTextChange == null) {
					((SearchView) menu.getActionView()).setOnQueryTextListener(onQueryTextListener);
				} else {
					((SearchView) menu.getActionView()).setOnQueryTextListener(new SearchView.OnQueryTextListener() {
						@Override
						public boolean onQueryTextChange(String text) {
							if (onQueryTextChange != null) {
								onQueryTextChange.onQueryTextChange(text);
							}
							return false;
						}

						@Override
						public boolean onQueryTextSubmit(String query) {
							if (onQueryTextSubmit != null) {
								onQueryTextSubmit.onQueryTextSubmit(query);
							}
							return false;
						}
						
					});
				}
			}
			
		}
	}



	private List<String> actionLayoutEventIds;
	private void setActionLayoutEventIds(Object objValue) {
		this.actionLayoutEventIds = (List<String>) objValue;
	}
	
	private void applySearchViewAttributes(MenuItem menu) {
		AutoCompleteTextView autoComplete = findAutoComplete((ViewGroup) menu.getActionView());
		IWidget widget = getAutoCompleteImpl(autoComplete);
		Set<String> set = searchviewAttributes.keySet();
		for (String key : set) {
			widget.setAttribute(key, searchviewAttributes.get(key), false);
		}
		widget.applyModelToWidget();
		setOnSuggestionListener(menu, autoComplete);
	}
	
	private AutoCompleteTextView findAutoComplete(ViewGroup actionView) {
		for (int i = 0; i < actionView.getChildCount(); i++) {
			View view = actionView.getChildAt(i);
			
			if (view instanceof AutoCompleteTextView) {
				return (AutoCompleteTextView)view;
			}
			
			if (view instanceof ViewGroup) {
				return findAutoComplete((ViewGroup) view);
			}
			
		}
		return null;
	}

	
	private Map<String, Object> searchviewAttributes;
	private void setSearchviewAttributes(Object objValue) {
		searchviewAttributes = com.ashera.model.ModelExpressionParser.parseSimpleCssExpression((String) objValue);
	}
	//end - toolbar


	private void setGravity(Object objValue) {
		setFieldUsingReflection(toolbar, "mGravity", objValue);
	}
	
	private void setButtonGravity(Object objValue) {
		setFieldUsingReflection(toolbar, "mButtonGravity", objValue);
	}

	private void setMaxButtonHeight(Object objValue) {
		setFieldUsingReflection(toolbar, "mMaxButtonHeight", objValue);
	}
	
	@Override
	public void initialized() {
		super.initialized();

		if (this.actionLayoutEventIds != null || searchviewAttributes != null) {
			int menuSize = toolbar.getMenu().size();
			for (int i = 0; i < menuSize; i++) {
				MenuItem menu = toolbar.getMenu().getItem(i);

				if (this.actionLayoutEventIds != null && menu.getActionView() != null && !(menu.getActionView() instanceof SearchView)) {
					for (String actionLayoutEventId : this.actionLayoutEventIds) {
						actionLayoutEventId = actionLayoutEventId.replace("@+id/", "").replace("@id/", "");

						final String myactionLayoutEventId = actionLayoutEventId;
						int menuId = 0;
						
						if (fragment.getRootDirectory() == null) {
							menuId = menu.getActionView().getContext().getResources().getIdentifier(actionLayoutEventId,
									"id", menu.getActionView().getContext().getPackageName());
						} else {
							menuId = (Integer) quickConvert("@+id/" + actionLayoutEventId, "id");
						}
						View view = menu.getActionView().findViewById(menuId);
						if (view != null) {
							view.setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View v) {
									Toolbar.OnMenuItemClickListener listener = (Toolbar.OnMenuItemClickListener) getFieldValueUsingReflection(
											toolbar, "mOnMenuItemClickListener");
									if (listener != null) {
										menu.getActionView().setTag(myactionLayoutEventId);
										listener.onMenuItemClick(menu);
									}
								}
							});
						}
					}

				} else if (searchviewAttributes != null && menu.getActionView() != null && (menu.getActionView() instanceof SearchView)) {
					applySearchViewAttributes(menu);
				}
			}
		}
	}



	public IWidget getAutoCompleteImpl(AutoCompleteTextView autoComplete) {
		AutoCompleteTextViewImpl impl = new AutoCompleteTextViewImpl(autoComplete, getFragment());
		return impl;
	}
	
	private void setOnSuggestionListener(MenuItem menu, AutoCompleteTextView autoComplete) {
		SearchView searchView = (SearchView) menu.getActionView();
		searchView.setOnSuggestionListener(new SearchView.OnSuggestionListener() {
			@Override
			public boolean onSuggestionSelect(int position) {
				searchView.setQuery(autoComplete.getAdapter().getItem(position).toString(), false);
				return true;
			}

			@Override
			public boolean onSuggestionClick(int position) {
				searchView.setQuery(autoComplete.getAdapter().getItem(position).toString(), false);
				return true;
			}
		});
	}

	private Map<Integer, BadgeDrawable> badgeDrawables;
	@SuppressLint("UnsafeExperimentalUsageError")
	private BadgeDrawable getOrCreateBadge(int id) {
		if (badgeDrawables == null) {
			badgeDrawables = new java.util.HashMap<>();
		}
		
		if (!badgeDrawables.containsKey(id)) {
			BadgeDrawable badgeDrawable = BadgeDrawable.create(toolbar.getContext());
			badgeDrawables.put(id, badgeDrawable);
			com.google.android.material.badge.BadgeUtils.attachBadgeDrawable(badgeDrawable, toolbar, id);
		}
		
		return badgeDrawables.get(id);
	}
	

	//start - menu
	private static Menu getSubMenu(Menu menu, MenuItem menuItem) {
		menu.removeItem(menuItem.getItemId());
		return menu.addSubMenu(menuItem.getTitle());
	}
	
	private static View getActionView(com.ashera.widget.HasWidgets parent, String actionViewClass) {
		Context rootActivity = (Context) parent.getFragment().getRootActivity();
		View actionView = (View) newInstance(actionViewClass, new Class<?>[] { Context.class },
				new Object[] { rootActivity }, rootActivity);
		return actionView;
	}

	private static <T> T newInstance(String className, Class<?>[] constructorSignature,
			Object[] arguments, Context mContext) {
		try {
			Class<?> clazz = Class.forName(className, false, mContext.getClassLoader());
			java.lang.reflect.Constructor<?> constructor = clazz.getConstructor(constructorSignature);
			constructor.setAccessible(true);
			return (T) constructor.newInstance(arguments);
		} catch (Exception e) {
		}
		return null;
	}
	//end - menu

	private void loadCustomAttributes(String localName) {
		ConverterFactory.register("androidx.appcompat.widget.ActionMenuView.showAsAction", new ShowAsAction());
	}

	final static class ShowAsAction extends AbstractBitFlagConverter {
		private Map<String, Integer> mapping = new HashMap<>();
		{
			mapping.put("always", MenuItem.SHOW_AS_ACTION_ALWAYS);
			mapping.put("ifRoom", MenuItem.SHOW_AS_ACTION_IF_ROOM);
			mapping.put("never", MenuItem.SHOW_AS_ACTION_NEVER);
			mapping.put("collapseActionView", MenuItem.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW);
			mapping.put("withText", MenuItem.SHOW_AS_ACTION_WITH_TEXT);
		}

		@Override
		public Map<String, Integer> getMapping() {
			return mapping;
		}

		@Override
		public Integer getDefault() {
			return 0;
		}
	}
}
