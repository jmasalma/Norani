package com.zoomat.noorania;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

public class MainActivity extends FragmentActivity {
    private static final int DAYS_UNTIL_PROMPT = 1;
    private static final int LAUNCH_UNTIL_PROMPT = 2;
    private static final int NUM_PAGES = 24;
    public static DisplayMetrics display;
    public static ViewPager mPager;
    private int currentVersion = 32;
    private int index;
    private boolean isOnStop = false;
    private int latestVersion = 13;
    private PagerAdapter mPagerAdapter;

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, android.app.Activity, com.zoomat.noorania.MainActivity, androidx.fragment.app.FragmentActivity] */
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        MainActivity.super.onCreate(bundle);
        setContentView(R.layout.qaida_screen);
        display = getResources().getDisplayMetrics();
        UserMessagingPlatform.getConsentInformation(this).requestConsentInfoUpdate(this, new ConsentRequestParameters.Builder().setTagForUnderAgeOfConsent(false).build(), new MainActivity$$ExternalSyntheticLambda0(this), new MainActivity$$ExternalSyntheticLambda1());
        if (this.currentVersion < this.latestVersion) {
            new AlertDialog.Builder(this).setTitle("تحديث إجباري").setMessage("لن تتمكن من استخدام التطبيق بدون التحديث إلى آخر إصدار.").setPositiveButton("تحديث الآن", new MainActivity$$ExternalSyntheticLambda2(this)).setCancelable(false).show();
        }
        CreateAds();
        app_launched(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, (int) (((double) display.heightPixels) / 1.11d));
        ViewPager findViewById = findViewById(R.id.pager);
        mPager = findViewById;
        findViewById.setLayoutParams(layoutParams);
        ScreenSlidePagerAdapter screenSlidePagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        this.mPagerAdapter = screenSlidePagerAdapter;
        mPager.setAdapter(screenSlidePagerAdapter);
        mPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            public void onPageSelected(int i) {
                MainActivity.this.invalidateOptionsMenu();
            }
        });
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.app.Activity, com.zoomat.noorania.MainActivity] */
    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreate$1$com-zoomat-noorania-MainActivity  reason: not valid java name */
    public /* synthetic */ void m8lambda$onCreate$1$comzoomatnooraniaMainActivity() {
        UserMessagingPlatform.loadAndShowConsentFormIfRequired(this, new MainActivity$$ExternalSyntheticLambda3());
    }

    static /* synthetic */ void lambda$onCreate$0(FormError formError) {
        if (formError != null) {
            Log.d("UMP", "خطأ في نموذج الموافقة: " + formError.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreate$3$com-zoomat-noorania-MainActivity  reason: not valid java name */
    public /* synthetic */ void m9lambda$onCreate$3$comzoomatnooraniaMainActivity(DialogInterface dialogInterface, int i) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + getPackageName())));
        finish();
    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public int getCount() {
            return MainActivity.NUM_PAGES;
        }

        public ScreenSlidePagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [android.content.Context, com.zoomat.noorania.MainActivity] */
        public Fragment getItem(int i) {
            return ScreenSlidePageFragment.create(i, MainActivity.this, MainActivity.display.heightPixels, MainActivity.display.widthPixels);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.zoomat.noorania.MainActivity] */
    /* access modifiers changed from: package-private */
    public void CreateAds() {
        AdView adView = new AdView(this);
        adView.setAdUnitId("ca-app-pub-1695098347194811/2100741151");
        adView.setAdSize(AdSize.BANNER);
        ((RelativeLayout) findViewById(R.id.adsLayout)).addView(adView);
        adView.loadAd(new AdRequest.Builder().build());
    }

    public static void app_launched(Context context) {
        Context context2 = context;
        SharedPreferences sharedPreferences = context2.getSharedPreferences("rate_app", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Long valueOf = Long.valueOf(sharedPreferences.getLong("date_first_launch", 0));
        long j = sharedPreferences.getLong("launch_count", 0) + 1;
        int i = (j > 2 ? 1 : (j == 2 ? 0 : -1));
        if (i >= 0) {
            SharedPreferences.Editor editor = edit;
            if (((double) System.currentTimeMillis()) >= ((double) valueOf.longValue()) + 1.296E8d) {
                edit = editor;
                edit.putLong("use", 1);
                showRateDialog(context2, edit, context.getResources().getString(R.string.app_name), "");
            } else {
                edit = editor;
            }
        }
        if (!sharedPreferences.getBoolean("dontshowagain", false)) {
            edit.putLong("launch_count", j);
            if (valueOf.longValue() == 0) {
                valueOf = Long.valueOf(System.currentTimeMillis());
                edit.putLong("date_first_launch", valueOf.longValue());
            }
            if (i >= 0 && System.currentTimeMillis() >= valueOf.longValue() + 1200000) {
                showRateDialog(context2, edit, context.getResources().getString(R.string.app_name), "");
            }
            edit.commit();
        }
    }

    public static void showRateDialog(final Context context, final SharedPreferences.Editor editor, String str, String str2) {
        AlertDialog.Builder builder;
        new Dialog(context);
        try {
            builder = new AlertDialog.Builder(context, 3);
        } catch (NoSuchMethodError unused) {
            Log.e("Tag", "Older SDK, using old Builder");
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(context.getResources().getString(R.string.please_take)).setTitle(" تقييم " + str).setIcon(context.getApplicationInfo().icon).setCancelable(false).setPositiveButton("قيم الآن", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                editor.putBoolean("dontshowagain", true);
                editor.commit();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + context.getPackageName())));
                dialogInterface.dismiss();
            }
        }).setNeutralButton("ليس الآن", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setNegativeButton("لا، شكرا", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                SharedPreferences.Editor editor = editor;
                if (editor != null) {
                    editor.putBoolean("dontshowagain", true);
                    editor.commit();
                }
                dialogInterface.dismiss();
            }
        });
        builder.create().show();
    }

    public void onBackPressed() {
        MainActivity.super.onBackPressed();
        try {
            if (ScreenSlidePageFragment.media != null) {
                ScreenSlidePageFragment.media.stop();
            }
            if (ScreenSlidePageFragment.pageMedia != null) {
                ScreenSlidePageFragment.pageMedia.stop();
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        MainActivity.super.onStop();
        try {
            if (ScreenSlidePageFragment.media != null) {
                ScreenSlidePageFragment.media.stop();
            }
            if (ScreenSlidePageFragment.pageMedia != null) {
                ScreenSlidePageFragment.pageMedia.stop();
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        MainActivity.super.onPause();
        try {
            if (ScreenSlidePageFragment.media != null) {
                ScreenSlidePageFragment.media.stop();
            }
            if (ScreenSlidePageFragment.pageMedia != null) {
                ScreenSlidePageFragment.pageMedia.stop();
            }
        } catch (Exception unused) {
        }
    }
}
