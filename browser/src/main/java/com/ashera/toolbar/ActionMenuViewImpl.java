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

public class ActionMenuViewImpl extends BaseHasWidgets {
	//start - body
	private HTMLElement htmlElement;
	private r.android.graphics.Canvas canvas;
	public final static String LOCAL_NAME = "androidx.appcompat.widget.ActionMenuView"; 
	public final static String GROUP_NAME = "androidx.appcompat.widget.ActionMenuView";
	private androidx.appcompat.widget.ActionMenuView actionMenuView;
	

	
		@SuppressLint("NewApi")
		final static class Divider  extends AbstractBitFlagConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("none", 0x0);
				mapping.put("beginning", 0x1);
				mapping.put("end", 0x4);
				mapping.put("middle", 0x2);
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
		@SuppressLint("NewApi")
		final static class Orientation extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("horizontal",  0x0);
				mapping.put("vertical",  0x1);
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
	@Override
	public void loadAttributes(String localName) {
		ViewGroupImpl.register(localName);

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("baselineAligned").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("baselineAlignedChildIndex").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("divider").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("gravity").withType("gravity"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("measureWithLargestChild").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("weightSum").withType("float"));
		ConverterFactory.register("androidx.appcompat.widget.ActionMenuView.divider", new Divider());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("showDividers").withType("androidx.appcompat.widget.ActionMenuView.divider"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dividerPadding").withType("dimension"));
		ConverterFactory.register("androidx.appcompat.widget.ActionMenuView.orientation", new Orientation());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("orientation").withType("androidx.appcompat.widget.ActionMenuView.orientation"));
	
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_gravity").withType("gravity").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_weight").withType("float").forChild());
	loadCustomAttributes(localName);
	}
	
	public ActionMenuViewImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  ActionMenuViewImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  ActionMenuViewImpl(String groupName, String localname) {
		super(groupName, localname);
	}

	@Override
	public IWidget newInstance() {
		return new ActionMenuViewImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
		actionMenuView = new ActionMenuViewExt();
		
		nativeCreate(params);
        createCanvas();
		
		
		ViewGroupImpl.registerCommandConveter(this);

	}

	@Override
	public Object asWidget() {
		return actionMenuView;
	}

	@Override
	public boolean remove(IWidget w) {
		boolean remove = super.remove(w);
		actionMenuView.removeView((View) w.asWidget());
		 nativeRemoveView(w);            
		return remove;
	}
	
	@Override
    public boolean remove(int index) {
		IWidget widget = widgets.get(index);
        boolean remove = super.remove(index);

        if (index + 1 <= actionMenuView.getChildCount()) {
            actionMenuView.removeViewAt(index);
            nativeRemoveView(widget);
        }    
        return remove;
    }

	private void nativeRemoveView(IWidget widget) {
		r.android.animation.LayoutTransition layoutTransition = actionMenuView.getLayoutTransition();
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
			        actionMenuView.addView(view);
			    } else {
			        actionMenuView.addView(view, index);
			    }
		}
		
		ViewGroupImpl.nativeAddView(asNativeWidget(), w.asNativeWidget());
		super.add(w, index);
	}
	
	private void createLayoutParams(View view) {
		androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams = (androidx.appcompat.widget.ActionMenuView.LayoutParams) view.getLayoutParams();
		
		layoutParams = (androidx.appcompat.widget.ActionMenuView.LayoutParams) view.getLayoutParams();
		if (layoutParams == null) {
			layoutParams = new androidx.appcompat.widget.ActionMenuView.LayoutParams(-2, -2);
			view.setLayoutParams(layoutParams);
		}  else {
			layoutParams.height = -2;
			layoutParams.width = -2;
		}
	}
	
	private androidx.appcompat.widget.ActionMenuView.LayoutParams getLayoutParams(View view) {
		return (androidx.appcompat.widget.ActionMenuView.LayoutParams) view.getLayoutParams();		
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setChildAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue) {
		View view = (View) w.asWidget();
		androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams = getLayoutParams(view);
		ViewGroupImpl.setChildAttribute(w, key, objValue, layoutParams);		
		
		switch (key.getAttributeName()) {
		case "layout_width":
			layoutParams.width = (int) objValue;
			break;	
		case "layout_height":
			layoutParams.height = (int) objValue;
			break;
			case "layout_gravity": {
				
							layoutParams.gravity = ((int)objValue);
				
			}
			break;
			case "layout_weight": {
				
							layoutParams.weight = ((float)objValue);
				
			}
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
		androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams = getLayoutParams(view);

		switch (key.getAttributeName()) {
		case "layout_width":
			return layoutParams.width;
		case "layout_height":
			return layoutParams.height;
			case "layout_gravity": {
return layoutParams.gravity;			}

			case "layout_weight": {
return layoutParams.weight;			}

		}
		
		return null;

	}
	
		
	public class ActionMenuViewExt extends androidx.appcompat.widget.ActionMenuView implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		private List<IWidget> overlays;
		public IWidget getWidget() {
			return ActionMenuViewImpl.this;
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

		public ActionMenuViewExt() {
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
			ViewImpl.setDrawableBounds(ActionMenuViewImpl.this, l, t, r, b);
			if (!isOverlay()) {
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			}
			replayBufferedEvents();
			canvas.reset();
			onDraw(canvas);
	        ViewImpl.redrawDrawables(ActionMenuViewImpl.this);
	        overlays = ViewImpl.drawOverlay(ActionMenuViewImpl.this, overlays);
			
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
				ActionMenuViewImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(ActionMenuViewImpl.this);
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
    		
    		IWidget widget = template.loadLazyWidgets(ActionMenuViewImpl.this);
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
        	ActionMenuViewImpl.this.getParent().remove(ActionMenuViewImpl.this);
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
			ActionMenuViewImpl.this.setAttribute(name, value, !(value instanceof String));
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            ((HTMLElement)asNativeWidget()).getStyle().setProperty("display", visibility != View.VISIBLE ? "none" : "block");
            
        }
        @Override
        public r.android.view.View getItemView(r.android.view.MenuItem item) {
        	return ActionMenuViewImpl.this.getItemView(item);
        }
        @Override
        public boolean hasItemView(r.android.view.MenuItem item) {
        	return ActionMenuViewImpl.this.hasItemView(item);
        }
        
        @Override
        public r.android.view.View getOverFlowButton() {
        	return ActionMenuViewImpl.this.getOverFlowButton();
        }
        
    	public void setState0(Object value) {
    		ViewImpl.setState(ActionMenuViewImpl.this, 0, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(ActionMenuViewImpl.this, 1, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(ActionMenuViewImpl.this, 2, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(ActionMenuViewImpl.this, 3, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(ActionMenuViewImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(ActionMenuViewImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(ActionMenuViewImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(ActionMenuViewImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(ActionMenuViewImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(ActionMenuViewImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(ActionMenuViewImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(ActionMenuViewImpl.this);
        }
     
		@Override
		public void endViewTransition(r.android.view.View view) {
			super.endViewTransition(view);
			runBufferedRunnables();
		}
	
	}
	@Override
	public Class getViewClass() {
		return ActionMenuViewExt.class;
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
				ViewGroupImpl.setAttribute(this,  key, strValue, objValue, decorator);
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "baselineAligned": {


	actionMenuView.setBaselineAligned((boolean)objValue);



			}
			break;
			case "baselineAlignedChildIndex": {


	actionMenuView.setBaselineAlignedChildIndex((int)objValue);



			}
			break;
			case "divider": {
if (Build.VERSION.SDK_INT >= 11) {

	actionMenuView.setDividerDrawable((r.android.graphics.drawable.Drawable)objValue);

}

			}
			break;
			case "gravity": {


	actionMenuView.setGravity((int)objValue);



			}
			break;
			case "measureWithLargestChild": {
if (Build.VERSION.SDK_INT >= 11) {

	actionMenuView.setMeasureWithLargestChildEnabled((boolean)objValue);

}

			}
			break;
			case "weightSum": {


	actionMenuView.setWeightSum((float)objValue);



			}
			break;
			case "showDividers": {


		setShowDividers(objValue);



			}
			break;
			case "dividerPadding": {


		setDividerPadding(objValue);



			}
			break;
			case "orientation": {


		actionMenuView.setOrientation((int) objValue);



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
			case "baselineAligned": {
return actionMenuView.isBaselineAligned();			}
			case "baselineAlignedChildIndex": {
return actionMenuView.getBaselineAlignedChildIndex();			}
			case "divider": {
if (Build.VERSION.SDK_INT >= 11) {
return actionMenuView.getDividerDrawable();
}
break;			}
			case "gravity": {
if (Build.VERSION.SDK_INT >= 24) {
return actionMenuView.getGravity();
}
break;			}
			case "measureWithLargestChild": {
if (Build.VERSION.SDK_INT >= 11) {
return actionMenuView.isMeasureWithLargestChildEnabled();
}
break;			}
			case "weightSum": {
return actionMenuView.getWeightSum();			}
			case "showDividers": {
return getShowDividers();			}
			case "dividerPadding": {
return getDividerPadding();			}
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
	
	private static final String MAX_ICON_SIZE = "32dp";
	private Map<MenuItem, IWidget> menuItemMap = new java.util.HashMap<>();
	public boolean hasItemView(MenuItem item) {
		return menuItemMap.containsKey(item);
	}
	public View getItemView(MenuItem item) {
		IWidget widget = menuItemMap.get(item);
		if (widget == null) {
			widget = WidgetFactory.createWidget("TextView", "Toolbar_itemView", this, true);
			menuItemMap.put(item, widget);
			
			r.android.graphics.drawable.Drawable drawable = item.getIcon();
			
			if (drawable != null) {
				// code copied from https://android.googlesource.com/platform/frameworks/support/+/refs/heads/androidx-main/appcompat/appcompat/src/main/java/androidx/appcompat/view/menu/ActionMenuItemView.java
				int mMaxIconSize =  (int) quickConvert(MAX_ICON_SIZE, "dimension");
		        int[] widthHeightArr = getImageDimension(drawable);
				int width = widthHeightArr[0];
		        int height = widthHeightArr[1];
		        if (width > mMaxIconSize) {
		            final float scale = (float) mMaxIconSize / width;
		            width = mMaxIconSize;
		            height *= scale;
		        }
		        if (height > mMaxIconSize) {
		            final float scale = (float) mMaxIconSize / height;
		            height = mMaxIconSize;
		            width *= scale;
		        }
				drawable.setMinimumHeight(height);
				drawable.setMinimumWidth(width);
		
				resizeImageIfRequired(drawable, width, height);
				widget.setAttribute("drawableStart", drawable, true);
			}
			widget.setAttribute("tooltipText", item.getTitle(), true);
			if (shouldAllowTextWithIcon() || drawable == null) {
				widget.setAttribute("text", item.getTitle(), true);
			}

			ToolbarImpl toolbar = (ToolbarImpl) getParent();
			
			if (toolbar.getOnMenuItemClickListener() != null) {
				addMenuClickListener(item, widget, toolbar);
			}
			ViewImpl.nativeMakeFrame(widget.asNativeWidget(), -99999, -99999, -99999, -99999);
			com.ashera.view.BaseMeasurableView view = (com.ashera.view.BaseMeasurableView)widget.asWidget();
			view.setLayoutParams(new androidx.appcompat.widget.ActionMenuView.LayoutParams(androidx.appcompat.widget.ActionMenuView.LayoutParams.WRAP_CONTENT, androidx.appcompat.widget.ActionMenuView.LayoutParams.WRAP_CONTENT));
		}
		com.ashera.view.BaseMeasurableView view = (com.ashera.view.BaseMeasurableView)widget.asWidget();
		return view;
	}

//	code copied from https://android.googlesource.com/platform/frameworks/support/+/refs/heads/androidx-main/appcompat/appcompat/src/main/java/androidx/appcompat/view/menu/ActionMenuItemView.java
   private boolean shouldAllowTextWithIcon() {
        final int width = PluginInvoker.getScreenWidthDp();
        final int height = PluginInvoker.getScreenHeightDp();
        int scale = 2;
		return  width >= (480 * scale) || (width >= 640 * scale && height >= 480 * scale) || isLandScape();
    }
	
	private IWidget overFlowButton;
	public IWidget getOverFlowButtonWidget() {
		return overFlowButton;
	}
	private View getOverFlowButton() {
		ToolbarImpl toolbar = (ToolbarImpl) getParent();

		if (overFlowButton == null) {
			overFlowButton = WidgetFactory.createWidget(OVERFLOW_BUTTON_TYPE, "Toolbar_overFlowButton", this, true);
		}
		createPopUpMenu(toolbar);
		return (View) overFlowButton.asWidget();
	}
	


	@SuppressLint("NewApi")
	private void setDividerPadding(Object objValue) {
		if (Build.VERSION.SDK_INT >= 11) {
			actionMenuView.setDividerPadding((int) objValue);
		}
	}

	@SuppressLint("NewApi")
	private void setShowDividers(Object objValue) {
		if (Build.VERSION.SDK_INT >= 11) {
			actionMenuView.setShowDividers((int) objValue);
		}
	}

	@SuppressLint("NewApi")
	private Object getDividerPadding() {
		if (Build.VERSION.SDK_INT >= 11) {
			return actionMenuView.getDividerPadding();
		}
		
		return null;
	}

	@SuppressLint("NewApi")
	private Object getShowDividers() {
		if (Build.VERSION.SDK_INT >= 11) {
			return actionMenuView.getShowDividers();
		}
		return null;
	}
	


	private final static class CanvasImpl implements r.android.graphics.Canvas {
		private boolean requiresAttrChangeListener = false;
		private boolean canvasReset = true;
		private List<HTMLElement> dividers = new java.util.ArrayList<>();
		private IWidget widget;
		public CanvasImpl(IWidget widget) {
			this.widget = widget;
		}
		@Override
		public void draw(r.android.graphics.drawable.Drawable mDivider) {
			for (HTMLElement divider : dividers) {
				if (ViewImpl.getPropertyValueAsInt(divider, "left") == mDivider.getLeft() && ViewImpl.getPropertyValueAsInt(divider, "top") == mDivider.getTop()) {
					return;
				}
			}
			HTMLElement imageElement = org.teavm.jso.dom.html.HTMLDocument.current().createElement("img");
			dividers.add(imageElement);
			ViewImpl.nativeMakeFrame(imageElement, mDivider.getLeft(), mDivider.getTop(), mDivider.getRight(),
					mDivider.getBottom());
			ViewGroupImpl.nativeAddView((HTMLElement) widget.asNativeWidget(), imageElement);
			
			if (requiresAttrChangeListener) {
				mDivider.setAttributeChangeListener((name, value) -> {
					switch (name) {
					case "bounds":
						r.android.graphics.Rect rect = (r.android.graphics.Rect) value;
						ViewImpl.nativeMakeFrame(imageElement, rect.left, rect.top, rect.right, rect.bottom);
						break;
					case "alpha":
						int alpha = (int) value;
						imageElement.getStyle().setProperty("opacity", (alpha/255f) + "");
						break;
					default:
						break;
					}
				});
			}
			Object drawable = mDivider.getDrawable();
			if (drawable instanceof String) {
				String drawableStr = (String) drawable;
				if (drawableStr.startsWith("#")) {
					imageElement.removeAttribute("src");
					imageElement.getStyle().setProperty("background-color", drawableStr);
				} else {
					imageElement.setAttribute("src", drawableStr);
					imageElement.getStyle().removeProperty("background-color");
				}
			} else if (drawable instanceof Integer){
				imageElement.getStyle().setProperty("background-color", (String) ViewImpl.getColor(drawable));
			}
		}

		@Override
		public void reset() {
			if (canvasReset) {
				for (HTMLElement divider : dividers) {
					divider.getParentNode().removeChild(divider);
				}
				dividers.clear();
			}
		}
	}

	private void createCanvas() {
		canvas= new CanvasImpl(this);
	}
	


	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			actionMenuView.setId((int) quickConvert(id, "id"));
		}
	}
	
    
    @Override
    public void setVisible(boolean b) {
        ((View)asWidget()).setVisibility(b ? View.VISIBLE : View.GONE);
    }

		//end - body


	private void addMenuClickListener(MenuItem item, IWidget widget, ToolbarImpl toolbar) {
		ViewImpl.setOnClick(widget, widget.asNativeWidget(), (e) -> {
			toolbar.getOnMenuItemClickListener().onMenuItemClick(item);
		});
	}

	private void resizeImageIfRequired(r.android.graphics.drawable.Drawable drawable, int width, int height) {
	}

	private int[] getImageDimension(r.android.graphics.drawable.Drawable drawable) {
		return new int[] {drawable.getMinimumWidth(), drawable.getMinimumHeight()};
	}

	private boolean isLandScape() {
		return false;
	}
	private String uniqueId;
	private void createPopUpMenu(ToolbarImpl toolbar) {
		HTMLElement root = (HTMLElement) fragment.getRootWidget().asNativeWidget();
		HTMLElement control = (HTMLElement) overFlowButton.asNativeWidget();
		control.setAttribute("class", "dropbtn");
		
	/*<div class="dropdown">
	  <div id="myDropdown" class="dropdown-content">
		<ul id="mynav">
            <li>
            	<h3>Submenu #1</h3>
                <ul>
                    <li><a href="#">Link 1</a></li>
                    <li><a href="#">Link 2</a></li>
                    <li><a href="#">Link 3</a></li>
                    <li><a href="#">Link 4</a></li>
                    <li><a href="#">Link 5</a></li>
                </ul>
            </li>
        </ul>
	  </div>
	</div>*/
		ViewImpl.setOnListener(this, control, (e) -> {
			if (uniqueId == null) {
				uniqueId = UUID.randomUUID().toString();
			}
			
			HTMLElement dropdown = querySelector(root, "#menu" + uniqueId);
			
			if (dropdown != null) {
				dropdown.removeChild(dropdown.getFirstChild());
			} else {
				dropdown = org.teavm.jso.dom.html.HTMLDocument.current().createElement("div");
				dropdown.setAttribute("id", "menu" + uniqueId);
			}
			
			HTMLElement myDropdown = org.teavm.jso.dom.html.HTMLDocument.current().createElement("div");
			myDropdown.setAttribute("class", "dropdown-content");
			dropdown.appendChild(myDropdown);
			
			HTMLElement ul = org.teavm.jso.dom.html.HTMLDocument.current().createElement("ul");
			myDropdown.appendChild(ul);
			int menuGroupId = -1;
			int prevMenuGroupId = -1;
			for (androidx.appcompat.view.menu.MenuItemImpl menuItemImpl : actionMenuView.getMenu().getNonActionItems()) {
				menuGroupId = menuItemImpl.getGroupId();
				
				HTMLElement li = org.teavm.jso.dom.html.HTMLDocument.current().createElement("li");
				ul.appendChild(li);

				if (prevMenuGroupId != -1 && menuGroupId != prevMenuGroupId) {
					li.getStyle().setProperty("border-top", "1px solid black");
				}
				
				HTMLElement href = org.teavm.jso.dom.html.HTMLDocument.current().createElement("a");
				li.appendChild(href);
				href.setInnerHTML(menuItemImpl.getTitle());
									
				if (toolbar.getOnMenuItemClickListener() != null) {
					ViewImpl.setOnClick(this, li, (e1) -> {
						toolbar.getOnMenuItemClickListener().onMenuItemClick(menuItemImpl);
					});
				}
				
				prevMenuGroupId = menuGroupId;
			}
			myDropdown.setAttribute("class", "dropdown-content show");
			HTMLElement toolbarElement = (HTMLElement) toolbar.asNativeWidget();
			toolbarElement.getStyle().setProperty("overflow", "visible");
			toolbarElement.appendChild(dropdown);
			dropdown.getStyle().setProperty("top", toolbarElement.getClientHeight() + "px");
			
			if (actionMenuView.isLayoutRtl()) {
				dropdown.getStyle().setProperty("left", ViewImpl.isRTLLayout(this) ? (myDropdown.getClientWidth()) + "px" : "0px");
			} else {
				dropdown.getStyle().setProperty("left", (toolbarElement.getClientWidth() - myDropdown.getClientWidth()) + "px");
			}
			dropdown.getStyle().setProperty("position", "absolute");
		}, "click", "click");
		
		
		ViewImpl.setOnListener(this, org.teavm.jso.browser.Window.current(), (e) -> {
			if (!matchesTarget(e, ".dropbtn")) {
				HTMLElement[] dropdowns = querySelectorAll(root, ".dropdown-content");
				for (HTMLElement htmlElement : dropdowns) {
					htmlElement.setAttribute("class", "dropdown-content");
				}
			}
		}, "click-window", "click");
	}
	
	
	@org.teavm.jso.JSBody(params = { "element", "id" }, script = "return element.querySelector(id);")
	private static native HTMLElement querySelector(HTMLElement element, String id);
	@org.teavm.jso.JSBody(params = { "element", "className" }, script = "return element.querySelectorAll(className);")
	private static native HTMLElement[] querySelectorAll(HTMLElement element, String className);

	@org.teavm.jso.JSBody(params = { "event", "className" }, script = "return (event.composedPath ? event.composedPath() : event.path) && (event.composedPath ? event.composedPath() : event.path)[0].matches(className);")
	private static native boolean matchesTarget(org.teavm.jso.dom.events.Event event, String className);
	private String OVERFLOW_BUTTON_TYPE= "ImageView";
}
