//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroidToolBar\src\main\java\androidx\appcompat\widget\SearchView.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_SearchView")
#ifdef RESTRICT_SearchView
#define INCLUDE_ALL_SearchView 0
#else
#define INCLUDE_ALL_SearchView 1
#endif
#undef RESTRICT_SearchView

#if !defined (ADXSearchView_) && (INCLUDE_ALL_SearchView || defined(INCLUDE_ADXSearchView))
#define ADXSearchView_

#define RESTRICT_LinearLayoutCompat 1
#define INCLUDE_ADXLinearLayoutCompat 1
#include "LinearLayoutCompat.h"

#define RESTRICT_CollapsibleActionView 1
#define INCLUDE_ADXCollapsibleActionView 1
#include "CollapsibleActionView.h"

@class ADAutoCompleteTextView;
@class ADImageView;
@class ADXSearchView_SearchableInfo;
@protocol ADXSearchView_OnQueryTextListener;
@protocol ASIWidget;
@protocol JavaLangCharSequence;

@interface ADXSearchView : ADXLinearLayoutCompat < ADXCollapsibleActionView > {
 @public
  ADAutoCompleteTextView *mSearchSrcTextView_;
  ADImageView *mSearchButton_;
  ADImageView *mGoButton_;
  ADImageView *mCloseButton_;
  ADImageView *mVoiceButton_;
  ADXSearchView_SearchableInfo *mSearchable_;
}

#pragma mark Public

- (instancetype)init;

- (id<JavaLangCharSequence>)getQueryHint;

- (jboolean)hasFocus;

- (void)init__WithASIWidget:(id<ASIWidget>)root OBJC_METHOD_FAMILY_NONE;

- (jboolean)isIconified;

- (void)onActionViewCollapsed;

- (void)onActionViewExpanded;

- (void)setIconifiedWithBoolean:(jboolean)iconify;

- (void)setOnQueryTextListenerWithADXSearchView_OnQueryTextListener:(id<ADXSearchView_OnQueryTextListener>)listener;

- (void)setQueryWithJavaLangCharSequence:(id<JavaLangCharSequence>)query
                             withBoolean:(jboolean)submit;

#pragma mark Protected

- (void)onMeasureWithInt:(jint)widthMeasureSpec
                 withInt:(jint)heightMeasureSpec;

#pragma mark Package-Private

- (id<JavaLangCharSequence>)getDecoratedHintWithJavaLangCharSequence:(id<JavaLangCharSequence>)hintText;

- (jint)getPreferredHeight;

- (jint)getPreferredWidth;

- (void)launchQuerySearchWithInt:(jint)actionKey
                    withNSString:(NSString *)actionMsg
                    withNSString:(NSString *)query;

- (void)onCloseClicked;

- (void)onSearchClicked;

- (void)onSubmitQuery;

- (void)onTextChangedWithJavaLangCharSequence:(id<JavaLangCharSequence>)newText;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXSearchView)

J2OBJC_FIELD_SETTER(ADXSearchView, mSearchSrcTextView_, ADAutoCompleteTextView *)
J2OBJC_FIELD_SETTER(ADXSearchView, mSearchButton_, ADImageView *)
J2OBJC_FIELD_SETTER(ADXSearchView, mGoButton_, ADImageView *)
J2OBJC_FIELD_SETTER(ADXSearchView, mCloseButton_, ADImageView *)
J2OBJC_FIELD_SETTER(ADXSearchView, mVoiceButton_, ADImageView *)
J2OBJC_FIELD_SETTER(ADXSearchView, mSearchable_, ADXSearchView_SearchableInfo *)

inline jboolean ADXSearchView_get_DBG(void);
#define ADXSearchView_DBG false
J2OBJC_STATIC_FIELD_CONSTANT(ADXSearchView, DBG, jboolean)

FOUNDATION_EXPORT void ADXSearchView_init(ADXSearchView *self);

FOUNDATION_EXPORT ADXSearchView *new_ADXSearchView_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADXSearchView *create_ADXSearchView_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADXSearchView)

@compatibility_alias AndroidxAppcompatWidgetSearchView ADXSearchView;

#endif

#if !defined (ADXSearchView_OnQueryTextListener_) && (INCLUDE_ALL_SearchView || defined(INCLUDE_ADXSearchView_OnQueryTextListener))
#define ADXSearchView_OnQueryTextListener_

@protocol ADXSearchView_OnQueryTextListener < JavaObject >

- (jboolean)onQueryTextSubmitWithNSString:(NSString *)query;

- (jboolean)onQueryTextChangeWithNSString:(NSString *)newText;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXSearchView_OnQueryTextListener)

J2OBJC_TYPE_LITERAL_HEADER(ADXSearchView_OnQueryTextListener)

#endif

#if !defined (ADXSearchView_OnCloseListener_) && (INCLUDE_ALL_SearchView || defined(INCLUDE_ADXSearchView_OnCloseListener))
#define ADXSearchView_OnCloseListener_

@protocol ADXSearchView_OnCloseListener < JavaObject >

- (jboolean)onClose;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXSearchView_OnCloseListener)

J2OBJC_TYPE_LITERAL_HEADER(ADXSearchView_OnCloseListener)

#endif

#if !defined (ADXSearchView_SearchableInfo_) && (INCLUDE_ALL_SearchView || defined(INCLUDE_ADXSearchView_SearchableInfo))
#define ADXSearchView_SearchableInfo_

@class ADXSearchView;

@interface ADXSearchView_SearchableInfo : NSObject

#pragma mark Public

- (jint)getHintId;

#pragma mark Package-Private

- (instancetype)initWithADXSearchView:(ADXSearchView *)outer$;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXSearchView_SearchableInfo)

FOUNDATION_EXPORT void ADXSearchView_SearchableInfo_initWithADXSearchView_(ADXSearchView_SearchableInfo *self, ADXSearchView *outer$);

FOUNDATION_EXPORT ADXSearchView_SearchableInfo *new_ADXSearchView_SearchableInfo_initWithADXSearchView_(ADXSearchView *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADXSearchView_SearchableInfo *create_ADXSearchView_SearchableInfo_initWithADXSearchView_(ADXSearchView *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ADXSearchView_SearchableInfo)

#endif

#pragma pop_macro("INCLUDE_ALL_SearchView")
