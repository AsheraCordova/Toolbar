//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\IOSToolbarPlugin\src\main\java\com\ashera\toolbar\ToolbarImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ToolbarImpl")
#ifdef RESTRICT_ToolbarImpl
#define INCLUDE_ALL_ToolbarImpl 0
#else
#define INCLUDE_ALL_ToolbarImpl 1
#endif
#undef RESTRICT_ToolbarImpl

#if !defined (ASToolbarImpl_) && (INCLUDE_ALL_ToolbarImpl || defined(INCLUDE_ASToolbarImpl))
#define ASToolbarImpl_

#define RESTRICT_BaseHasWidgets 1
#define INCLUDE_ASBaseHasWidgets 1
#include "BaseHasWidgets.h"

@class ASToolbarImpl_ToolbarBean;
@class ASToolbarImpl_ToolbarCommandBuilder;
@class ASToolbarImpl_ToolbarCommandParamsBuilder;
@class ASToolbarImpl_ToolbarParamsBean;
@class ASWidgetAttribute;
@class IOSClass;
@protocol ADXToolbar_OnMenuItemClickListener;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;
@protocol JavaUtilMap;

@interface ASToolbarImpl : ASBaseHasWidgets
@property id uiView;

#pragma mark Public

- (instancetype)init;

- (instancetype)initWithNSString:(NSString *)localname;

- (instancetype)initWithNSString:(NSString *)groupName
                    withNSString:(NSString *)localname;

- (void)addWithASIWidget:(id<ASIWidget>)w
                 withInt:(jint)index;

- (id)asNativeWidget;

- (id)asWidget;

- (jboolean)checkIosVersionWithNSString:(NSString *)v;

- (void)createWithASIFragment:(id<ASIFragment>)fragment
              withJavaUtilMap:(id<JavaUtilMap>)params;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
              withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (ASToolbarImpl_ToolbarBean *)getBean;

- (ASToolbarImpl_ToolbarCommandBuilder *)getBuilder;

- (id)getChildAttributeWithASIWidget:(id<ASIWidget>)w
               withASWidgetAttribute:(ASWidgetAttribute *)key;

- (id<ADXToolbar_OnMenuItemClickListener>)getOnMenuItemClickListener;

- (ASToolbarImpl_ToolbarParamsBean *)getParamsBean;

- (ASToolbarImpl_ToolbarCommandParamsBuilder *)getParamsBuilder;

- (id)getPluginWithNSString:(NSString *)plugin;

- (IOSClass *)getViewClass;

- (void)invalidate;

- (void)loadAttributesWithNSString:(NSString *)localName;

- (void)nativeCreateWithJavaUtilMap:(id<JavaUtilMap>)params;

- (id<ASIWidget>)newInstance OBJC_METHOD_FAMILY_NONE;

- (jboolean)removeWithInt:(jint)index;

- (jboolean)removeWithASIWidget:(id<ASIWidget>)w;

- (void)requestLayout;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue
                withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (void)setChildAttributeWithASIWidget:(id<ASIWidget>)w
                 withASWidgetAttribute:(ASWidgetAttribute *)key
                          withNSString:(NSString *)strValue
                                withId:(id)objValue;

- (void)setIdWithNSString:(NSString *)id_;

- (void)setVisibleWithBoolean:(jboolean)b;

@end

J2OBJC_EMPTY_STATIC_INIT(ASToolbarImpl)

inline NSString *ASToolbarImpl_get_LOCAL_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASToolbarImpl_LOCAL_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASToolbarImpl, LOCAL_NAME, NSString *)

inline NSString *ASToolbarImpl_get_GROUP_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASToolbarImpl_GROUP_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASToolbarImpl, GROUP_NAME, NSString *)

FOUNDATION_EXPORT void ASToolbarImpl_init(ASToolbarImpl *self);

FOUNDATION_EXPORT ASToolbarImpl *new_ASToolbarImpl_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASToolbarImpl *create_ASToolbarImpl_init(void);

FOUNDATION_EXPORT void ASToolbarImpl_initWithNSString_(ASToolbarImpl *self, NSString *localname);

FOUNDATION_EXPORT ASToolbarImpl *new_ASToolbarImpl_initWithNSString_(NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASToolbarImpl *create_ASToolbarImpl_initWithNSString_(NSString *localname);

FOUNDATION_EXPORT void ASToolbarImpl_initWithNSString_withNSString_(ASToolbarImpl *self, NSString *groupName, NSString *localname);

FOUNDATION_EXPORT ASToolbarImpl *new_ASToolbarImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASToolbarImpl *create_ASToolbarImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname);

J2OBJC_TYPE_LITERAL_HEADER(ASToolbarImpl)

@compatibility_alias ComAsheraToolbarToolbarImpl ASToolbarImpl;

#endif

#if !defined (ASToolbarImpl_PreMeasureHandler_) && (INCLUDE_ALL_ToolbarImpl || defined(INCLUDE_ASToolbarImpl_PreMeasureHandler))
#define ASToolbarImpl_PreMeasureHandler_

#define RESTRICT_EventBusHandler 1
#define INCLUDE_ASEventBusHandler 1
#include "EventBusHandler.h"

@class ASToolbarImpl;

@interface ASToolbarImpl_PreMeasureHandler : ASEventBusHandler

#pragma mark Public

- (instancetype)initWithASToolbarImpl:(ASToolbarImpl *)outer$
                         withNSString:(NSString *)type;

#pragma mark Protected

- (void)doPerformWithId:(id)payload;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithNSString:(NSString *)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASToolbarImpl_PreMeasureHandler)

FOUNDATION_EXPORT void ASToolbarImpl_PreMeasureHandler_initWithASToolbarImpl_withNSString_(ASToolbarImpl_PreMeasureHandler *self, ASToolbarImpl *outer$, NSString *type);

FOUNDATION_EXPORT ASToolbarImpl_PreMeasureHandler *new_ASToolbarImpl_PreMeasureHandler_initWithASToolbarImpl_withNSString_(ASToolbarImpl *outer$, NSString *type) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASToolbarImpl_PreMeasureHandler *create_ASToolbarImpl_PreMeasureHandler_initWithASToolbarImpl_withNSString_(ASToolbarImpl *outer$, NSString *type);

J2OBJC_TYPE_LITERAL_HEADER(ASToolbarImpl_PreMeasureHandler)

#endif

#if !defined (ASToolbarImpl_ToolbarExt_) && (INCLUDE_ALL_ToolbarImpl || defined(INCLUDE_ASToolbarImpl_ToolbarExt))
#define ASToolbarImpl_ToolbarExt_

#define RESTRICT_Toolbar 1
#define INCLUDE_ADXToolbar 1
#include "Toolbar.h"

#define RESTRICT_ILifeCycleDecorator 1
#define INCLUDE_ASILifeCycleDecorator 1
#include "ILifeCycleDecorator.h"

#define RESTRICT_IMaxDimension 1
#define INCLUDE_ASIMaxDimension 1
#include "IMaxDimension.h"

@class ADRect;
@class ADView;
@class ASToolbarImpl;
@class ASWidgetAttribute;
@class IOSIntArray;
@class IOSObjectArray;
@protocol ASIWidget;
@protocol JavaUtilList;

@interface ASToolbarImpl_ToolbarExt : ADXToolbar < ASILifeCycleDecorator, ASIMaxDimension >

#pragma mark Public

- (instancetype)initWithASToolbarImpl:(ASToolbarImpl *)outer$;

- (void)drawableStateChanged;

- (void)executeWithNSString:(NSString *)method
          withNSObjectArray:(IOSObjectArray *)canvas;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)widgetAttribute;

- (void)getLocationOnScreenWithIntArray:(IOSIntArray *)appScreenLocation;

- (jint)getMaxHeight;

- (jint)getMaxWidth;

- (id<JavaUtilList>)getMethods;

- (id<ASIWidget>)getWidget;

- (void)getWindowVisibleDisplayFrameWithADRect:(ADRect *)displayFrame;

- (ADView *)inflateViewWithNSString:(NSString *)layout;

- (void)initialized OBJC_METHOD_FAMILY_NONE;

- (id<ASILifeCycleDecorator>)newInstanceWithASIWidget:(id<ASIWidget>)widget OBJC_METHOD_FAMILY_NONE;

- (void)offsetLeftAndRightWithInt:(jint)offset;

- (void)offsetTopAndBottomWithInt:(jint)offset;

- (void)onMeasureWithInt:(jint)widthMeasureSpec
                 withInt:(jint)heightMeasureSpec;

- (void)remeasure;

- (void)removeFromParent;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)widgetAttribute
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue;

- (void)setMaxHeightWithInt:(jint)height;

- (void)setMaxWidthWithInt:(jint)width;

- (void)setMyAttributeWithNSString:(NSString *)name
                            withId:(id)value;

- (void)setState0WithId:(id)value;

- (void)setState1WithId:(id)value;

- (void)setState2WithId:(id)value;

- (void)setState3WithId:(id)value;

- (void)setState4WithId:(id)value;

- (void)setVisibilityWithInt:(jint)visibility;

- (void)state0;

- (void)state1;

- (void)state2;

- (void)state3;

- (void)state4;

- (void)stateNo;

- (void)stateYes;

- (void)updateMeasuredDimensionWithInt:(jint)width
                               withInt:(jint)height;

#pragma mark Protected

- (void)onLayoutWithBoolean:(jboolean)changed
                    withInt:(jint)l
                    withInt:(jint)t
                    withInt:(jint)r
                    withInt:(jint)b;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASToolbarImpl_ToolbarExt)

FOUNDATION_EXPORT void ASToolbarImpl_ToolbarExt_initWithASToolbarImpl_(ASToolbarImpl_ToolbarExt *self, ASToolbarImpl *outer$);

FOUNDATION_EXPORT ASToolbarImpl_ToolbarExt *new_ASToolbarImpl_ToolbarExt_initWithASToolbarImpl_(ASToolbarImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASToolbarImpl_ToolbarExt *create_ASToolbarImpl_ToolbarExt_initWithASToolbarImpl_(ASToolbarImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASToolbarImpl_ToolbarExt)

#endif

#if !defined (ASToolbarImpl_ToolbarCommandBuilder_) && (INCLUDE_ALL_ToolbarImpl || defined(INCLUDE_ASToolbarImpl_ToolbarCommandBuilder))
#define ASToolbarImpl_ToolbarCommandBuilder_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupCommandBuilder 1
#include "ViewGroupImpl.h"

@class ASToolbarImpl;

@interface ASToolbarImpl_ToolbarCommandBuilder : ASViewGroupImpl_ViewGroupCommandBuilder

#pragma mark Public

- (instancetype)initWithASToolbarImpl:(ASToolbarImpl *)outer$;

- (ASToolbarImpl_ToolbarCommandBuilder *)addAllModelWithId:(id)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)addModelByIndexWithId:(id)arg0
                                                        withId:(id)arg1;

- (ASToolbarImpl_ToolbarCommandBuilder *)addModelWithId:(id)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)animatorXmlWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)endAnimator;

- (ASToolbarImpl_ToolbarCommandBuilder *)executeWithBoolean:(jboolean)setter;

- (ASToolbarImpl_ToolbarCommandBuilder *)invalidate;

- (ASToolbarImpl_ToolbarCommandBuilder *)notifyDataSetChangedWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)refreshUiFromModelWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)removeModelAtIndexWithInt:(jint)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)removeModelByIdWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)requestLayout;

- (ASToolbarImpl_ToolbarCommandBuilder *)reset;

- (ASToolbarImpl_ToolbarCommandBuilder *)setAddStatesFromChildrenWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setAlphaWithFloat:(jfloat)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setAsDragSourceWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setAttributeUnderTestWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setBackgroundRepeatWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setBackgroundTintModeWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setBackgroundTintWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setBackgroundWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setButtonGravityWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setChildXmlWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setClickableWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setClipChildrenWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setClipToPaddingWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setContentDescriptionWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setContentInsetEndWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setContentInsetEndWithActionsWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setContentInsetLeftWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setContentInsetRightWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setContentInsetStartWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setContentInsetStartWithNavigationWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setCustomErrorMessageKeysWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setCustomErrorMessageValuesWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setDuplicateParentStateWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setElevationWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setEnabledWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setErrorStyleWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setFocusableWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setForegroundGravityWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setForegroundRepeatWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setForegroundTintModeWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setForegroundTintWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setForegroundWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setGravityWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIdWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setInvalidateOnFrameChangeWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosAccessibilityHintWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosAccessibilityIgnoresInvertColorsWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosAccessibilityLabelWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosAccessibilityTraitsWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosAccessibilityValueWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosAlphaWithFloat:(jfloat)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosAutoresizesSubviewsWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosBackgroundColorWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosClearsContextBeforeDrawingWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosClipsToBoundsWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosContentScaleFactorWithFloat:(jfloat)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosInsetsLayoutMarginsFromSafeAreaWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosIsAccessibilityElementWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosIsExclusiveTouchWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosIsHiddenWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosIsMultipleTouchEnabledWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosIsOpaqueWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosIsUserInteractionEnabledWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosLargeContentImageWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosLargeContentTitleWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosLayerBorderColorWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosLayerBorderWidthWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosLayerCornerRadiusWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosLayerMasksToBoundsWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosPreservesSuperviewLayoutMarginsWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosRestorationIdentifierWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosScalesLargeContentImageWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosShowsLargeContentViewerWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosTagWithInt:(jint)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosTintColorWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setIosTranslatesAutoresizingMaskIntoConstraintsWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setKeepScreenOnWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setLayoutDirectionWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setLayoutModeWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setListitemWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setLogoWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setLongClickableWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setMaxButtonHeightWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setMaxHeightWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setMaxWidthWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setMenuWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setMinHeightWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setMinWidthWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setModelDescPathWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setModelForWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setModelIdPathWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setModelParamWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setModelPojoToUiParamsWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setModelPojoToUiWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setModelSyncEventsWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setModelUiToPojoEventIdsWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setModelUiToPojoWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setNavigationIconWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setOnAnimationCancelWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setOnAnimationEndWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setOnAnimationRepeatWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setOnAnimationStartWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setOnChildViewAddedWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setOnChildViewRemovedWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setOnClickWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setOnDragWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setOnKeyWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setOnLongClickWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setOnMenuItemClickWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setOnNavigationIconClickWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setOnSwipedWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setOnTouchWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setOutsideTouchableWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setOverflowIconWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setPaddingBottomWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setPaddingEndWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setPaddingHorizontalWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setPaddingLeftWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setPaddingRightWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setPaddingStartWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setPaddingTopWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setPaddingVerticalWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setPaddingWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setRotationWithFloat:(jfloat)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setRotationXWithFloat:(jfloat)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setRotationYWithFloat:(jfloat)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setScaleXWithFloat:(jfloat)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setScaleYWithFloat:(jfloat)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setSelectedWithBoolean:(jboolean)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setStyleWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setSubtitleWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setSubtitleTextColorWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setTextAlignmentWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setTextDirectionWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setTitleWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setTitleMarginWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setTitleMarginBottomWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setTitleMarginEndWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setTitleMarginsWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setTitleMarginStartWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setTitleMarginTopWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setTitleTextColorWithNSString:(NSString *)value;

- (ASToolbarImpl_ToolbarCommandBuilder *)setTransformPivotXWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setTransformPivotYWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setTranslationXWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setTranslationYWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setTranslationZWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setV_maxlengthWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setV_maxWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setV_minlengthWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setV_minWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setV_patternWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setV_requiredWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setV_typeWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setValidationErrorDisplayTypeWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setValidationWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setVisibilityWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)setZIndexWithInt:(jint)arg0;

- (ASToolbarImpl_ToolbarCommandBuilder *)startAnimator;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetAddStatesFromChildren;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetAlpha;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetBackground;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetBackgroundTint;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetBackgroundTintMode;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetClickable;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetClipChildren;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetClipToPadding;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetContentDescription;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetDuplicateParentState;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetEnabled;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetFocusable;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetForeground;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetForegroundGravity;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetForegroundTint;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetForegroundTintMode;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetId;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosAccessibilityHint;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosAccessibilityIgnoresInvertColors;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosAccessibilityLabel;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosAccessibilityTraits;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosAccessibilityValue;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosAlpha;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosAutoresizesSubviews;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosBackgroundColor;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosClearsContextBeforeDrawing;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosClipsToBounds;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosContentScaleFactor;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosInsetsLayoutMarginsFromSafeArea;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosIsAccessibilityElement;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosIsExclusiveTouch;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosIsFocused;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosIsHidden;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosIsMultipleTouchEnabled;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosIsOpaque;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosIsUserInteractionEnabled;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosLargeContentImage;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosLargeContentTitle;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosPreservesSuperviewLayoutMargins;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosRestorationIdentifier;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosScalesLargeContentImage;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosShowsLargeContentViewer;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosTag;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosTintColor;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetIosTranslatesAutoresizingMaskIntoConstraints;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetKeepScreenOn;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetLayoutDirection;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetLayoutMode;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetLongClickable;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetMaxHeight;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetMaxWidth;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetMinHeight;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetMinWidth;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetModelDescPath;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetModelIdPath;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetModelParam;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetModelPojoToUi;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetModelSyncEvents;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetModelUiToPojo;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetPaddingBottom;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetPaddingEnd;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetPaddingLeft;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetPaddingRight;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetPaddingStart;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetPaddingTop;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetRotation;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetRotationX;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetRotationY;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetScaleX;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetScaleY;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetSelected;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetTextAlignment;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetTextDirection;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetTransformPivotX;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetTransformPivotY;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetTranslationX;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetTranslationY;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetTranslationZ;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetValidateForm;

- (ASToolbarImpl_ToolbarCommandBuilder *)tryGetVisibility;

- (ASToolbarImpl_ToolbarCommandBuilder *)updateModelDataWithNSString:(NSString *)arg0
                                                              withId:(id)arg1;

- (ASToolbarImpl_ToolbarCommandBuilder *)validateFormWithNSString:(NSString *)arg0;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASToolbarImpl_ToolbarCommandBuilder)

FOUNDATION_EXPORT void ASToolbarImpl_ToolbarCommandBuilder_initWithASToolbarImpl_(ASToolbarImpl_ToolbarCommandBuilder *self, ASToolbarImpl *outer$);

FOUNDATION_EXPORT ASToolbarImpl_ToolbarCommandBuilder *new_ASToolbarImpl_ToolbarCommandBuilder_initWithASToolbarImpl_(ASToolbarImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASToolbarImpl_ToolbarCommandBuilder *create_ASToolbarImpl_ToolbarCommandBuilder_initWithASToolbarImpl_(ASToolbarImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASToolbarImpl_ToolbarCommandBuilder)

#endif

#if !defined (ASToolbarImpl_ToolbarBean_) && (INCLUDE_ALL_ToolbarImpl || defined(INCLUDE_ASToolbarImpl_ToolbarBean))
#define ASToolbarImpl_ToolbarBean_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupBean 1
#include "ViewGroupImpl.h"

@class ASToolbarImpl;
@protocol ASIWidget;

@interface ASToolbarImpl_ToolbarBean : ASViewGroupImpl_ViewGroupBean

#pragma mark Public

- (instancetype)initWithASToolbarImpl:(ASToolbarImpl *)outer$;

- (void)setButtonGravityWithNSString:(NSString *)value;

- (void)setContentInsetEndWithNSString:(NSString *)value;

- (void)setContentInsetEndWithActionsWithNSString:(NSString *)value;

- (void)setContentInsetLeftWithNSString:(NSString *)value;

- (void)setContentInsetRightWithNSString:(NSString *)value;

- (void)setContentInsetStartWithNSString:(NSString *)value;

- (void)setContentInsetStartWithNavigationWithNSString:(NSString *)value;

- (void)setGravityWithNSString:(NSString *)value;

- (void)setLogoWithNSString:(NSString *)value;

- (void)setMaxButtonHeightWithNSString:(NSString *)value;

- (void)setMenuWithNSString:(NSString *)value;

- (void)setNavigationIconWithNSString:(NSString *)value;

- (void)setOnMenuItemClickWithNSString:(NSString *)value;

- (void)setOnNavigationIconClickWithNSString:(NSString *)value;

- (void)setOverflowIconWithNSString:(NSString *)value;

- (void)setSubtitleWithNSString:(NSString *)value;

- (void)setSubtitleTextColorWithNSString:(NSString *)value;

- (void)setTitleWithNSString:(NSString *)value;

- (void)setTitleMarginWithNSString:(NSString *)value;

- (void)setTitleMarginBottomWithNSString:(NSString *)value;

- (void)setTitleMarginEndWithNSString:(NSString *)value;

- (void)setTitleMarginsWithNSString:(NSString *)value;

- (void)setTitleMarginStartWithNSString:(NSString *)value;

- (void)setTitleMarginTopWithNSString:(NSString *)value;

- (void)setTitleTextColorWithNSString:(NSString *)value;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithASIWidget:(id<ASIWidget>)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASToolbarImpl_ToolbarBean)

FOUNDATION_EXPORT void ASToolbarImpl_ToolbarBean_initWithASToolbarImpl_(ASToolbarImpl_ToolbarBean *self, ASToolbarImpl *outer$);

FOUNDATION_EXPORT ASToolbarImpl_ToolbarBean *new_ASToolbarImpl_ToolbarBean_initWithASToolbarImpl_(ASToolbarImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASToolbarImpl_ToolbarBean *create_ASToolbarImpl_ToolbarBean_initWithASToolbarImpl_(ASToolbarImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASToolbarImpl_ToolbarBean)

#endif

#if !defined (ASToolbarImpl_ToolbarParamsBean_) && (INCLUDE_ALL_ToolbarImpl || defined(INCLUDE_ASToolbarImpl_ToolbarParamsBean))
#define ASToolbarImpl_ToolbarParamsBean_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupParamsBean 1
#include "ViewGroupImpl.h"

@class ASToolbarImpl;

@interface ASToolbarImpl_ToolbarParamsBean : ASViewGroupImpl_ViewGroupParamsBean

#pragma mark Public

- (instancetype)initWithASToolbarImpl:(ASToolbarImpl *)outer$;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASToolbarImpl_ToolbarParamsBean)

FOUNDATION_EXPORT void ASToolbarImpl_ToolbarParamsBean_initWithASToolbarImpl_(ASToolbarImpl_ToolbarParamsBean *self, ASToolbarImpl *outer$);

FOUNDATION_EXPORT ASToolbarImpl_ToolbarParamsBean *new_ASToolbarImpl_ToolbarParamsBean_initWithASToolbarImpl_(ASToolbarImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASToolbarImpl_ToolbarParamsBean *create_ASToolbarImpl_ToolbarParamsBean_initWithASToolbarImpl_(ASToolbarImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASToolbarImpl_ToolbarParamsBean)

#endif

#if !defined (ASToolbarImpl_ToolbarCommandParamsBuilder_) && (INCLUDE_ALL_ToolbarImpl || defined(INCLUDE_ASToolbarImpl_ToolbarCommandParamsBuilder))
#define ASToolbarImpl_ToolbarCommandParamsBuilder_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupCommandParamsBuilder 1
#include "ViewGroupImpl.h"

@class ASToolbarImpl;

@interface ASToolbarImpl_ToolbarCommandParamsBuilder : ASViewGroupImpl_ViewGroupCommandParamsBuilder

#pragma mark Public

- (instancetype)initWithASToolbarImpl:(ASToolbarImpl *)outer$;

- (ASToolbarImpl_ToolbarCommandParamsBuilder *)reset;

- (ASToolbarImpl_ToolbarCommandParamsBuilder *)setLayoutMarginBottomWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandParamsBuilder *)setLayoutMarginEndWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandParamsBuilder *)setLayoutMarginHorizontalWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandParamsBuilder *)setLayoutMarginLeftWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandParamsBuilder *)setLayoutMarginRightWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandParamsBuilder *)setLayoutMarginStartWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandParamsBuilder *)setLayoutMarginTopWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandParamsBuilder *)setLayoutMarginVerticalWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandParamsBuilder *)setLayoutMarginWithNSString:(NSString *)arg0;

- (ASToolbarImpl_ToolbarCommandParamsBuilder *)tryGetLayoutMarginBottom;

- (ASToolbarImpl_ToolbarCommandParamsBuilder *)tryGetLayoutMarginEnd;

- (ASToolbarImpl_ToolbarCommandParamsBuilder *)tryGetLayoutMarginLeft;

- (ASToolbarImpl_ToolbarCommandParamsBuilder *)tryGetLayoutMarginRight;

- (ASToolbarImpl_ToolbarCommandParamsBuilder *)tryGetLayoutMarginStart;

- (ASToolbarImpl_ToolbarCommandParamsBuilder *)tryGetLayoutMarginTop;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASToolbarImpl_ToolbarCommandParamsBuilder)

FOUNDATION_EXPORT void ASToolbarImpl_ToolbarCommandParamsBuilder_initWithASToolbarImpl_(ASToolbarImpl_ToolbarCommandParamsBuilder *self, ASToolbarImpl *outer$);

FOUNDATION_EXPORT ASToolbarImpl_ToolbarCommandParamsBuilder *new_ASToolbarImpl_ToolbarCommandParamsBuilder_initWithASToolbarImpl_(ASToolbarImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASToolbarImpl_ToolbarCommandParamsBuilder *create_ASToolbarImpl_ToolbarCommandParamsBuilder_initWithASToolbarImpl_(ASToolbarImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASToolbarImpl_ToolbarCommandParamsBuilder)

#endif

#pragma pop_macro("INCLUDE_ALL_ToolbarImpl")
