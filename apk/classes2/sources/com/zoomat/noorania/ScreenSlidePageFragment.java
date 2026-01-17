package com.zoomat.noorania;

import android.app.Activity;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.internal.ads.zzbcj;
import java.util.ArrayList;

public class ScreenSlidePageFragment extends Fragment implements OnPageChange, ViewPager.OnPageChangeListener, View.OnClickListener, MediaPlayer.OnCompletionListener {
    public static final String ARG_PAGE = "page";
    /* access modifiers changed from: private */
    public static Context context;
    public static int displayHeight;
    public static int displayWidth;
    public static MediaPlayer media = new MediaPlayer();
    public static MediaPlayer pageMedia = new MediaPlayer();
    private int Colomn = 2;
    private TableLayout Maintb;
    private int Row = 1;
    public ArrayList<ImageButton> allBtns = new ArrayList<>();
    private ImageButton btn;
    private ArrayList<String> btnList = new ArrayList<>();
    /* access modifiers changed from: private */
    public View buttonView;
    private int buttonsLayoutHeight;
    private int buttonsLayoutWidth;
    private ImageButton[] cardsBtn;
    private ImageView closeHelpBtn;
    private ArrayList<String> columnNum = new ArrayList<>();
    private String currentControlPress = "Stop";
    private ImageView gotoBtn;
    /* access modifiers changed from: private */
    public EditText gotoTxt;
    private ArrayList<String> heightNum = new ArrayList<>();
    private int id = 0;
    private ArrayList<String> imgNameList = new ArrayList<>();
    /* access modifiers changed from: private */
    public RelativeLayout imgScreen;
    private RelativeLayout infoHelpBg;
    Boolean isPlaying = false;
    /* access modifiers changed from: private */
    public Boolean isStop = true;
    /* access modifiers changed from: private */
    public View itemView;
    private RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
    private ArrayList<String> leftNum = new ArrayList<>();
    private Drawable letterBtn;
    /* access modifiers changed from: private */
    public InterstitialAd mInterstitialAd;
    public int mPageNumber;
    private RelativeLayout mainLay;
    private ImageView menuBtn;
    private TextView pageNumbertxt;
    private ImageView pauseBtn;
    /* access modifiers changed from: private */
    public ImageView playBtn;
    private String repe = "";
    /* access modifiers changed from: private */
    public ImageView repeatBtn;
    /* access modifiers changed from: private */
    public int repeatCounter;
    /* access modifiers changed from: private */
    public TextView repeatText;
    private ArrayList<String> rowNum = new ArrayList<>();
    private ArrayList<ImageButton> screenBtns = new ArrayList<>();
    /* access modifiers changed from: private */
    public int sound = 0;
    private ArrayList<String> soundNameList = new ArrayList<>();
    /* access modifiers changed from: private */
    public SoundsArray soundsArrays = new SoundsArray();
    private ImageView stopBtn;
    /* access modifiers changed from: private */
    public String tagg;
    private ArrayList<String> topNum = new ArrayList<>();
    private ArrayList<String> widthNum = new ArrayList<>();
    private XmlResourceParser xpp;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    static /* synthetic */ int access$008(ScreenSlidePageFragment screenSlidePageFragment) {
        int i = screenSlidePageFragment.repeatCounter;
        screenSlidePageFragment.repeatCounter = i + 1;
        return i;
    }

    public static ScreenSlidePageFragment create(int i, Context context2, int i2, int i3) {
        context = context2;
        displayHeight = i2;
        displayWidth = i3;
        ScreenSlidePageFragment screenSlidePageFragment = new ScreenSlidePageFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_PAGE, i);
        screenSlidePageFragment.setArguments(bundle);
        return screenSlidePageFragment;
    }

    public ScreenSlidePageFragment() {
        if (this.imgNameList.size() == 0) {
            XmlParser((Activity) context);
        }
    }

    public void onCreate(Bundle bundle) {
        ScreenSlidePageFragment.super.onCreate(bundle);
        this.mPageNumber = getArguments().getInt(ARG_PAGE);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.viewpager_item, viewGroup, false);
        this.itemView = inflate;
        this.Maintb = (TableLayout) inflate.findViewById(R.id.table);
        this.imgScreen = (RelativeLayout) this.itemView.findViewById(R.id.imgscreen);
        MainActivity.mPager.setOnPageChangeListener(this);
        this.imgScreen.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("pages", "drawable", context.getPackageName())));
        this.buttonsLayoutWidth = calWidth(90.0f);
        this.buttonsLayoutHeight = calHeight(80.0f);
        this.mainLay = (RelativeLayout) this.itemView.findViewById(R.id.lay);
        this.playBtn = (ImageView) this.itemView.findViewById(R.id.play);
        this.pauseBtn = (ImageView) this.itemView.findViewById(R.id.pause);
        this.stopBtn = (ImageView) this.itemView.findViewById(R.id.stop);
        this.repeatBtn = (ImageView) this.itemView.findViewById(R.id.repeat);
        this.repeatText = (TextView) this.itemView.findViewById(R.id.repeatText);
        this.pageNumbertxt = (TextView) this.itemView.findViewById(R.id.pageNumber);
        this.gotoTxt = (EditText) this.itemView.findViewById(R.id.goto_txt);
        this.gotoBtn = (ImageView) this.itemView.findViewById(R.id.goto_btn);
        this.menuBtn = (ImageView) this.itemView.findViewById(R.id.menu);
        this.closeHelpBtn = (ImageView) this.itemView.findViewById(R.id.closeHelpBtn);
        this.infoHelpBg = (RelativeLayout) this.itemView.findViewById(R.id.infoAndHelp_bg);
        this.playBtn.setTag("Play");
        this.playBtn.setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.buttonsLayoutWidth, this.buttonsLayoutHeight);
        this.layoutParams = layoutParams2;
        layoutParams2.addRule(10, -1);
        this.layoutParams.setMargins(calWidth(114.0f), calHeight(1380.0f), 0, 0);
        this.playBtn.setLayoutParams(this.layoutParams);
        this.pauseBtn.setTag("Pause");
        this.pauseBtn.setEnabled(false);
        this.pauseBtn.setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.buttonsLayoutWidth, this.buttonsLayoutHeight);
        this.layoutParams = layoutParams3;
        layoutParams3.addRule(9, -1);
        this.layoutParams.setMargins(calWidth(240.0f), calHeight(1380.0f), 0, 0);
        this.pauseBtn.setLayoutParams(this.layoutParams);
        this.stopBtn.setTag("Stop");
        this.stopBtn.setEnabled(false);
        this.stopBtn.setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(this.buttonsLayoutWidth, this.buttonsLayoutHeight);
        this.layoutParams = layoutParams4;
        layoutParams4.addRule(9, -1);
        this.layoutParams.setMargins(calWidth(356.0f), calHeight(1380.0f), 0, 0);
        this.stopBtn.setLayoutParams(this.layoutParams);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(this.buttonsLayoutWidth, this.buttonsLayoutHeight);
        this.layoutParams = layoutParams5;
        layoutParams5.addRule(10, -1);
        this.layoutParams.setMargins(calWidth(492.0f), calHeight(1380.0f), 0, 0);
        this.repeatBtn.setLayoutParams(this.layoutParams);
        this.repeatBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    ScreenSlidePageFragment.access$008(ScreenSlidePageFragment.this);
                    ScreenSlidePageFragment.this.repeatText.setVisibility(0);
                    ScreenSlidePageFragment.this.repeatText.setText(String.valueOf(": " + ScreenSlidePageFragment.this.repeatCounter));
                    ScreenSlidePageFragment.this.repeatBtn.setBackgroundResource(R.drawable.repeat_press);
                } catch (Exception unused) {
                }
            }
        });
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(this.buttonsLayoutWidth, this.buttonsLayoutHeight);
        this.layoutParams = layoutParams6;
        layoutParams6.addRule(10, -1);
        this.layoutParams.setMargins(calWidth(625.0f), calHeight(1385.0f), 0, 0);
        this.repeatText.setTextSize(18.0f);
        this.repeatText.setLayoutParams(this.layoutParams);
        this.menuBtn.setTag("ShowMenu");
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(this.buttonsLayoutWidth, this.buttonsLayoutHeight);
        this.layoutParams = layoutParams7;
        layoutParams7.addRule(11, -1);
        this.layoutParams.setMargins(0, calHeight(1380.0f), calWidth(114.0f), 0);
        this.menuBtn.setLayoutParams(this.layoutParams);
        this.menuBtn.setOnClickListener(this);
        this.gotoBtn.setBackgroundResource(R.drawable.go_btn);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(this.buttonsLayoutWidth, this.buttonsLayoutHeight);
        this.layoutParams = layoutParams8;
        layoutParams8.addRule(11, -1);
        this.layoutParams.addRule(10, -1);
        this.layoutParams.setMargins(0, calHeight(1380.0f), calWidth(250.0f), 0);
        this.gotoBtn.setLayoutParams(this.layoutParams);
        this.gotoBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    if (!ScreenSlidePageFragment.this.gotoTxt.getText().toString().trim().isEmpty() && Integer.parseInt(ScreenSlidePageFragment.this.gotoTxt.getText().toString()) > 0 && Integer.parseInt(ScreenSlidePageFragment.this.gotoTxt.getText().toString()) < 24) {
                        ((InputMethodManager) ScreenSlidePageFragment.this.itemView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(ScreenSlidePageFragment.this.itemView.getWindowToken(), 0);
                        MainActivity.mPager.setCurrentItem(Integer.parseInt(ScreenSlidePageFragment.this.gotoTxt.getText().toString()));
                        ScreenSlidePageFragment.this.gotoTxt.setText("");
                    }
                } catch (Exception unused) {
                }
            }
        });
        this.buttonsLayoutWidth = displayWidth / 9;
        this.buttonsLayoutHeight = displayHeight / 20;
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(this.buttonsLayoutWidth, this.buttonsLayoutHeight);
        this.layoutParams = layoutParams9;
        layoutParams9.addRule(11, -1);
        this.layoutParams.addRule(10, -1);
        this.layoutParams.setMargins(0, calHeight(1380.0f), (int) (((double) displayWidth) / 3.5d), 0);
        this.gotoTxt.setLayoutParams(this.layoutParams);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(calWidth(100.0f), calHeight(100.0f));
        this.layoutParams = layoutParams10;
        layoutParams10.addRule(11, -1);
        this.layoutParams.addRule(10, -1);
        this.layoutParams.setMargins(0, calHeight(1516.0f), calWidth(568.0f), 0);
        this.pageNumbertxt.setLayoutParams(this.layoutParams);
        if (this.mPageNumber == 0) {
            this.playBtn.setVisibility(8);
            this.pauseBtn.setVisibility(8);
            this.stopBtn.setVisibility(8);
            this.repeatBtn.setVisibility(8);
            this.repeatText.setVisibility(8);
            this.menuBtn.setVisibility(8);
            this.gotoTxt.setVisibility(8);
            this.gotoBtn.setVisibility(8);
            this.menuBtn.setVisibility(8);
        } else {
            this.playBtn.setVisibility(0);
            this.pauseBtn.setVisibility(0);
            this.stopBtn.setVisibility(0);
            this.repeatBtn.setVisibility(0);
            this.repeatText.setVisibility(0);
            this.gotoTxt.setVisibility(0);
            this.gotoBtn.setVisibility(0);
            this.menuBtn.setVisibility(0);
        }
        LoadGame(this.mPageNumber);
        if (this.mPageNumber == 23) {
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    ScreenSlidePageFragment.this.ShowAds(ScreenSlidePageFragment.context);
                }
            }, 5000);
        }
        return this.itemView;
    }

    public int getPageNumber() {
        return this.mPageNumber;
    }

    public void CreateRow(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, ArrayList<ImageButton> arrayList, ArrayList<ImageButton> arrayList2) {
        this.allBtns = arrayList;
        this.screenBtns = arrayList2;
        TableLayout tableLayout = new TableLayout(context);
        this.Maintb.addView(tableLayout);
        tableLayout.setPadding(i, i2, 0, 0);
        this.cardsBtn = new ImageButton[2];
        this.btn = new ImageButton(context);
        int i9 = i5;
        for (int i10 = 0; i10 < i9; i10++) {
            TableRow tableRow = new TableRow(context);
            tableLayout.addView(tableRow);
            int i11 = i6;
            for (int i12 = 0; i12 < i11; i12++) {
                tableRow.addView(createImageButton(str, i12, i10, i7, i8, i3, i4));
            }
        }
    }

    public View createImageButton(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        ImageButton imageButton = new ImageButton(context);
        imageButton.setTag(str + "l" + i + "_" + i2);
        this.btnList.add(imageButton.getTag().toString());
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (view.getTag().toString().equals("addressa_l0_0")) {
                    ScreenSlidePageFragment.this.IndexPage(2);
                } else if (view.getTag().toString().equals("addressa_l1_0")) {
                    ScreenSlidePageFragment.this.IndexPage(1);
                } else if (view.getTag().toString().equals("addressa_l0_1")) {
                    ScreenSlidePageFragment.this.IndexPage(5);
                } else if (view.getTag().toString().equals("addressa_l1_1")) {
                    ScreenSlidePageFragment.this.IndexPage(4);
                } else if (view.getTag().toString().equals("addressa_l0_2")) {
                    ScreenSlidePageFragment.this.IndexPage(7);
                } else if (view.getTag().toString().equals("addressa_l1_2")) {
                    ScreenSlidePageFragment.this.IndexPage(6);
                } else if (view.getTag().toString().equals("addressa_l0_3")) {
                    ScreenSlidePageFragment.this.IndexPage(9);
                } else if (view.getTag().toString().equals("addressa_l1_3")) {
                    ScreenSlidePageFragment.this.IndexPage(8);
                } else if (view.getTag().toString().equals("addressa_l0_4")) {
                    ScreenSlidePageFragment.this.IndexPage(13);
                } else if (view.getTag().toString().equals("addressa_l1_4")) {
                    ScreenSlidePageFragment.this.IndexPage(11);
                } else if (view.getTag().toString().equals("addressa_l0_5")) {
                    ScreenSlidePageFragment.this.IndexPage(17);
                } else if (view.getTag().toString().equals("addressa_l1_5")) {
                    ScreenSlidePageFragment.this.IndexPage(14);
                } else if (view.getTag().toString().equals("addressa_l0_6")) {
                    ScreenSlidePageFragment.this.IndexPage(20);
                } else if (view.getTag().toString().equals("addressa_l1_6")) {
                    ScreenSlidePageFragment.this.IndexPage(18);
                } else if (view.getTag().toString().equals("addressa_l0_7")) {
                    ScreenSlidePageFragment.this.IndexPage(21);
                } else if (view.getTag().toString().equals("addressa_l1_7")) {
                    ScreenSlidePageFragment.this.IndexPage(20);
                } else if (view.getTag().toString().equals("addressb_l0_0")) {
                    ScreenSlidePageFragment.this.IndexPage(21);
                } else {
                    try {
                        if (ScreenSlidePageFragment.this.isPlaying.booleanValue() && ScreenSlidePageFragment.pageMedia != null) {
                            ScreenSlidePageFragment.pageMedia.pause();
                            ScreenSlidePageFragment.pageMedia.release();
                            Boolean unused = ScreenSlidePageFragment.this.isStop = true;
                            ScreenSlidePageFragment.this.playBtn.setEnabled(true);
                            ScreenSlidePageFragment.this.isPlaying = false;
                            int unused2 = ScreenSlidePageFragment.this.sound = 0;
                            ScreenSlidePageFragment.this.playBtn.setBackgroundResource(R.drawable.play);
                        }
                        ScreenSlidePageFragment.media.stop();
                        ScreenSlidePageFragment.media.release();
                        for (int i = 0; i < ScreenSlidePageFragment.this.allBtns.size(); i++) {
                            ScreenSlidePageFragment.this.allBtns.get(i).setHovered(true);
                        }
                        ScreenSlidePageFragment.media = MediaPlayer.create(ScreenSlidePageFragment.context, ScreenSlidePageFragment.this.soundsArrays.pageWithLetter.get(MainActivity.mPager.getCurrentItem() - 1)[view.getId()]);
                        ScreenSlidePageFragment.media.start();
                        if (ScreenSlidePageFragment.this.buttonView != null) {
                            ScreenSlidePageFragment.this.buttonView.setBackground(ScreenSlidePageFragment.context.getResources().getDrawable(ScreenSlidePageFragment.context.getResources().getIdentifier(ScreenSlidePageFragment.this.tagg, "drawable", ScreenSlidePageFragment.context.getPackageName())));
                        }
                        View unused3 = ScreenSlidePageFragment.this.buttonView = view;
                        String unused4 = ScreenSlidePageFragment.this.tagg = (String) view.getTag();
                        if (ScreenSlidePageFragment.this.mPageNumber == 4) {
                            if (!ScreenSlidePageFragment.this.tagg.toString().equals("page4c_l2_1")) {
                                if (!ScreenSlidePageFragment.this.tagg.toString().equals("page4c_l3_1")) {
                                    if (!ScreenSlidePageFragment.this.tagg.toString().equals("page4c_l2_3")) {
                                        if (!ScreenSlidePageFragment.this.tagg.toString().equals("page4c_l3_3")) {
                                            ScreenSlidePageFragment.this.imgScreen.setBackgroundDrawable(ScreenSlidePageFragment.context.getResources().getDrawable(ScreenSlidePageFragment.context.getResources().getIdentifier("page4", "drawable", ScreenSlidePageFragment.context.getPackageName())));
                                            view.setBackground(ScreenSlidePageFragment.context.getResources().getDrawable(ScreenSlidePageFragment.context.getResources().getIdentifier(ScreenSlidePageFragment.this.tagg + "_hover", "drawable", ScreenSlidePageFragment.context.getPackageName())));
                                            return;
                                        }
                                    }
                                    ScreenSlidePageFragment.this.imgScreen.setBackgroundDrawable(ScreenSlidePageFragment.context.getResources().getDrawable(ScreenSlidePageFragment.context.getResources().getIdentifier("page4_hover2", "drawable", ScreenSlidePageFragment.context.getPackageName())));
                                    return;
                                }
                            }
                            ScreenSlidePageFragment.this.imgScreen.setBackgroundDrawable(ScreenSlidePageFragment.context.getResources().getDrawable(ScreenSlidePageFragment.context.getResources().getIdentifier("page4_hover1", "drawable", ScreenSlidePageFragment.context.getPackageName())));
                        } else if (ScreenSlidePageFragment.this.mPageNumber == 6) {
                            if (!ScreenSlidePageFragment.this.tagg.toString().equals("page6_l0_1") && !ScreenSlidePageFragment.this.tagg.toString().equals("page6_l1_1") && !ScreenSlidePageFragment.this.tagg.toString().equals("page6_l2_1")) {
                                if (!ScreenSlidePageFragment.this.tagg.toString().equals("page6_l3_1")) {
                                    ScreenSlidePageFragment.this.imgScreen.setBackgroundDrawable(ScreenSlidePageFragment.context.getResources().getDrawable(ScreenSlidePageFragment.context.getResources().getIdentifier("page6", "drawable", ScreenSlidePageFragment.context.getPackageName())));
                                    view.setBackground(ScreenSlidePageFragment.context.getResources().getDrawable(ScreenSlidePageFragment.context.getResources().getIdentifier(ScreenSlidePageFragment.this.tagg + "_hover", "drawable", ScreenSlidePageFragment.context.getPackageName())));
                                    return;
                                }
                            }
                            ScreenSlidePageFragment.this.imgScreen.setBackgroundDrawable(ScreenSlidePageFragment.context.getResources().getDrawable(ScreenSlidePageFragment.context.getResources().getIdentifier("page6_hover", "drawable", ScreenSlidePageFragment.context.getPackageName())));
                        } else if (ScreenSlidePageFragment.this.mPageNumber == 20) {
                            if (!ScreenSlidePageFragment.this.tagg.toString().equals("page20f_l3_0")) {
                                if (!ScreenSlidePageFragment.this.tagg.toString().equals("page20f_l2_0")) {
                                    ScreenSlidePageFragment.this.imgScreen.setBackgroundDrawable(ScreenSlidePageFragment.context.getResources().getDrawable(ScreenSlidePageFragment.context.getResources().getIdentifier("page20", "drawable", ScreenSlidePageFragment.context.getPackageName())));
                                    view.setBackground(ScreenSlidePageFragment.context.getResources().getDrawable(ScreenSlidePageFragment.context.getResources().getIdentifier(ScreenSlidePageFragment.this.tagg + "_hover", "drawable", ScreenSlidePageFragment.context.getPackageName())));
                                    return;
                                }
                            }
                            ScreenSlidePageFragment.this.imgScreen.setBackgroundDrawable(ScreenSlidePageFragment.context.getResources().getDrawable(ScreenSlidePageFragment.context.getResources().getIdentifier("page20_hover", "drawable", ScreenSlidePageFragment.context.getPackageName())));
                        } else {
                            view.setBackground(ScreenSlidePageFragment.context.getResources().getDrawable(ScreenSlidePageFragment.context.getResources().getIdentifier(ScreenSlidePageFragment.this.tagg + "_hover", "drawable", ScreenSlidePageFragment.context.getPackageName())));
                        }
                    } catch (Exception unused5) {
                    }
                }
            }
        });
        Drawable drawable = context.getResources().getDrawable(R.drawable.zz);
        this.letterBtn = drawable;
        imageButton.setImageBitmap(Bitmap.createScaledBitmap(((BitmapDrawable) drawable).getBitmap(), i3, i4, true));
        imageButton.setBackground(context.getResources().getDrawable(context.getResources().getIdentifier(str + "l" + i + "_" + i2, "drawable", context.getPackageName())));
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(i3, i4);
        int i7 = 0;
        layoutParams2.setMargins(i5, 0, 0, i6);
        imageButton.setLayoutParams(layoutParams2);
        this.allBtns.add(imageButton);
        if (this.allBtns.size() > 0) {
            while (i7 < this.allBtns.size()) {
                this.allBtns.get(i7).setId(i7);
                i7++;
            }
        } else {
            while (i7 < this.screenBtns.size()) {
                this.screenBtns.get(i7).setId(i7);
                i7++;
            }
        }
        return imageButton;
    }

    private void LoadGame(int i) {
        int i2 = i;
        if (i2 > 0) {
            this.pageNumbertxt.setText("" + i2);
        }
        String str = this.imgNameList.get(i2);
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1147692044:
                if (str.equals("address")) {
                    c = 0;
                    break;
                }
                break;
            case -995753746:
                if (str.equals("page10")) {
                    c = 1;
                    break;
                }
                break;
            case -995753745:
                if (str.equals("page11")) {
                    c = 2;
                    break;
                }
                break;
            case -995753744:
                if (str.equals("page12")) {
                    c = 3;
                    break;
                }
                break;
            case -995753743:
                if (str.equals("page13")) {
                    c = 4;
                    break;
                }
                break;
            case -995753742:
                if (str.equals("page14")) {
                    c = 5;
                    break;
                }
                break;
            case -995753741:
                if (str.equals("page15")) {
                    c = 6;
                    break;
                }
                break;
            case -995753740:
                if (str.equals("page16")) {
                    c = 7;
                    break;
                }
                break;
            case -995753739:
                if (str.equals("page17")) {
                    c = 8;
                    break;
                }
                break;
            case -995753738:
                if (str.equals("page18")) {
                    c = 9;
                    break;
                }
                break;
            case -995753737:
                if (str.equals("page19")) {
                    c = 10;
                    break;
                }
                break;
            case -995753715:
                if (str.equals("page20")) {
                    c = 11;
                    break;
                }
                break;
            case -995753714:
                if (str.equals("page21")) {
                    c = 12;
                    break;
                }
                break;
            case -995753713:
                if (str.equals("page22")) {
                    c = 13;
                    break;
                }
                break;
            case -995753712:
                if (str.equals("page23")) {
                    c = 14;
                    break;
                }
                break;
            case 106426242:
                if (str.equals("page1")) {
                    c = 15;
                    break;
                }
                break;
            case 106426243:
                if (str.equals("page2")) {
                    c = 16;
                    break;
                }
                break;
            case 106426244:
                if (str.equals("page3")) {
                    c = 17;
                    break;
                }
                break;
            case 106426245:
                if (str.equals("page4")) {
                    c = 18;
                    break;
                }
                break;
            case 106426246:
                if (str.equals("page5")) {
                    c = 19;
                    break;
                }
                break;
            case 106426247:
                if (str.equals("page6")) {
                    c = 20;
                    break;
                }
                break;
            case 106426248:
                if (str.equals("page7")) {
                    c = 21;
                    break;
                }
                break;
            case 106426249:
                if (str.equals("page8")) {
                    c = 22;
                    break;
                }
                break;
            case 106426250:
                if (str.equals("page9")) {
                    c = 23;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                CreateRow("addressa_", calLeft(110.0f), calTop(100.0f), calLeft(10.5f), calBottom(5.0f), 8, 2, calWidth(523.0f), calHeight(150.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("addressb_", calLeft(400.0f), calTop(5.0f), calLeft(10.5f), calBottom(0.0f), 1, 1, calWidth(523.0f), calHeight(150.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 1:
                ShowExplainScreen(854, 752);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p10", "drawable", context.getPackageName())));
                this.imgScreen.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("page10", "drawable", context.getPackageName())));
                CreateRow("page10_", calLeft(100.0f), calTop(100.0f), calLeft(10.5f), calBottom(11.25f), 10, 7, calWidth(145.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 2:
                ShowExplainScreen(854, 910);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p11", "drawable", context.getPackageName())));
                CreateRow("page11a_", calLeft(100.0f), calTop(105.0f), calLeft(10.5f), calBottom(10.0f), 1, 7, calWidth(145.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("p11title_", calLeft(100.0f), calTop(30.0f), calLeft(10.5f), calBottom(15.0f), 1, 1, calWidth(1075.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page11b_", calLeft(100.0f), calTop(45.0f), calLeft(12.5f), calBottom(12.8f), 7, 6, calWidth(169.0f), calHeight(120.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 3:
                ShowExplainScreen(854, 752);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p12", "drawable", context.getPackageName())));
                CreateRow("page12a_", calLeft(100.0f), calTop(105.0f), calLeft(12.5f), calBottom(7.8f), 9, 6, calWidth(169.0f), calHeight(118.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page12b_", calLeft(100.0f), calTop(1.5f), calLeft(13.5f), calBottom(7.8f), 1, 3, calWidth(345.0f), calHeight(118.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 4:
                ShowExplainScreen(854, 752);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p13", "drawable", context.getPackageName())));
                CreateRow("page13a_", calLeft(100.0f), calTop(105.0f), calLeft(9.5f), calBottom(7.0f), 1, 2, calWidth(535.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("p13title_", calLeft(100.0f), calTop(5.0f), calLeft(10.5f), calBottom(9.0f), 1, 1, calWidth(1075.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page13b_", calLeft(100.0f), calTop(1.5f), calLeft(12.5f), calBottom(10.8f), 8, 6, calWidth(169.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 5:
                ShowExplainScreen(854, 408);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p14", "drawable", context.getPackageName())));
                CreateRow("p14title_", calLeft(100.0f), calTop(105.0f), calLeft(10.5f), calBottom(12.5f), 1, 1, calWidth(1075.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page14a_", calLeft(100.0f), calTop(1.5f), calLeft(12.5f), calBottom(10.5f), 3, 6, calWidth(169.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page14b_", calLeft(100.0f), calTop(1.5f), calLeft(11.0f), calBottom(10.0f), 1, 5, calWidth(205.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page14c_", calLeft(100.0f), calTop(1.5f), calLeft(12.5f), calBottom(10.0f), 3, 6, calWidth(169.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page14d_", calLeft(100.0f), calTop(1.5f), calLeft(11.0f), calBottom(10.0f), 2, 5, calWidth(205.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 6:
                ShowExplainScreen(854, 408);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p15", "drawable", context.getPackageName())));
                CreateRow("page15a_", calLeft(100.0f), calTop(105.0f), calLeft(11.0f), calBottom(10.0f), 5, 5, calWidth(205.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page15b_", calLeft(100.0f), calTop(1.5f), calLeft(11.0f), calBottom(10.0f), 1, 4, calWidth(260.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page15c_", calLeft(100.0f), calTop(1.5f), calLeft(11.0f), calBottom(8.0f), 1, 5, calWidth(205.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page15d_", calLeft(100.0f), calTop(1.5f), calLeft(11.0f), calBottom(10.0f), 2, 4, calWidth(260.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page15e_", calLeft(100.0f), calTop(1.5f), calLeft(11.0f), calBottom(8.0f), 1, 5, calWidth(205.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 7:
                ShowExplainScreen(854, 408);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p16", "drawable", context.getPackageName())));
                CreateRow("page16a_", calLeft(100.0f), calTop(105.0f), calLeft(11.0f), calBottom(10.0f), 1, 5, calWidth(205.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page16b_", calLeft(100.0f), calTop(1.5f), calLeft(11.0f), calBottom(10.0f), 1, 4, calWidth(260.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page16c_", calLeft(100.0f), calTop(1.5f), calLeft(11.0f), calBottom(8.0f), 1, 5, calWidth(205.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page16d_", calLeft(100.0f), calTop(1.5f), calLeft(11.0f), calBottom(11.5f), 2, 4, calWidth(260.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page16e_", calLeft(100.0f), calTop(1.5f), calLeft(11.0f), calBottom(9.0f), 2, 5, calWidth(205.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page16f_", calLeft(100.0f), calTop(1.5f), calLeft(13.5f), calBottom(7.3f), 2, 3, calWidth(345.0f), calHeight(118.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page16g_", calLeft(100.0f), calTop(1.5f), calLeft(9.5f), calBottom(7.0f), 1, 2, calWidth(530.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 8:
                ShowExplainScreen(854, 752);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p17", "drawable", context.getPackageName())));
                CreateRow("page17a_", calLeft(100.0f), calTop(106.0f), calLeft(9.5f), calBottom(11.0f), 3, 2, calWidth(530.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page17b_", calLeft(100.0f), calTop(1.5f), calLeft(10.5f), calBottom(10.0f), 2, 1, calWidth(1070.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page17c_", calLeft(100.0f), calTop(1.5f), calLeft(9.5f), calBottom(10.0f), 1, 2, calWidth(530.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("p17title_", calLeft(100.0f), calTop(1.5f), calLeft(10.5f), calBottom(8.0f), 1, 1, calWidth(1070.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page17d_", calLeft(100.0f), calTop(1.5f), calLeft(10.5f), calBottom(10.8f), 3, 7, calWidth(145.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 9:
                ShowExplainScreen(854, 684);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p18", "drawable", context.getPackageName())));
                CreateRow("page18a_", calLeft(100.0f), calTop(105.0f), calLeft(10.5f), calBottom(10.8f), 7, 7, calWidth(145.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("p18title_", calLeft(100.0f), calTop(1.5f), calLeft(10.5f), calBottom(8.0f), 1, 1, calWidth(1070.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page18b_", calLeft(100.0f), calTop(1.5f), calLeft(11.0f), calBottom(11.0f), 1, 5, calWidth(205.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page18c_", calLeft(100.0f), calTop(1.5f), calLeft(12.5f), calBottom(10.0f), 1, 6, calWidth(169.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 10:
                ShowExplainScreen(854, 684);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p19", "drawable", context.getPackageName())));
                CreateRow("page19a_", calLeft(100.0f), calTop(105.0f), calLeft(11.0f), calBottom(10.0f), 4, 5, calWidth(205.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page19b_", calLeft(100.0f), calTop(1.5f), calLeft(12.5f), calBottom(10.0f), 1, 6, calWidth(169.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page19c_", calLeft(100.0f), calTop(1.5f), calLeft(11.0f), calBottom(10.0f), 1, 5, calWidth(205.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page19d_", calLeft(100.0f), calTop(1.5f), calLeft(11.0f), calBottom(10.0f), 1, 4, calWidth(260.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page19e_", calLeft(100.0f), calTop(1.5f), calLeft(14.0f), calBottom(7.3f), 3, 3, calWidth(345.0f), calHeight(118.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 11:
                ShowExplainScreen(854, 684);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p19", "drawable", context.getPackageName())));
                this.imgScreen.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("page20", "drawable", context.getPackageName())));
                CreateRow("page20a_", calLeft(100.0f), calTop(102.5f), calLeft(9.5f), calBottom(11.0f), 1, 2, calWidth(530.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("p20title_", calLeft(100.0f), calTop(1.5f), calLeft(10.5f), calBottom(8.0f), 1, 1, calWidth(1075.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page20b_", calLeft(100.0f), calTop(1.5f), calLeft(12.5f), calBottom(10.0f), 1, 6, calWidth(169.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page20c_", calLeft(100.0f), calTop(1.5f), calLeft(11.0f), calBottom(10.0f), 2, 4, calWidth(260.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page20d_", calLeft(100.0f), calTop(1.5f), calLeft(14.0f), calBottom(7.3f), 2, 3, calWidth(345.0f), calHeight(118.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page20e_", calLeft(100.0f), calTop(1.5f), calLeft(9.5f), calBottom(11.0f), 2, 2, calWidth(530.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page20f_", calLeft(100.0f), calTop(1.5f), calLeft(11.0f), calBottom(10.0f), 1, 4, calWidth(260.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 12:
                ShowExplainScreen(854, 684);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p21", "drawable", context.getPackageName())));
                CreateRow("page21a_", calLeft(100.0f), calTop(105.0f), calLeft(11.0f), calBottom(10.0f), 1, 4, calWidth(260.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page21b_", calLeft(100.0f), calTop(1.5f), calLeft(14.0f), calBottom(7.3f), 1, 3, calWidth(345.0f), calHeight(118.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page21c_", calLeft(100.0f), calTop(1.5f), calLeft(9.5f), calBottom(11.0f), 1, 2, calWidth(530.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("p21titlea_", calLeft(100.0f), calTop(1.5f), calLeft(10.5f), calBottom(8.0f), 1, 1, calWidth(1075.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page21d_", calLeft(100.0f), calTop(1.5f), calLeft(11.0f), calBottom(8.0f), 1, 4, calWidth(260.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page21e_", calLeft(100.0f), calTop(1.5f), calLeft(14.0f), calBottom(7.3f), 2, 3, calWidth(345.0f), calHeight(118.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page21f_", calLeft(100.0f), calTop(1.5f), calLeft(9.5f), calBottom(9.0f), 1, 2, calWidth(530.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("p21titleb_", calLeft(100.0f), calTop(1.5f), calLeft(10.5f), calBottom(7.5f), 1, 1, calWidth(1075.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page21g_", calLeft(100.0f), calTop(1.5f), calLeft(11.0f), calBottom(8.0f), 1, 4, calWidth(260.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 13:
                ShowExplainScreen(854, 1056);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p22", "drawable", context.getPackageName())));
                CreateRow("page22a_", calLeft(100.0f), calTop(105.0f), calLeft(11.0f), calBottom(10.0f), 1, 4, calWidth(260.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page22b_", calLeft(100.0f), calTop(1.5f), calLeft(14.0f), calBottom(7.3f), 2, 3, calWidth(345.0f), calHeight(118.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page22c_", calLeft(100.0f), calTop(1.5f), calLeft(9.5f), calBottom(11.0f), 2, 2, calWidth(530.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page22d_", calLeft(100.0f), calTop(1.5f), calLeft(11.0f), calBottom(8.0f), 1, 4, calWidth(260.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page22e_", calLeft(100.0f), calTop(1.5f), calLeft(14.0f), calBottom(7.3f), 1, 3, calWidth(345.0f), calHeight(118.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page22f_", calLeft(100.0f), calTop(1.5f), calLeft(9.5f), calBottom(9.0f), 1, 2, calWidth(530.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page22g_", calLeft(100.0f), calTop(1.5f), calLeft(14.0f), calBottom(7.3f), 2, 3, calWidth(345.0f), calHeight(118.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 14:
                ShowExplainScreen(854, 1056);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p23", "drawable", context.getPackageName())));
                this.imgScreen.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("page23", "drawable", context.getPackageName())));
                CreateRow("page23a_", calLeft(100.0f), calTop(105.0f), calLeft(14.0f), calBottom(7.3f), 3, 3, calWidth(345.0f), calHeight(118.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page23b_", calLeft(100.0f), calTop(1.5f), calLeft(11.0f), calBottom(8.0f), 1, 4, calWidth(260.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 15:
                this.menuBtn.setVisibility(8);
                int calLeft = calLeft(300.0f);
                int calTop = calTop(50.0f);
                CreateRow("bas_", calLeft, calTop, calLeft(10.5f), calBottom(8.0f), 1, 1, calWidth(672.0f), calHeight(130.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("p1title_", calLeft(100.0f), calTop(1.09f), calLeft(10.5f), calBottom(8.5f), 1, 1, calWidth(1075.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page1_", calLeft(103.0f), calTop(9.0f), calLeft(11.0f), calBottom(12.0f), 6, 5, calWidth(205.0f), calHeight(161.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 16:
                ShowExplainScreen(854, 678);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p2", "drawable", context.getPackageName())));
                CreateRow("p2title_", calLeft(100.0f), calTop(100.0f), calLeft(10.5f), calBottom(6.0f), 1, 1, calWidth(1075.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page2_", calLeft(100.0f), calTop(5.5f), calLeft(12.0f), calBottom(11.638f), 9, 6, calWidth(169.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 17:
                ShowExplainScreen(854, 678);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p2", "drawable", context.getPackageName())));
                CreateRow("page3_", calLeft(100.0f), calTop(107.5f), calLeft(12.0f), calBottom(11.638f), 10, 6, calWidth(169.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 18:
                ShowExplainScreen(854, 678);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p4", "drawable", context.getPackageName())));
                this.imgScreen.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("page4", "drawable", context.getPackageName())));
                int calLeft2 = calLeft(100.0f);
                int calTop2 = calTop(106.0f);
                int calLeft3 = calLeft(12.0f);
                CreateRow("page4a_", calLeft2, calTop2, calLeft3, calBottom(10.0f), 2, 5, calWidth(205.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page4b_", calLeft(100.0f), calTop(1.3f), calLeft(12.0f), calBottom(11.6f), 1, 3, calWidth(348.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("p4title_", calLeft(100.0f), calTop(1.5f), calLeft(10.5f), calBottom(6.0f), 1, 1, calWidth(1075.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page4c_", calLeft(100.0f), calTop(12.0f), calLeft(15.0f), calBottom(11.7f), 4, 4, calWidth(256.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 19:
                ShowExplainScreen(854, 678);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p5", "drawable", context.getPackageName())));
                CreateRow("p5title_", calLeft(100.0f), calTop(100.0f), calLeft(10.5f), calBottom(6.0f), 1, 1, calWidth(1075.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page5_", calLeft(100.0f), calTop(5.5f), calLeft(10.5f), calBottom(10.8f), 9, 8, calWidth(126.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 20:
                ShowExplainScreen(854, 947);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p6", "drawable", context.getPackageName())));
                this.imgScreen.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("page6", "drawable", context.getPackageName())));
                CreateRow("page6_", calLeft(100.0f), calTop(105.0f), calLeft(10.5f), calBottom(10.8f), 10, 8, calWidth(126.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case zzbcj.zzt.zzm:
                ShowExplainScreen(854, 678);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p7", "drawable", context.getPackageName())));
                CreateRow("page7a_", calLeft(100.0f), calTop(105.0f), calLeft(10.5f), calBottom(10.8f), 3, 8, calWidth(126.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("p7title_", calLeft(100.0f), calTop(1.5f), calLeft(10.5f), calBottom(9.0f), 1, 1, calWidth(1075.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page7b_", calLeft(100.0f), calTop(1.5f), calLeft(12.5f), calBottom(10.8f), 6, 6, calWidth(169.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 22:
                ShowExplainScreen(854, 678);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p8", "drawable", context.getPackageName())));
                CreateRow("page8a_", calLeft(100.0f), calTop(102.0f), calLeft(12.5f), calBottom(10.8f), 3, 6, calWidth(169.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("p8title_", calLeft(100.0f), calTop(1.5f), calLeft(10.5f), calBottom(7.0f), 1, 1, calWidth(1075.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page8b_", calLeft(100.0f), calTop(15.0f), calLeft(10.5f), calBottom(15.0f), 5, 7, calWidth(145.0f), calHeight(135.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            case 23:
                ShowExplainScreen(854, 752);
                this.infoHelpBg.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("dialog_p9", "drawable", context.getPackageName())));
                this.imgScreen.setBackgroundDrawable(context.getResources().getDrawable(context.getResources().getIdentifier("page9", "drawable", context.getPackageName())));
                CreateRow("p9title_", calLeft(100.0f), calTop(100.0f), calLeft(10.5f), calBottom(10.8f), 1, 1, calWidth(1075.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                CreateRow("page9_", calLeft(100.0f), calTop(1.5f), calLeft(10.5f), calBottom(11.25f), 9, 7, calWidth(145.0f), calHeight(115.0f), this.allBtns, this.screenBtns);
                ScreenBtns();
                return;
            default:
                return;
        }
    }

    public void XmlParser(Activity activity) {
        int i;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            XmlResourceParser xml = activity.getResources().getXml(R.xml.img_data);
            this.xpp = xml;
            xml.next();
            int eventType = this.xpp.getEventType();
            while (true) {
                if (eventType == 1) {
                    break;
                }
                if (eventType == 0) {
                    stringBuffer.append("--- Start XML ---");
                } else if (eventType == 2) {
                    if (this.xpp.getAttributeCount() > 0) {
                        this.imgNameList.add(this.xpp.getAttributeValue(3));
                        this.soundNameList.add(this.xpp.getAttributeValue(5));
                        this.widthNum.add(this.xpp.getAttributeValue(7));
                        this.heightNum.add(this.xpp.getAttributeValue(1));
                        this.columnNum.add(this.xpp.getAttributeValue(0));
                        this.rowNum.add(this.xpp.getAttributeValue(4));
                        this.leftNum.add(this.xpp.getAttributeValue(2));
                        this.topNum.add(this.xpp.getAttributeValue(6));
                    }
                } else if (eventType == 3) {
                    stringBuffer.append("\nEND_TAG: " + this.xpp.getName());
                } else if (eventType == 4) {
                    this.imgNameList.add(String.valueOf(this.xpp.getText()));
                }
                eventType = this.xpp.next();
            }
            stringBuffer.append("\n--- End XML ---");
            for (i = 0; i < this.imgNameList.size(); i++) {
            }
        } catch (Exception unused) {
        }
    }

    public void onPageSelected(int i) {
        this.infoHelpBg.setVisibility(8);
        ClearAndStopMedia();
    }

    private void ClearAndStopMedia() {
        View view = this.buttonView;
        if (view != null) {
            view.setBackground(context.getResources().getDrawable(context.getResources().getIdentifier(this.tagg, "drawable", context.getPackageName())));
        }
        this.playBtn.setBackgroundResource(R.drawable.play);
        ArrayList<ImageButton> arrayList = this.allBtns;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.screenBtns.clear();
        MediaPlayer mediaPlayer = media;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        try {
            if (pageMedia != null) {
                this.isStop = true;
                this.playBtn.setEnabled(true);
                pageMedia.pause();
                pageMedia.release();
                this.isStop = true;
                this.isPlaying = false;
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r12) {
        /*
            r11 = this;
            java.lang.String r0 = ": "
            r11.SetPlayerButtonImage()     // Catch:{ Exception -> 0x018a }
            java.lang.Object r12 = r12.getTag()     // Catch:{ Exception -> 0x018a }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x018a }
            int r1 = r12.hashCode()     // Catch:{ Exception -> 0x018a }
            java.lang.String r2 = "Pause"
            java.lang.String r3 = "Stop"
            java.lang.String r4 = "Play"
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 0
            r10 = 1
            switch(r1) {
                case -1638335092: goto L_0x004d;
                case -274398692: goto L_0x0043;
                case 2490196: goto L_0x003b;
                case 2587682: goto L_0x0033;
                case 76887510: goto L_0x002b;
                case 847478196: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0057
        L_0x0021:
            java.lang.String r1 = "InfoHelpBG"
            boolean r12 = r12.equals(r1)     // Catch:{ Exception -> 0x018a }
            if (r12 == 0) goto L_0x0057
            r12 = r6
            goto L_0x0058
        L_0x002b:
            boolean r12 = r12.equals(r2)     // Catch:{ Exception -> 0x018a }
            if (r12 == 0) goto L_0x0057
            r12 = r10
            goto L_0x0058
        L_0x0033:
            boolean r12 = r12.equals(r3)     // Catch:{ Exception -> 0x018a }
            if (r12 == 0) goto L_0x0057
            r12 = r8
            goto L_0x0058
        L_0x003b:
            boolean r12 = r12.equals(r4)     // Catch:{ Exception -> 0x018a }
            if (r12 == 0) goto L_0x0057
            r12 = r9
            goto L_0x0058
        L_0x0043:
            java.lang.String r1 = "ShowMenu"
            boolean r12 = r12.equals(r1)     // Catch:{ Exception -> 0x018a }
            if (r12 == 0) goto L_0x0057
            r12 = r7
            goto L_0x0058
        L_0x004d:
            java.lang.String r1 = "CloseInfoHelpBG"
            boolean r12 = r12.equals(r1)     // Catch:{ Exception -> 0x018a }
            if (r12 == 0) goto L_0x0057
            r12 = r5
            goto L_0x0058
        L_0x0057:
            r12 = -1
        L_0x0058:
            if (r12 == 0) goto L_0x0103
            if (r12 == r10) goto L_0x00e2
            if (r12 == r8) goto L_0x00a4
            r0 = 1000(0x3e8, double:4.94E-321)
            if (r12 == r7) goto L_0x0088
            if (r12 == r6) goto L_0x007a
            if (r12 == r5) goto L_0x0068
            goto L_0x018a
        L_0x0068:
            com.daimajia.androidanimations.library.fading_exits.FadeOutAnimator r12 = new com.daimajia.androidanimations.library.fading_exits.FadeOutAnimator     // Catch:{ Exception -> 0x018a }
            r12.<init>()     // Catch:{ Exception -> 0x018a }
            r12.setDuration(r0)     // Catch:{ Exception -> 0x018a }
            android.widget.RelativeLayout r0 = r11.infoHelpBg     // Catch:{ Exception -> 0x018a }
            r12.setTarget(r0)     // Catch:{ Exception -> 0x018a }
            r12.start()     // Catch:{ Exception -> 0x018a }
            goto L_0x018a
        L_0x007a:
            android.widget.RelativeLayout r12 = r11.infoHelpBg     // Catch:{ Exception -> 0x018a }
            r0 = 8
            r12.setVisibility(r0)     // Catch:{ Exception -> 0x018a }
            android.widget.ImageView r12 = r11.closeHelpBtn     // Catch:{ Exception -> 0x018a }
            r12.setVisibility(r0)     // Catch:{ Exception -> 0x018a }
            goto L_0x018a
        L_0x0088:
            android.widget.RelativeLayout r12 = r11.infoHelpBg     // Catch:{ Exception -> 0x018a }
            r12.setVisibility(r9)     // Catch:{ Exception -> 0x018a }
            android.widget.ImageView r12 = r11.closeHelpBtn     // Catch:{ Exception -> 0x018a }
            r12.setVisibility(r9)     // Catch:{ Exception -> 0x018a }
            com.daimajia.androidanimations.library.sliders.SlideInRightAnimator r12 = new com.daimajia.androidanimations.library.sliders.SlideInRightAnimator     // Catch:{ Exception -> 0x018a }
            r12.<init>()     // Catch:{ Exception -> 0x018a }
            r12.setDuration(r0)     // Catch:{ Exception -> 0x018a }
            android.widget.RelativeLayout r0 = r11.infoHelpBg     // Catch:{ Exception -> 0x018a }
            r12.setTarget(r0)     // Catch:{ Exception -> 0x018a }
            r12.start()     // Catch:{ Exception -> 0x018a }
            goto L_0x018a
        L_0x00a4:
            r11.currentControlPress = r3     // Catch:{ Exception -> 0x018a }
            android.media.MediaPlayer r12 = pageMedia     // Catch:{ Exception -> 0x018a }
            r12.pause()     // Catch:{ Exception -> 0x018a }
            android.media.MediaPlayer r12 = pageMedia     // Catch:{ Exception -> 0x018a }
            r12.release()     // Catch:{ Exception -> 0x018a }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x018a }
            r11.isPlaying = r12     // Catch:{ Exception -> 0x018a }
            android.widget.ImageView r12 = r11.playBtn     // Catch:{ Exception -> 0x018a }
            r12.setEnabled(r10)     // Catch:{ Exception -> 0x018a }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r10)     // Catch:{ Exception -> 0x018a }
            r11.isStop = r12     // Catch:{ Exception -> 0x018a }
            r11.sound = r9     // Catch:{ Exception -> 0x018a }
            r11.repeatCounter = r9     // Catch:{ Exception -> 0x018a }
            android.widget.TextView r12 = r11.repeatText     // Catch:{ Exception -> 0x018a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018a }
            r1.<init>(r0)     // Catch:{ Exception -> 0x018a }
            int r0 = r11.repeatCounter     // Catch:{ Exception -> 0x018a }
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ Exception -> 0x018a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x018a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x018a }
            r12.setText(r0)     // Catch:{ Exception -> 0x018a }
            r11.SetPlayerButtonImage()     // Catch:{ Exception -> 0x018a }
            goto L_0x018a
        L_0x00e2:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r10)     // Catch:{ Exception -> 0x018a }
            r11.isStop = r12     // Catch:{ Exception -> 0x018a }
            r11.currentControlPress = r2     // Catch:{ Exception -> 0x018a }
            android.media.MediaPlayer r12 = pageMedia     // Catch:{ Exception -> 0x018a }
            r12.pause()     // Catch:{ Exception -> 0x018a }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x018a }
            r11.isPlaying = r12     // Catch:{ Exception -> 0x018a }
            android.widget.ImageView r12 = r11.playBtn     // Catch:{ Exception -> 0x018a }
            r12.setEnabled(r10)     // Catch:{ Exception -> 0x018a }
            android.widget.ImageView r12 = r11.pauseBtn     // Catch:{ Exception -> 0x018a }
            int r0 = com.zoomat.noorania.R.drawable.pause_press     // Catch:{ Exception -> 0x018a }
            r12.setBackgroundResource(r0)     // Catch:{ Exception -> 0x018a }
            goto L_0x018a
        L_0x0103:
            r11.currentControlPress = r4     // Catch:{ Exception -> 0x018a }
            java.lang.Boolean r12 = r11.isStop     // Catch:{ Exception -> 0x018a }
            boolean r12 = r12.booleanValue()     // Catch:{ Exception -> 0x018a }
            if (r12 != r10) goto L_0x0162
            android.view.View r12 = r11.buttonView     // Catch:{ Exception -> 0x018a }
            if (r12 == 0) goto L_0x0132
            android.content.Context r0 = context     // Catch:{ Exception -> 0x018a }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x018a }
            android.content.Context r1 = context     // Catch:{ Exception -> 0x018a }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ Exception -> 0x018a }
            java.lang.String r2 = r11.tagg     // Catch:{ Exception -> 0x018a }
            java.lang.String r3 = "drawable"
            android.content.Context r4 = context     // Catch:{ Exception -> 0x018a }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ Exception -> 0x018a }
            int r1 = r1.getIdentifier(r2, r3, r4)     // Catch:{ Exception -> 0x018a }
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)     // Catch:{ Exception -> 0x018a }
            r12.setBackground(r0)     // Catch:{ Exception -> 0x018a }
        L_0x0132:
            android.content.Context r12 = context     // Catch:{ Exception -> 0x018a }
            com.zoomat.noorania.SoundsArray r0 = r11.soundsArrays     // Catch:{ Exception -> 0x018a }
            java.util.ArrayList<int[]> r0 = r0.pagesList     // Catch:{ Exception -> 0x018a }
            androidx.viewpager.widget.ViewPager r1 = com.zoomat.noorania.MainActivity.mPager     // Catch:{ Exception -> 0x018a }
            int r1 = r1.getCurrentItem()     // Catch:{ Exception -> 0x018a }
            int r1 = r1 - r10
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x018a }
            int[] r0 = (int[]) r0     // Catch:{ Exception -> 0x018a }
            int r1 = r11.sound     // Catch:{ Exception -> 0x018a }
            r0 = r0[r1]     // Catch:{ Exception -> 0x018a }
            android.media.MediaPlayer r12 = android.media.MediaPlayer.create(r12, r0)     // Catch:{ Exception -> 0x018a }
            pageMedia = r12     // Catch:{ Exception -> 0x018a }
            r12.start()     // Catch:{ Exception -> 0x018a }
            int r12 = r11.sound     // Catch:{ Exception -> 0x018a }
            int r12 = r12 + r10
            r11.sound = r12     // Catch:{ Exception -> 0x018a }
            android.media.MediaPlayer r12 = pageMedia     // Catch:{ Exception -> 0x018a }
            r12.setOnCompletionListener(r11)     // Catch:{ Exception -> 0x018a }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x018a }
            r11.isStop = r12     // Catch:{ Exception -> 0x018a }
        L_0x0162:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r10)     // Catch:{ Exception -> 0x018a }
            r11.isPlaying = r12     // Catch:{ Exception -> 0x018a }
            android.widget.ImageView r12 = r11.playBtn     // Catch:{ Exception -> 0x018a }
            r12.setEnabled(r9)     // Catch:{ Exception -> 0x018a }
            android.widget.ImageView r12 = r11.pauseBtn     // Catch:{ Exception -> 0x018a }
            r12.setEnabled(r10)     // Catch:{ Exception -> 0x018a }
            android.widget.ImageView r12 = r11.stopBtn     // Catch:{ Exception -> 0x018a }
            r12.setEnabled(r10)     // Catch:{ Exception -> 0x018a }
            android.widget.ImageView r12 = r11.playBtn     // Catch:{ Exception -> 0x018a }
            int r0 = com.zoomat.noorania.R.drawable.play_press     // Catch:{ Exception -> 0x018a }
            r12.setBackgroundResource(r0)     // Catch:{ Exception -> 0x018a }
            android.media.MediaPlayer r12 = media     // Catch:{ Exception -> 0x018a }
            if (r12 == 0) goto L_0x018a
            r12.pause()     // Catch:{ Exception -> 0x018a }
            android.media.MediaPlayer r12 = media     // Catch:{ Exception -> 0x018a }
            r12.seekTo(r9)     // Catch:{ Exception -> 0x018a }
        L_0x018a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zoomat.noorania.ScreenSlidePageFragment.onClick(android.view.View):void");
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        String str = this.currentControlPress;
        str.hashCode();
        if (str.equals("Play") && this.sound < this.soundsArrays.pagesList.get(MainActivity.mPager.getCurrentItem() - 1).length) {
            MediaPlayer create = MediaPlayer.create(context, this.soundsArrays.pagesList.get(MainActivity.mPager.getCurrentItem() - 1)[this.sound]);
            pageMedia = create;
            create.setOnCompletionListener(this);
            pageMedia.start();
            int i = this.sound + 1;
            this.sound = i;
            if (this.repeatCounter > 0 && i == this.soundsArrays.pagesList.get(MainActivity.mPager.getCurrentItem() - 1).length) {
                this.sound = 0;
                this.repeatCounter--;
            }
        }
    }

    private void SetPlayerButtonImage() {
        this.playBtn.setBackgroundResource(R.drawable.play);
        this.pauseBtn.setBackgroundResource(R.drawable.pause);
        this.stopBtn.setBackgroundResource(R.drawable.stop);
        this.repeatBtn.setBackgroundResource(R.drawable.repeat);
    }

    private void ShowExplainScreen(int i, int i2) {
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(calWidth((float) i), calHeight((float) i2));
        this.layoutParams = layoutParams2;
        layoutParams2.addRule(11, -1);
        this.layoutParams.addRule(12, -1);
        this.layoutParams.setMargins(0, 0, calWidth(70.0f), calHeight(70.0f));
        this.infoHelpBg.setBackgroundResource(R.drawable.dialog_p2);
        this.infoHelpBg.setLayoutParams(this.layoutParams);
        this.infoHelpBg.setTag("InfoHelpBG");
        this.infoHelpBg.setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(calWidth(75.0f), calHeight(70.0f));
        this.layoutParams = layoutParams3;
        layoutParams3.addRule(11, -1);
        this.layoutParams.addRule(10, -1);
        this.layoutParams.setMargins(0, calHeight(70.0f), calWidth(20.0f), 0);
        this.closeHelpBtn.setLayoutParams(this.layoutParams);
        this.closeHelpBtn.setBackgroundResource(R.drawable.close);
        this.closeHelpBtn.setTag("CloseInfoHelpBG");
        this.closeHelpBtn.setOnClickListener(this);
    }

    public void pageChange(int i) {
        this.infoHelpBg.setVisibility(8);
    }

    public void ShowAds(Context context2) {
        InterstitialAd.load(context, "ca-app-pub-1695098347194811/7295328982", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                ScreenSlidePageFragment.super.onAdLoaded(interstitialAd);
                Log.d("Ad-Test", "Add Load");
                InterstitialAd unused = ScreenSlidePageFragment.this.mInterstitialAd = interstitialAd;
                ScreenSlidePageFragment.this.mInterstitialAd.show((Activity) ScreenSlidePageFragment.context);
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                ScreenSlidePageFragment.super.onAdFailedToLoad(loadAdError);
                Log.d("Ad-Test", "Add Faild");
                InterstitialAd unused = ScreenSlidePageFragment.this.mInterstitialAd = null;
            }
        });
    }

    /* access modifiers changed from: private */
    public void IndexPage(int i) {
        MainActivity.mPager.setCurrentItem(i);
    }

    public void onResume() {
        ScreenSlidePageFragment.super.onResume();
        try {
            this.isPlaying = false;
            this.isStop = true;
            this.playBtn.setEnabled(true);
            this.playBtn.setBackgroundResource(R.drawable.play);
        } catch (Exception unused) {
        }
    }

    public int calHeight(float f) {
        return (int) (((float) displayHeight) * (f / 1740.0f));
    }

    public int calWidth(float f) {
        return (int) (((float) displayWidth) * (f / 1286.0f));
    }

    public int calLeft(float f) {
        return (int) (((float) displayWidth) * (f / 1286.0f));
    }

    public int calTop(float f) {
        return (int) (((float) displayHeight) * (f / 1740.0f));
    }

    public int calBottom(float f) {
        return (int) (((float) displayHeight) * (f / 1740.0f));
    }

    public void ScreenBtns() {
        for (int i = 0; i < this.allBtns.size(); i++) {
            this.screenBtns.add(this.allBtns.get(i));
        }
    }
}
