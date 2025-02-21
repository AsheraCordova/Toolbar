//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\IOSToolbarPlugin\src\main\java\com\ashera\toolbar\ActionMenuViewImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ActionMenuViewImpl")
#ifdef RESTRICT_ActionMenuViewImpl
#define INCLUDE_ALL_ActionMenuViewImpl 0
#else
#define INCLUDE_ALL_ActionMenuViewImpl 1
#endif
#undef RESTRICT_ActionMenuViewImpl

#if !defined (ASActionMenuViewImpl_) && (INCLUDE_ALL_ActionMenuViewImpl || defined(INCLUDE_ASActionMenuViewImpl))
#define ASActionMenuViewImpl_

#define RESTRICT_BaseHasWidgets 1
#define INCLUDE_ASBaseHasWidgets 1
#include "BaseHasWidgets.h"

@class ADView;
@class ASWidgetAttribute;
@class IOSClass;
@protocol ADMenuItem;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;
@protocol JavaUtilMap;

@interface ASActionMenuViewImpl : ASBaseHasWidgets
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

- (id)getChildAttributeWithASIWidget:(id<ASIWidget>)w
               withASWidgetAttribute:(ASWidgetAttribute *)key;

- (ADView *)getItemViewWithADMenuItem:(id<ADMenuItem>)item;

- (id<ASIWidget>)getOverFlowButtonWidget;

- (IOSClass *)getViewClass;

- (jboolean)hasItemViewWithADMenuItem:(id<ADMenuItem>)item;

- (void)initialized OBJC_METHOD_FAMILY_NONE;

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

#pragma mark Package-Private

@end

J2OBJC_EMPTY_STATIC_INIT(ASActionMenuViewImpl)

inline NSString *ASActionMenuViewImpl_get_LOCAL_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASActionMenuViewImpl_LOCAL_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASActionMenuViewImpl, LOCAL_NAME, NSString *)

inline NSString *ASActionMenuViewImpl_get_GROUP_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASActionMenuViewImpl_GROUP_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASActionMenuViewImpl, GROUP_NAME, NSString *)

FOUNDATION_EXPORT void ASActionMenuViewImpl_init(ASActionMenuViewImpl *self);

FOUNDATION_EXPORT ASActionMenuViewImpl *new_ASActionMenuViewImpl_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASActionMenuViewImpl *create_ASActionMenuViewImpl_init(void);

FOUNDATION_EXPORT void ASActionMenuViewImpl_initWithNSString_(ASActionMenuViewImpl *self, NSString *localname);

FOUNDATION_EXPORT ASActionMenuViewImpl *new_ASActionMenuViewImpl_initWithNSString_(NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASActionMenuViewImpl *create_ASActionMenuViewImpl_initWithNSString_(NSString *localname);

FOUNDATION_EXPORT void ASActionMenuViewImpl_initWithNSString_withNSString_(ASActionMenuViewImpl *self, NSString *groupName, NSString *localname);

FOUNDATION_EXPORT ASActionMenuViewImpl *new_ASActionMenuViewImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASActionMenuViewImpl *create_ASActionMenuViewImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname);

J2OBJC_TYPE_LITERAL_HEADER(ASActionMenuViewImpl)

@compatibility_alias ComAsheraToolbarActionMenuViewImpl ASActionMenuViewImpl;

#endif

#if !defined (ASActionMenuViewImpl_Divider_) && (INCLUDE_ALL_ActionMenuViewImpl || defined(INCLUDE_ASActionMenuViewImpl_Divider))
#define ASActionMenuViewImpl_Divider_

#define RESTRICT_AbstractBitFlagConverter 1
#define INCLUDE_ASAbstractBitFlagConverter 1
#include "AbstractBitFlagConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASActionMenuViewImpl_Divider : ASAbstractBitFlagConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASActionMenuViewImpl_Divider)

FOUNDATION_EXPORT void ASActionMenuViewImpl_Divider_init(ASActionMenuViewImpl_Divider *self);

FOUNDATION_EXPORT ASActionMenuViewImpl_Divider *new_ASActionMenuViewImpl_Divider_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASActionMenuViewImpl_Divider *create_ASActionMenuViewImpl_Divider_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASActionMenuViewImpl_Divider)

#endif

#if !defined (ASActionMenuViewImpl_Orientation_) && (INCLUDE_ALL_ActionMenuViewImpl || defined(INCLUDE_ASActionMenuViewImpl_Orientation))
#define ASActionMenuViewImpl_Orientation_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASActionMenuViewImpl_Orientation : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASActionMenuViewImpl_Orientation)

FOUNDATION_EXPORT void ASActionMenuViewImpl_Orientation_init(ASActionMenuViewImpl_Orientation *self);

FOUNDATION_EXPORT ASActionMenuViewImpl_Orientation *new_ASActionMenuViewImpl_Orientation_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASActionMenuViewImpl_Orientation *create_ASActionMenuViewImpl_Orientation_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASActionMenuViewImpl_Orientation)

#endif

#if !defined (ASActionMenuViewImpl_ActionMenuViewExt_) && (INCLUDE_ALL_ActionMenuViewImpl || defined(INCLUDE_ASActionMenuViewImpl_ActionMenuViewExt))
#define ASActionMenuViewImpl_ActionMenuViewExt_

#define RESTRICT_ActionMenuView 1
#define INCLUDE_ADXActionMenuView 1
#include "ActionMenuView.h"

#define RESTRICT_ILifeCycleDecorator 1
#define INCLUDE_ASILifeCycleDecorator 1
#include "ILifeCycleDecorator.h"

#define RESTRICT_IMaxDimension 1
#define INCLUDE_ASIMaxDimension 1
#include "IMaxDimension.h"

@class ADRect;
@class ADView;
@class ASActionMenuViewImpl;
@class ASWidgetAttribute;
@class IOSIntArray;
@class IOSObjectArray;
@protocol ADMenuItem;
@protocol ASIWidget;
@protocol JavaUtilList;

@interface ASActionMenuViewImpl_ActionMenuViewExt : ADXActionMenuView < ASILifeCycleDecorator, ASIMaxDimension >

#pragma mark Public

- (instancetype)initWithASActionMenuViewImpl:(ASActionMenuViewImpl *)outer$;

- (void)drawableStateChanged;

- (void)endViewTransitionWithADView:(ADView *)view;

- (void)executeWithNSString:(NSString *)method
          withNSObjectArray:(IOSObjectArray *)canvas;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)widgetAttribute;

- (ADView *)getItemViewWithADMenuItem:(id<ADMenuItem>)item;

- (void)getLocationOnScreenWithIntArray:(IOSIntArray *)appScreenLocation;

- (jint)getMaxHeight;

- (jint)getMaxWidth;

- (id<JavaUtilList>)getMethods;

- (ADView *)getOverFlowButton;

- (id<ASIWidget>)getWidget;

- (void)getWindowVisibleDisplayFrameWithADRect:(ADRect *)displayFrame;

- (jboolean)hasItemViewWithADMenuItem:(id<ADMenuItem>)item;

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

J2OBJC_EMPTY_STATIC_INIT(ASActionMenuViewImpl_ActionMenuViewExt)

FOUNDATION_EXPORT void ASActionMenuViewImpl_ActionMenuViewExt_initWithASActionMenuViewImpl_(ASActionMenuViewImpl_ActionMenuViewExt *self, ASActionMenuViewImpl *outer$);

FOUNDATION_EXPORT ASActionMenuViewImpl_ActionMenuViewExt *new_ASActionMenuViewImpl_ActionMenuViewExt_initWithASActionMenuViewImpl_(ASActionMenuViewImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASActionMenuViewImpl_ActionMenuViewExt *create_ASActionMenuViewImpl_ActionMenuViewExt_initWithASActionMenuViewImpl_(ASActionMenuViewImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASActionMenuViewImpl_ActionMenuViewExt)

#endif

#if !defined (ASActionMenuViewImpl_ShowAsAction_) && (INCLUDE_ALL_ActionMenuViewImpl || defined(INCLUDE_ASActionMenuViewImpl_ShowAsAction))
#define ASActionMenuViewImpl_ShowAsAction_

#define RESTRICT_AbstractBitFlagConverter 1
#define INCLUDE_ASAbstractBitFlagConverter 1
#include "AbstractBitFlagConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASActionMenuViewImpl_ShowAsAction : ASAbstractBitFlagConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASActionMenuViewImpl_ShowAsAction)

FOUNDATION_EXPORT void ASActionMenuViewImpl_ShowAsAction_init(ASActionMenuViewImpl_ShowAsAction *self);

FOUNDATION_EXPORT ASActionMenuViewImpl_ShowAsAction *new_ASActionMenuViewImpl_ShowAsAction_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASActionMenuViewImpl_ShowAsAction *create_ASActionMenuViewImpl_ShowAsAction_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASActionMenuViewImpl_ShowAsAction)

#endif

#pragma pop_macro("INCLUDE_ALL_ActionMenuViewImpl")
