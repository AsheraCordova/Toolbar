package com.ashera.toolbar;
// start - imports
import java.util.*;

import r.android.annotation.SuppressLint;
import r.android.content.Context;
import r.android.os.Build;
import r.android.view.*;
import r.android.widget.*;
import r.android.view.View.*;

import com.ashera.widget.BaseHasWidgets;

import r.android.annotation.SuppressLint;

import com.ashera.core.IFragment;
import com.ashera.widget.bus.*;
import com.ashera.converter.*;
import com.ashera.widget.bus.Event.*;
import com.ashera.widget.*;
import com.ashera.widget.IWidgetLifeCycleListener.*;
import com.ashera.layout.*;

import org.teavm.jso.dom.html.HTMLElement;

import static com.ashera.widget.IWidget.*;
//end - imports
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.badge.BadgeDrawable;

public class ToolbarImpl extends BaseHasWidgets {
	//start - body
	private HTMLElement htmlElement;
	public final static String LOCAL_NAME = "androidx.appcompat.widget.Toolbar"; 
	public final static String GROUP_NAME = "androidx.appcompat.widget.Toolbar";
	private androidx.appcompat.widget.Toolbar toolbar;
	
	private String PREMEASURE_EVENT = com.ashera.widget.bus.Event.StandardEvents.preMeasure.toString();
	@com.google.j2objc.annotations.WeakOuter
	class PreMeasureHandler extends com.ashera.widget.bus.EventBusHandler {

		public PreMeasureHandler(String type) {
			super(type);
		}

		@Override
		protected void doPerform(Object payload) {
			handlePreMeasure(payload);
		}
		
	}
	private void addPremeasureHandler() {
		fragment.getEventBus().on(PREMEASURE_EVENT, new PreMeasureHandler(PREMEASURE_EVENT));
	}

	
	@Override
	public void loadAttributes(String localName) {
		ViewGroupImpl.register(localName);

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
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("menu").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("actionLayoutEventIds").withType("array").withArrayType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("searchview_attributes").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onQueryTextSubmit").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onQueryTextChange").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeNumbers").withType("array").withArrayType("int").withOrder(10).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("menuItemIds").withType("array").withArrayType("id").withOrder(-1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeAlphas").withType("array").withArrayType("int").withOrder(10).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeMaxCharacterCounts").withType("array").withArrayType("int").withOrder(10).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeGravities").withType("array").withArrayType("gravity").withOrder(10).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeHorizontalOffsets").withType("array").withArrayType("dimension").withOrder(10).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeVerticalOffsets").withType("array").withArrayType("dimension").withOrder(10).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeIsVisibles").withType("array").withArrayType("boolean").withOrder(10).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeBackgroundColors").withType("array").withArrayType("colorint").withOrder(10).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeTextColors").withType("array").withArrayType("colorint").withOrder(10).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("badgeTextAppearanceResources").withType("array").withArrayType("string").withOrder(10).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("title").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("titleTextColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("subtitle").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("subtitleTextColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("logo").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("navigationIcon").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("overflowIcon").withType("drawable").withOrder(10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onNavigationIconClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onMenuItemClick").withType("string").withOrder(-1));
	
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
		toolbar = new ToolbarExt();
		
		nativeCreate(params);
		addPremeasureHandler();
		
		
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
		 nativeRemoveView(w);            
		return remove;
	}
	
	@Override
    public boolean remove(int index) {
		IWidget widget = widgets.get(index);
        boolean remove = super.remove(index);

        if (index + 1 <= toolbar.getChildCount()) {
            toolbar.removeViewAt(index);
            nativeRemoveView(widget);
        }    
        return remove;
    }

	private void nativeRemoveView(IWidget widget) {
		r.android.animation.LayoutTransition layoutTransition = toolbar.getLayoutTransition();
		if (layoutTransition != null && (
				layoutTransition.isTransitionTypeEnabled(r.android.animation.LayoutTransition.CHANGE_DISAPPEARING) ||
				layoutTransition.isTransitionTypeEnabled(r.android.animation.LayoutTransition.DISAPPEARING)
				)) {
			addToBufferedRunnables(() -> ViewGroupImpl.nativeRemoveView(widget));          
		} else {
			ViewGroupImpl.nativeRemoveView(widget);
		}
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
		private List<IWidget> overlays;
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

		public ToolbarExt() {
			super();
			
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
			ViewImpl.setDrawableBounds(ToolbarImpl.this, l, t, r, b);
			if (!isOverlay()) {
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			}
			replayBufferedEvents();
	        ViewImpl.redrawDrawables(ToolbarImpl.this);
	        overlays = ViewImpl.drawOverlay(ToolbarImpl.this, overlays);
			
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
		public void execute(String method, Object... canvas) {
			
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
        private Map<String, IWidget> templates;
    	@Override
    	public r.android.view.View inflateView(java.lang.String layout) {
    		if (templates == null) {
    			templates = new java.util.HashMap<String, IWidget>();
    		}
    		IWidget template = templates.get(layout);
    		if (template == null) {
    			template = (IWidget) quickConvert(layout, "template");
    			templates.put(layout, template);
    		}
    		
    		IWidget widget = template.loadLazyWidgets(ToolbarImpl.this);
			return (View) widget.asWidget();
    	}   
        
    	@Override
		public void remeasure() {
    		if (getFragment() != null) {
    			getFragment().remeasure();
    		}
		}
    	
        @Override
		public void removeFromParent() {
        	ToolbarImpl.this.getParent().remove(ToolbarImpl.this);
		}
        @Override
        public void getLocationOnScreen(int[] appScreenLocation) {
        	appScreenLocation[0] = htmlElement.getBoundingClientRect().getLeft();
        	appScreenLocation[1] = htmlElement.getBoundingClientRect().getTop();
        }
        @Override
        public void getWindowVisibleDisplayFrame(r.android.graphics.Rect displayFrame){
        	
        	org.teavm.jso.dom.html.TextRectangle boundingClientRect = htmlElement.getBoundingClientRect();
			displayFrame.top = boundingClientRect.getTop();
        	displayFrame.left = boundingClientRect.getLeft();
        	displayFrame.bottom = boundingClientRect.getBottom();
        	displayFrame.right = boundingClientRect.getRight();
        }
        @Override
		public void offsetTopAndBottom(int offset) {
			super.offsetTopAndBottom(offset);
			ViewImpl.nativeMakeFrame(asNativeWidget(), getLeft(), getTop(), getRight(), getBottom());
		}
		@Override
		public void offsetLeftAndRight(int offset) {
			super.offsetLeftAndRight(offset);
			ViewImpl.nativeMakeFrame(asNativeWidget(), getLeft(), getTop(), getRight(), getBottom());
		}
		@Override
		public void setMyAttribute(String name, Object value) {
			if (name.equals("state0")) {
				setState0(value);
				return;
			}
			if (name.equals("state1")) {
				setState1(value);
				return;
			}
			if (name.equals("state2")) {
				setState2(value);
				return;
			}
			if (name.equals("state3")) {
				setState3(value);
				return;
			}
			if (name.equals("state4")) {
				setState4(value);
				return;
			}
			ToolbarImpl.this.setAttribute(name, value, !(value instanceof String));
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            ((HTMLElement)asNativeWidget()).getStyle().setProperty("display", visibility != View.VISIBLE ? "none" : "block");
            
        }
        
    	public void setState0(Object value) {
    		ViewImpl.setState(ToolbarImpl.this, 0, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(ToolbarImpl.this, 1, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(ToolbarImpl.this, 2, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(ToolbarImpl.this, 3, value);
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
     
		@Override
		public void endViewTransition(r.android.view.View view) {
			super.endViewTransition(view);
			runBufferedRunnables();
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
			case "menu": {


		setMenu(objValue);



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
			case "badgeNumbers": {


		setBadgeNumbers(objValue);



			}
			break;
			case "menuItemIds": {


		setBadgeMenuItemIds(objValue);



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
			case "badgeBackgroundColors": {


		setBadgeBackgroundColors(objValue);



			}
			break;
			case "badgeTextColors": {


		setBadgeTextColors(objValue);



			}
			break;
			case "badgeTextAppearanceResources": {


		setTextAppearanceResources(objValue);



			}
			break;
			case "title": {


		setTitle(key, strValue, objValue, decorator);



			}
			break;
			case "titleTextColor": {


		setTitleTextColor(key, strValue, objValue, decorator);



			}
			break;
			case "subtitle": {


		setSubtitle(key, strValue, objValue, decorator);



			}
			break;
			case "subtitleTextColor": {


		setSubtitleColor(key, strValue, objValue, decorator);



			}
			break;
			case "logo": {


		setLogo(key, strValue, objValue, decorator);



			}
			break;
			case "navigationIcon": {


		setNavigationIcon(key, strValue, objValue, decorator);



			}
			break;
			case "overflowIcon": {


		setOverflowIcon(key, strValue, objValue, decorator);



			}
			break;
			case "onNavigationIconClick": {


		setNavigationOnClickListener(new OnClickListener(this, strValue));



			}
			break;
			case "onMenuItemClick": {


		setOnMenuItemClickListener(strValue, objValue);



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
        return htmlElement;
    }
    private void nativeCreate(Map<String, Object> params) {
    	htmlElement = org.teavm.jso.dom.html.HTMLDocument.current().createElement("div");
    	htmlElement.getStyle().setProperty("box-sizing", "border-box");
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
    
	

	private IWidget titleView;
	private void setTitle(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		initTitle();
		titleView.setAttribute(WidgetFactory.getAttribute("TextView", "text"), strValue, objValue, decorator);
		
		if (isInitialised()) {
			titleView.requestLayout();
		}
	}

	private void initTitle() {
		if (titleView == null) {
			titleView = WidgetFactory.createWidget("TextView", "Toolbar_titleView", this, true);
			toolbar.setTitleTextView((View) titleView.asWidget());
		}
	}
	
	
	private void setSubtitleColor(WidgetAttribute key, String strValue, Object objValue,
			ILifeCycleDecorator decorator) {
		initSubTitle();
		subtitleView.setAttribute(WidgetFactory.getAttribute("TextView", "textColor"), strValue, objValue, decorator);
	}

	private void setTitleTextColor(WidgetAttribute key, String strValue, Object objValue,
			ILifeCycleDecorator decorator) {
		initTitle();
		titleView.setAttribute(WidgetFactory.getAttribute("TextView", "textColor"), strValue, objValue, decorator);
	}

	private IWidget subtitleView;
	private void setSubtitle(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		initSubTitle();
		subtitleView.setAttribute(WidgetFactory.getAttribute("TextView", "text"), strValue, objValue, decorator);
		
		if (isInitialised()) {
			subtitleView.requestLayout();
		}
	}

	private void initSubTitle() {
		if (subtitleView == null) {
			subtitleView = WidgetFactory.createWidget("TextView", "Toolbar_subtitleView", this, true);
			toolbar.setSubtitleTextView((View) subtitleView.asWidget());
		}
	}

	private IWidget logo;
	private void setLogo(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		if (logo == null) {
			logo = WidgetFactory.createWidget("ImageView", "Toolbar_logoView", this, true);
			toolbar.setLogoView((View) logo.asWidget());
		}

		logo.setAttribute(WidgetFactory.getAttribute("ImageView", "src"), strValue, objValue, decorator);
		
		if (isInitialised()) {
			logo.requestLayout();
		}
	}
	
	private IWidget navigationIcon;
	private void setNavigationIcon(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		if (navigationIcon == null) {
			navigationIcon = WidgetFactory.createWidget("ImageView", "Toolbar_navigationIcon", this, true);
			toolbar.setNavigationIcon((com.ashera.view.BaseMeasurableImageView) navigationIcon.asWidget());
		}
		navigationIcon.setAttribute(WidgetFactory.getAttribute("ImageView", "src"), strValue, objValue, decorator);
		if (isInitialised()) {
			navigationIcon.requestLayout();
		}
	}
	
	private IWidget actionMenuView;
	private String menu;
	private void setMenu(Object objValue) {
		this.menu = (String) objValue;
		createMenu();
	}

	private void createMenu() {
		if (this.menu != null) {
			if (actionMenuView != null) {
				remove(actionMenuView);
				actionMenuView = null;
			}
			
			if (actionMenuView == null) {
				actionMenuView = WidgetFactory.createWidget(ActionMenuViewImpl.LOCAL_NAME, "Toolbar_actionMenuView", this, true);
				toolbar.setMenuView((androidx.appcompat.widget.ActionMenuView) actionMenuView.asWidget());
				androidx.appcompat.widget.Toolbar.LayoutParams lp = (androidx.appcompat.widget.Toolbar.LayoutParams) ((androidx.appcompat.widget.ActionMenuView) actionMenuView.asWidget()).getLayoutParams();
				lp.gravity = GravityCompat.END | (mButtonGravity & Gravity.VERTICAL_GRAVITY_MASK);
			}
			
			
			androidx.appcompat.widget.ActionMenuView actionMenu = (androidx.appcompat.widget.ActionMenuView) actionMenuView.asWidget();
			parseMenu(this.menu, actionMenu.getMenu(), (HasWidgets) actionMenuView);
			actionMenu.updateMenuView();
			
			IWidget overFlowButton = ((ActionMenuViewImpl) actionMenuView).getOverFlowButtonWidget();
			
			if (overFlowButton != null && overflowIcon != null) {
				overFlowButton.setAttribute("src", overflowIcon, false);
			}
			
			actionMenuView.initialized();
			reapplyBadgeDrawables();
		}
	}


	private void parseMenu(String menuId, Menu menu, HasWidgets parent) {
		String inlineResource = fragment.getInlineResource(menuId);
		String json;
		if (inlineResource != null) {
			json = PluginInvoker.xml2json(inlineResource, fragment);
		} else {
			String key = menuId.replace("@menu/", "");
			json = com.ashera.utils.ResourceBundleUtils.getString("menu/menu", key, fragment);
		}
		
		androidx.appcompat.view.menu.MenuParser.parseMenu(parent, menu, json, fragment);
	}

	private Toolbar.OnMenuItemClickListener onMenuItemClickListener;
	public Toolbar.OnMenuItemClickListener getOnMenuItemClickListener() {
		return onMenuItemClickListener;
	}

	private void setOnMenuItemClickListener(String strValue, Object objValue) {
		if (objValue instanceof String) {
			onMenuItemClickListener = (Toolbar.OnMenuItemClickListener) new OnMenuItemClickListener(this, strValue);
		} else {
			onMenuItemClickListener = (Toolbar.OnMenuItemClickListener) objValue;
		}
	}
	private Object overflowIcon;
	private void setOverflowIcon(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		this.overflowIcon = strValue;
		
		IWidget overFlowButton = ((ActionMenuViewImpl) actionMenuView).getOverFlowButtonWidget();
		
		if (overFlowButton != null && overflowIcon != null) {
			overFlowButton.setAttribute("src", objValue, true);
		}
		
		if (isInitialised()) {
			overFlowButton.requestLayout();
		}
	}
	
	
	private void setGravity(Object objValue) {
		toolbar.setGravity((int) objValue);
	}
	
	
	private void setMaxButtonHeight(Object objValue) {
		toolbar.setMaxButtonHeight((int) objValue);		
	}

	private int mButtonGravity = Gravity.TOP;
	private void setButtonGravity(Object objValue) {
		mButtonGravity = ((int) objValue);		
	}
	
	private int screenWidth = -1;
	private void handlePreMeasure(Object payload) {
		int currentScreenWidth = PluginInvoker.getScreenWidth();
		if (screenWidth != -1 && screenWidth != currentScreenWidth) {
			createMenu();
		}
		screenWidth = currentScreenWidth;
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

						View view = menu.getActionView().findViewById(IdGenerator.getId("@+id/" + myactionLayoutEventId));
						if (view != null) {
							view.setMyAttribute("onClick", new View.OnClickListener() {
								@Override
								public void onClick(View v) {
									if (onMenuItemClickListener != null) {
										menu.getActionView().setTag(myactionLayoutEventId);
										onMenuItemClickListener.onMenuItemClick(menu);
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
	

	private IWidget getAutoCompleteImpl(AutoCompleteTextView autoComplete) {
		return ((ILifeCycleDecorator) autoComplete).getWidget();
	}
	
	
	private void setOnSuggestionListener(MenuItem menu, AutoCompleteTextView autoComplete) {
		
	}
	
	private Map<Integer, BadgeDrawable> badgeDrawables;
	private BadgeDrawable getOrCreateBadge(int id) {
		if (badgeDrawables == null) {
			badgeDrawables = new java.util.HashMap<>();
		}
		
		if (!badgeDrawables.containsKey(id)) {
			BadgeDrawable badgeDrawable = BadgeDrawable.create(toolbar.getContext());
			badgeDrawables.put(id, badgeDrawable);
			//com.google.android.material.badge.BadgeUtils.attachBadgeDrawable(badgeDrawable, toolbar, id);
			MenuItem menuItem = toolbar.getMenu().findItem(id);
			View itemView = ((androidx.appcompat.widget.ActionMenuView) actionMenuView.asWidget()).getItemView(menuItem);
			if (itemView.getParent() != null) {
				badgeDrawable.setAdditionalHorizontalOffset((int) PluginInvoker.convertDpToPixel("18dp"));
				badgeDrawable.setAdditionalVerticalOffset((int) PluginInvoker.convertDpToPixel("12dp"));
				com.google.android.material.badge.BadgeUtils.attachBadgeDrawable(badgeDrawable, itemView, null);
			}
		}
		return badgeDrawables.get(id);
	}
	

	

	private void reapplyBadgeDrawables() {
		if (badgeDrawables != null) {
			Set<Integer> ids = badgeDrawables.keySet();
			for (int id : ids) {
				MenuItem menuItem = toolbar.getMenu().findItem(id);
				View itemView = ((androidx.appcompat.widget.ActionMenuView) actionMenuView.asWidget()).getItemView(menuItem);
				if (itemView.getParent() != null) {
					com.google.android.material.badge.BadgeUtils.attachBadgeDrawable(badgeDrawables.get(id), itemView, null);
				}
			}
		}
	}
	


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



private void setTextAppearanceResources(Object objValue) {
	setValueOnBadgeDrawable(objValue, (badge, value) -> {
		badge.setTextAppearanceResource((String) value);
	});
	
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
     
        ViewImpl.addEventInfo(obj, item);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onMenuItemClick", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
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
	
    
    @Override
    public void setVisible(boolean b) {
        ((View)asWidget()).setVisibility(b ? View.VISIBLE : View.GONE);
    }

		//end - body


	private void setNavigationOnClickListener(OnClickListener onClickListener) {
		if (navigationIcon != null) {
			ViewImpl.setOnClick(navigationIcon, navigationIcon.asNativeWidget(), onClickListener);
		}
	}

}
