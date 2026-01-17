package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.util.client.zzw;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfca {
    public final zzbxx zzA;
    public final String zzB;
    public final JSONObject zzC;
    public final JSONObject zzD;
    public final String zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final int zzQ;
    public final int zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final String zzU;
    public final zzfcz zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final int zzY;
    public final String zzZ;
    public final List zza;
    public final List zzaA;
    public final boolean zzaB;
    public final boolean zzaC;
    public final int zzaa;
    public final String zzab;
    public final boolean zzac;
    public final zzbtw zzad;
    public final zzt zzae;
    public final String zzaf;
    public final boolean zzag;
    public final JSONObject zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;
    public final String zzal;
    public final boolean zzam;
    public final String zzan;
    public final String zzao;
    public final String zzap;
    public final boolean zzaq;
    public final boolean zzar;
    public final int zzas;
    public final String zzat;
    public final List zzau;
    public final boolean zzav;
    public final Map zzaw;
    public final zzv zzax;
    public final zzw zzay;
    public final double zzaz;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final int zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final String zzj;
    public final String zzk;
    public final zzbwo zzl;
    public final List zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final int zzq;
    public final List zzr;
    public final zzfcf zzs;
    public final List zzt;
    public final List zzu;
    public final JSONObject zzv;
    public final String zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzfca(android.util.JsonReader r92) throws java.lang.IllegalStateException, java.io.IOException, org.json.JSONException, java.lang.NumberFormatException {
        /*
            r91 = this;
            r0 = r91
            r91.<init>()
            java.util.List r1 = java.util.Collections.emptyList()
            java.util.List r2 = java.util.Collections.emptyList()
            java.util.List r3 = java.util.Collections.emptyList()
            java.util.List r4 = java.util.Collections.emptyList()
            java.util.List r5 = java.util.Collections.emptyList()
            java.util.List r6 = java.util.Collections.emptyList()
            java.util.List r7 = java.util.Collections.emptyList()
            java.util.List r8 = java.util.Collections.emptyList()
            java.util.List r9 = java.util.Collections.emptyList()
            java.util.List r10 = java.util.Collections.emptyList()
            java.util.List r11 = java.util.Collections.emptyList()
            java.util.List r12 = java.util.Collections.emptyList()
            java.util.List r13 = java.util.Collections.emptyList()
            java.util.List r14 = java.util.Collections.emptyList()
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            org.json.JSONObject r16 = new org.json.JSONObject
            r16.<init>()
            org.json.JSONObject r17 = new org.json.JSONObject
            r17.<init>()
            org.json.JSONObject r18 = new org.json.JSONObject
            r18.<init>()
            org.json.JSONObject r19 = new org.json.JSONObject
            r19.<init>()
            org.json.JSONObject r20 = new org.json.JSONObject
            r20.<init>()
            com.google.android.gms.internal.ads.zzfyq.zzn()
            com.google.android.gms.internal.ads.zzfyq r21 = com.google.android.gms.internal.ads.zzfyq.zzn()
            java.util.HashMap r22 = new java.util.HashMap
            r22.<init>()
            com.google.android.gms.internal.ads.zzfyq r23 = com.google.android.gms.internal.ads.zzfyq.zzn()
            com.google.android.gms.internal.ads.zzfyq.zzn()
            r92.beginObject()
            r24 = 0
            r25 = 0
            r27 = 0
            java.lang.String r28 = ""
            r29 = -1
            r30 = r16
            r31 = r17
            r32 = r18
            r33 = r19
            r34 = r20
            r35 = r21
            r36 = r22
            r37 = r23
            r46 = r24
            r52 = r46
            r53 = r52
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r60 = r58
            r61 = r60
            r63 = r61
            r64 = r63
            r65 = r64
            r69 = r65
            r71 = r69
            r77 = r71
            r78 = r77
            r79 = r78
            r80 = r79
            r84 = r80
            r85 = r84
            r86 = r85
            r88 = r86
            r89 = r88
            r90 = r89
            r38 = r25
            r19 = r27
            r40 = r19
            r41 = r40
            r42 = r41
            r43 = r42
            r44 = r43
            r45 = r44
            r47 = r28
            r48 = r47
            r49 = r48
            r50 = r49
            r51 = r50
            r62 = r51
            r66 = r62
            r68 = r66
            r70 = r68
            r72 = r70
            r73 = r72
            r74 = r73
            r75 = r74
            r76 = r75
            r81 = r76
            r82 = r81
            r83 = r82
            r87 = r83
            r59 = r29
            r67 = r59
            r21 = r11
            r20 = r12
            r18 = r13
            r17 = r14
            r16 = r15
            r13 = r90
            r14 = r13
            r15 = r45
            r11 = r87
            r12 = r11
        L_0x0107:
            boolean r22 = r92.hasNext()
            if (r22 == 0) goto L_0x09e1
            java.lang.String r22 = r92.nextName()
            if (r22 != 0) goto L_0x0116
            r23 = r28
            goto L_0x0118
        L_0x0116:
            r23 = r22
        L_0x0118:
            int r22 = r23.hashCode()
            switch(r22) {
                case -2138196627: goto L_0x06ef;
                case -1980587809: goto L_0x06de;
                case -1965512151: goto L_0x06cd;
                case -1964744830: goto L_0x06bc;
                case -1871425831: goto L_0x06ab;
                case -1843156475: goto L_0x069a;
                case -1840512279: goto L_0x0688;
                case -1828733410: goto L_0x0676;
                case -1812055556: goto L_0x0664;
                case -1785028569: goto L_0x0652;
                case -1776946669: goto L_0x0640;
                case -1662989631: goto L_0x062e;
                case -1620470467: goto L_0x061c;
                case -1550155393: goto L_0x060a;
                case -1440104884: goto L_0x05f8;
                case -1439500848: goto L_0x05e6;
                case -1428969291: goto L_0x05d4;
                case -1406227629: goto L_0x05c2;
                case -1403779768: goto L_0x05b0;
                case -1375413093: goto L_0x059e;
                case -1360811658: goto L_0x058c;
                case -1306015996: goto L_0x057a;
                case -1303332046: goto L_0x0568;
                case -1289032093: goto L_0x0556;
                case -1240082064: goto L_0x0544;
                case -1234181075: goto L_0x0532;
                case -1168140544: goto L_0x0520;
                case -1152230954: goto L_0x050f;
                case -1146534047: goto L_0x04fd;
                case -1115838944: goto L_0x04eb;
                case -1081936678: goto L_0x04d9;
                case -1078050970: goto L_0x04c7;
                case -1051269058: goto L_0x04b5;
                case -982608540: goto L_0x04a3;
                case -972056451: goto L_0x0491;
                case -776859333: goto L_0x0480;
                case -652881372: goto L_0x046e;
                case -570101180: goto L_0x045c;
                case -544216775: goto L_0x044a;
                case -437057161: goto L_0x0439;
                case -404433734: goto L_0x0427;
                case -404326515: goto L_0x0415;
                case -397704715: goto L_0x0403;
                case -388807511: goto L_0x03f1;
                case -369773488: goto L_0x03df;
                case -213449460: goto L_0x03cd;
                case -213424028: goto L_0x03bb;
                case -180214626: goto L_0x03a9;
                case -154616268: goto L_0x0397;
                case -29338502: goto L_0x0385;
                case 3107: goto L_0x0373;
                case 3355: goto L_0x0361;
                case 3076010: goto L_0x034f;
                case 37109963: goto L_0x033d;
                case 63195984: goto L_0x032b;
                case 107433883: goto L_0x0319;
                case 230323073: goto L_0x0308;
                case 418392395: goto L_0x02f6;
                case 542250332: goto L_0x02e4;
                case 549176928: goto L_0x02d2;
                case 597473788: goto L_0x02c0;
                case 754887508: goto L_0x02ae;
                case 791122864: goto L_0x029d;
                case 805095541: goto L_0x028b;
                case 1010584092: goto L_0x0279;
                case 1100650276: goto L_0x0267;
                case 1141602460: goto L_0x0255;
                case 1186014765: goto L_0x0243;
                case 1303622534: goto L_0x0231;
                case 1321720943: goto L_0x021f;
                case 1422388341: goto L_0x020d;
                case 1437255331: goto L_0x01fb;
                case 1565514205: goto L_0x01e9;
                case 1637553475: goto L_0x01d7;
                case 1638957285: goto L_0x01c6;
                case 1686319423: goto L_0x01b4;
                case 1688341040: goto L_0x01a3;
                case 1799285870: goto L_0x0191;
                case 1839650832: goto L_0x017f;
                case 1875425491: goto L_0x016d;
                case 2068142375: goto L_0x015b;
                case 2072888499: goto L_0x0149;
                case 2075506442: goto L_0x0137;
                case 2117205836: goto L_0x0125;
                default: goto L_0x011f;
            }
        L_0x011f:
            r25 = r9
            r22 = r10
            goto L_0x0700
        L_0x0125:
            r22 = r10
            java.lang.String r10 = "flow_control"
            r25 = r9
            r9 = r23
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 81
            goto L_0x0702
        L_0x0137:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "render_serially"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 75
            goto L_0x0702
        L_0x0149:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "manual_tracking_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 15
            goto L_0x0702
        L_0x015b:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "rule_line_external_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 52
            goto L_0x0702
        L_0x016d:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "is_analytics_logging_enabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 42
            goto L_0x0702
        L_0x017f:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "renderers"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = r24
            goto L_0x0702
        L_0x0191:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "use_third_party_container_height"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 48
            goto L_0x0702
        L_0x01a3:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "video_reward_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 7
            goto L_0x0702
        L_0x01b4:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_network_class_name"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 55
            goto L_0x0702
        L_0x01c6:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "video_start_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 6
            goto L_0x0702
        L_0x01d7:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "bid_response"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 40
            goto L_0x0702
        L_0x01e9:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "adapter_only_third_party_impression"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 83
            goto L_0x0702
        L_0x01fb:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_source_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 58
            goto L_0x0702
        L_0x020d:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "is_collapsible"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 70
            goto L_0x0702
        L_0x021f:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "allow_pub_owned_ad_view"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 31
            goto L_0x0702
        L_0x0231:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "preload_sort_value"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 76
            goto L_0x0702
        L_0x0243:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "cache_hit_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 66
            goto L_0x0702
        L_0x0255:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "adapter_response_info_key"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 56
            goto L_0x0702
        L_0x0267:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "rewards"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 11
            goto L_0x0702
        L_0x0279:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "transaction_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 9
            goto L_0x0702
        L_0x028b:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "analytics_event_name_to_parameters_map"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 77
            goto L_0x0702
        L_0x029d:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "impression_type"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 5
            goto L_0x0702
        L_0x02ae:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "container_sizes"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 17
            goto L_0x0702
        L_0x02c0:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "debug_dialog_string"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 27
            goto L_0x0702
        L_0x02d2:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "presentation_error_timeout_ms"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 16
            goto L_0x0702
        L_0x02e4:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "consent_form_action_identifier"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 72
            goto L_0x0702
        L_0x02f6:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "is_closable_area_disabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 36
            goto L_0x0702
        L_0x0308:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_load_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 4
            goto L_0x0702
        L_0x0319:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "qdata"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 24
            goto L_0x0702
        L_0x032b:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "render_test_label"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 33
            goto L_0x0702
        L_0x033d:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "request_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 68
            goto L_0x0702
        L_0x034f:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "data"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 22
            goto L_0x0702
        L_0x0361:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 23
            goto L_0x0702
        L_0x0373:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 18
            goto L_0x0702
        L_0x0385:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "allow_custom_click_gesture"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 32
            goto L_0x0702
        L_0x0397:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "is_offline_ad"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 61
            goto L_0x0702
        L_0x03a9:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "native_required_asset_viewability"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 63
            goto L_0x0702
        L_0x03bb:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "watermark"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 46
            goto L_0x0702
        L_0x03cd:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "force_disable_hardware_acceleration"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 65
            goto L_0x0702
        L_0x03df:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "is_close_button_enabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 50
            goto L_0x0702
        L_0x03f1:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "content_url"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 64
            goto L_0x0702
        L_0x0403:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_close_time_ms"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 45
            goto L_0x0702
        L_0x0415:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "render_timeout_ms"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 38
            goto L_0x0702
        L_0x0427:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "rtb_native_required_assets"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 62
            goto L_0x0702
        L_0x0439:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "imp_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 3
            goto L_0x0702
        L_0x044a:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "safe_browsing"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 26
            goto L_0x0702
        L_0x045c:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "late_load_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 74
            goto L_0x0702
        L_0x046e:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "on_device_storage_configs"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 82
            goto L_0x0702
        L_0x0480:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "click_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 2
            goto L_0x0702
        L_0x0491:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_source_instance_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 60
            goto L_0x0702
        L_0x04a3:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "valid_from_timestamp"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 10
            goto L_0x0702
        L_0x04b5:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "active_view"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 25
            goto L_0x0702
        L_0x04c7:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "video_complete_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 8
            goto L_0x0702
        L_0x04d9:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "allocation_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 21
            goto L_0x0702
        L_0x04eb:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "fill_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 12
            goto L_0x0702
        L_0x04fd:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "is_scroll_aware"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 43
            goto L_0x0702
        L_0x050f:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_type"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 1
            goto L_0x0702
        L_0x0520:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "presentation_error_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 14
            goto L_0x0702
        L_0x0532:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "allow_pub_rendered_attribution"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 30
            goto L_0x0702
        L_0x0544:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_event_value"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 51
            goto L_0x0702
        L_0x0556:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "extras"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 29
            goto L_0x0702
        L_0x0568:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "test_mode_enabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 34
            goto L_0x0702
        L_0x057a:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "adapters"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 20
            goto L_0x0702
        L_0x058c:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_sizes"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 19
            goto L_0x0702
        L_0x059e:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_cover"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 54
            goto L_0x0702
        L_0x05b0:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "showable_impression_type"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 44
            goto L_0x0702
        L_0x05c2:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "buffer_click_url_as_ready_to_ping"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 67
            goto L_0x0702
        L_0x05d4:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "enable_omid"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 39
            goto L_0x0702
        L_0x05e6:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "orientation"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 37
            goto L_0x0702
        L_0x05f8:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "is_custom_close_blocked"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 35
            goto L_0x0702
        L_0x060a:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "nofill_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 13
            goto L_0x0702
        L_0x061c:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "backend_query_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 47
            goto L_0x0702
        L_0x062e:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "is_interscroller"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 53
            goto L_0x0702
        L_0x0640:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_source_name"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 57
            goto L_0x0702
        L_0x0652:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "parallel_key"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 73
            goto L_0x0702
        L_0x0664:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "play_prewarm_options"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 49
            goto L_0x0702
        L_0x0676:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "network_ping_config"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 78
            goto L_0x0702
        L_0x0688:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "presentation_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 80
            goto L_0x0702
        L_0x069a:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "is_consent"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 71
            goto L_0x0702
        L_0x06ab:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "recursive_server_response_data"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 69
            goto L_0x0702
        L_0x06bc:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "offline_ad_config"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 79
            goto L_0x0702
        L_0x06cd:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "omid_settings"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 41
            goto L_0x0702
        L_0x06de:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "debug_signals"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 28
            goto L_0x0702
        L_0x06ef:
            r25 = r9
            r22 = r10
            r9 = r23
            java.lang.String r10 = "ad_source_instance_name"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0700
            r9 = 59
            goto L_0x0702
        L_0x0700:
            r9 = r29
        L_0x0702:
            switch(r9) {
                case 0: goto L_0x09d5;
                case 1: goto L_0x09ca;
                case 2: goto L_0x09c3;
                case 3: goto L_0x09bc;
                case 4: goto L_0x09b5;
                case 5: goto L_0x09aa;
                case 6: goto L_0x09a3;
                case 7: goto L_0x099c;
                case 8: goto L_0x0995;
                case 9: goto L_0x098e;
                case 10: goto L_0x0987;
                case 11: goto L_0x097b;
                case 12: goto L_0x0973;
                case 13: goto L_0x096b;
                case 14: goto L_0x0961;
                case 15: goto L_0x0957;
                case 16: goto L_0x094f;
                case 17: goto L_0x0945;
                case 18: goto L_0x093a;
                case 19: goto L_0x0930;
                case 20: goto L_0x0926;
                case 21: goto L_0x091e;
                case 22: goto L_0x0914;
                case 23: goto L_0x090f;
                case 24: goto L_0x090a;
                case 25: goto L_0x0901;
                case 26: goto L_0x08f3;
                case 27: goto L_0x08ee;
                case 28: goto L_0x08e4;
                case 29: goto L_0x08da;
                case 30: goto L_0x08d5;
                case 31: goto L_0x08d0;
                case 32: goto L_0x08cb;
                case 33: goto L_0x08c6;
                case 34: goto L_0x08c1;
                case 35: goto L_0x08bb;
                case 36: goto L_0x08b5;
                case 37: goto L_0x08ab;
                case 38: goto L_0x08a5;
                case 39: goto L_0x089f;
                case 40: goto L_0x0899;
                case 41: goto L_0x088f;
                case 42: goto L_0x0889;
                case 43: goto L_0x0883;
                case 44: goto L_0x087d;
                case 45: goto L_0x0877;
                case 46: goto L_0x0871;
                case 47: goto L_0x086b;
                case 48: goto L_0x0865;
                case 49: goto L_0x0857;
                case 50: goto L_0x0852;
                case 51: goto L_0x0844;
                case 52: goto L_0x083e;
                case 53: goto L_0x0838;
                case 54: goto L_0x082e;
                case 55: goto L_0x0828;
                case 56: goto L_0x0822;
                case 57: goto L_0x081c;
                case 58: goto L_0x0816;
                case 59: goto L_0x0810;
                case 60: goto L_0x080a;
                case 61: goto L_0x0804;
                case 62: goto L_0x07fa;
                case 63: goto L_0x07f4;
                case 64: goto L_0x07ea;
                case 65: goto L_0x07e4;
                case 66: goto L_0x07df;
                case 67: goto L_0x07d9;
                case 68: goto L_0x07d3;
                case 69: goto L_0x07cd;
                case 70: goto L_0x07c7;
                case 71: goto L_0x07c1;
                case 72: goto L_0x07bb;
                case 73: goto L_0x07b5;
                case 74: goto L_0x07ab;
                case 75: goto L_0x07a5;
                case 76: goto L_0x0799;
                case 77: goto L_0x077c;
                case 78: goto L_0x075b;
                case 79: goto L_0x073a;
                case 80: goto L_0x0730;
                case 81: goto L_0x072a;
                case 82: goto L_0x0712;
                case 83: goto L_0x070c;
                default: goto L_0x0705;
            }
        L_0x0705:
            r10 = r92
            r92.skipValue()
            goto L_0x09db
        L_0x070c:
            boolean r90 = r92.nextBoolean()
            goto L_0x0922
        L_0x0712:
            com.google.android.gms.internal.ads.zzbcv r9 = com.google.android.gms.internal.ads.zzbde.zzie
            java.lang.Object r9 = r9.zzk()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0725
            com.google.android.gms.internal.ads.zzfcg.zza(r92)
            goto L_0x0922
        L_0x0725:
            r92.skipValue()
            goto L_0x0922
        L_0x072a:
            boolean r89 = r92.nextBoolean()
            goto L_0x0922
        L_0x0730:
            java.util.List r9 = com.google.android.gms.ads.internal.util.zzbs.zzd(r92)
            r10 = r92
            r37 = r9
            goto L_0x09db
        L_0x073a:
            com.google.android.gms.internal.ads.zzbcv r9 = com.google.android.gms.internal.ads.zzbde.zziX
            java.lang.Object r9 = r9.zzk()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0756
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbs.zzi(r92)
            com.google.android.gms.ads.internal.util.client.zzw r9 = com.google.android.gms.ads.internal.util.client.zzw.zzd(r9)
            r10 = r92
            r45 = r9
            goto L_0x09db
        L_0x0756:
            r92.skipValue()
            goto L_0x0922
        L_0x075b:
            com.google.android.gms.internal.ads.zzbcv r9 = com.google.android.gms.internal.ads.zzbde.zziV
            java.lang.Object r9 = r9.zzk()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0777
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbs.zzi(r92)
            com.google.android.gms.ads.internal.util.client.zzv r9 = com.google.android.gms.ads.internal.util.client.zzv.zza(r9)
            r10 = r92
            r44 = r9
            goto L_0x09db
        L_0x0777:
            r92.skipValue()
            goto L_0x0922
        L_0x077c:
            com.google.android.gms.internal.ads.zzbcv r9 = com.google.android.gms.internal.ads.zzbde.zzas
            java.lang.Object r9 = r9.zzk()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0794
            java.util.Map r9 = com.google.android.gms.ads.internal.util.zzbs.zze(r92)
            r10 = r92
            r36 = r9
            goto L_0x09db
        L_0x0794:
            r92.skipValue()
            goto L_0x0922
        L_0x0799:
            double r9 = r92.nextDouble()
            r38 = r9
            r9 = r25
            r10 = r92
            goto L_0x09dd
        L_0x07a5:
            boolean r88 = r92.nextBoolean()
            goto L_0x0922
        L_0x07ab:
            java.util.List r9 = com.google.android.gms.ads.internal.util.zzbs.zzd(r92)
            r10 = r92
            r35 = r9
            goto L_0x09db
        L_0x07b5:
            java.lang.String r87 = r92.nextString()
            goto L_0x0922
        L_0x07bb:
            int r86 = r92.nextInt()
            goto L_0x0922
        L_0x07c1:
            boolean r85 = r92.nextBoolean()
            goto L_0x0922
        L_0x07c7:
            boolean r84 = r92.nextBoolean()
            goto L_0x0922
        L_0x07cd:
            java.lang.String r82 = r92.nextString()
            goto L_0x0922
        L_0x07d3:
            java.lang.String r81 = r92.nextString()
            goto L_0x0922
        L_0x07d9:
            boolean r80 = r92.nextBoolean()
            goto L_0x0922
        L_0x07df:
            com.google.android.gms.ads.internal.util.zzbs.zzd(r92)
            goto L_0x0922
        L_0x07e4:
            boolean r79 = r92.nextBoolean()
            goto L_0x0922
        L_0x07ea:
            java.lang.String r9 = r92.nextString()
            r10 = r92
            r43 = r9
            goto L_0x09db
        L_0x07f4:
            boolean r78 = r92.nextBoolean()
            goto L_0x0922
        L_0x07fa:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbs.zzi(r92)
            r10 = r92
            r34 = r9
            goto L_0x09db
        L_0x0804:
            boolean r77 = r92.nextBoolean()
            goto L_0x0922
        L_0x080a:
            java.lang.String r76 = r92.nextString()
            goto L_0x0922
        L_0x0810:
            java.lang.String r75 = r92.nextString()
            goto L_0x0922
        L_0x0816:
            java.lang.String r74 = r92.nextString()
            goto L_0x0922
        L_0x081c:
            java.lang.String r73 = r92.nextString()
            goto L_0x0922
        L_0x0822:
            java.lang.String r83 = r92.nextString()
            goto L_0x0922
        L_0x0828:
            java.lang.String r72 = r92.nextString()
            goto L_0x0922
        L_0x082e:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbs.zzi(r92)
            r10 = r92
            r33 = r9
            goto L_0x09db
        L_0x0838:
            boolean r71 = r92.nextBoolean()
            goto L_0x0922
        L_0x083e:
            java.lang.String r70 = r92.nextString()
            goto L_0x0922
        L_0x0844:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbs.zzi(r92)
            com.google.android.gms.ads.internal.client.zzt r9 = com.google.android.gms.ads.internal.client.zzt.zza(r9)
            r10 = r92
            r42 = r9
            goto L_0x09db
        L_0x0852:
            r92.nextBoolean()
            goto L_0x0922
        L_0x0857:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbs.zzi(r92)
            com.google.android.gms.internal.ads.zzbtw r9 = com.google.android.gms.internal.ads.zzbtw.zza(r9)
            r10 = r92
            r41 = r9
            goto L_0x09db
        L_0x0865:
            boolean r69 = r92.nextBoolean()
            goto L_0x0922
        L_0x086b:
            java.lang.String r68 = r92.nextString()
            goto L_0x0922
        L_0x0871:
            java.lang.String r66 = r92.nextString()
            goto L_0x0922
        L_0x0877:
            int r67 = r92.nextInt()
            goto L_0x0922
        L_0x087d:
            int r65 = r92.nextInt()
            goto L_0x0922
        L_0x0883:
            boolean r64 = r92.nextBoolean()
            goto L_0x0922
        L_0x0889:
            boolean r63 = r92.nextBoolean()
            goto L_0x0922
        L_0x088f:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbs.zzi(r92)
            r10 = r92
            r32 = r9
            goto L_0x09db
        L_0x0899:
            java.lang.String r62 = r92.nextString()
            goto L_0x0922
        L_0x089f:
            boolean r61 = r92.nextBoolean()
            goto L_0x0922
        L_0x08a5:
            int r60 = r92.nextInt()
            goto L_0x0922
        L_0x08ab:
            java.lang.String r9 = r92.nextString()
            int r59 = zzd(r9)
            goto L_0x0922
        L_0x08b5:
            boolean r58 = r92.nextBoolean()
            goto L_0x0922
        L_0x08bb:
            boolean r57 = r92.nextBoolean()
            goto L_0x0922
        L_0x08c1:
            boolean r56 = r92.nextBoolean()
            goto L_0x0922
        L_0x08c6:
            boolean r55 = r92.nextBoolean()
            goto L_0x0922
        L_0x08cb:
            boolean r54 = r92.nextBoolean()
            goto L_0x0922
        L_0x08d0:
            boolean r53 = r92.nextBoolean()
            goto L_0x0922
        L_0x08d5:
            boolean r52 = r92.nextBoolean()
            goto L_0x0922
        L_0x08da:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbs.zzi(r92)
            r10 = r92
            r31 = r9
            goto L_0x09db
        L_0x08e4:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbs.zzi(r92)
            r10 = r92
            r30 = r9
            goto L_0x09db
        L_0x08ee:
            java.lang.String r51 = r92.nextString()
            goto L_0x0922
        L_0x08f3:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbs.zzi(r92)
            com.google.android.gms.internal.ads.zzbxx r9 = com.google.android.gms.internal.ads.zzbxx.zza(r9)
            r10 = r92
            r40 = r9
            goto L_0x09db
        L_0x0901:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbs.zzi(r92)
            java.lang.String r50 = r9.toString()
            goto L_0x0922
        L_0x090a:
            java.lang.String r49 = r92.nextString()
            goto L_0x0922
        L_0x090f:
            java.lang.String r48 = r92.nextString()
            goto L_0x0922
        L_0x0914:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.zzbs.zzi(r92)
            r10 = r92
            r16 = r9
            goto L_0x09db
        L_0x091e:
            java.lang.String r47 = r92.nextString()
        L_0x0922:
            r10 = r92
            goto L_0x09db
        L_0x0926:
            java.util.List r9 = com.google.android.gms.ads.internal.util.zzbs.zzd(r92)
            r10 = r92
            r18 = r9
            goto L_0x09db
        L_0x0930:
            java.util.List r9 = com.google.android.gms.internal.ads.zzfcb.zza(r92)
            r10 = r92
            r17 = r9
            goto L_0x09db
        L_0x093a:
            com.google.android.gms.internal.ads.zzfcf r9 = new com.google.android.gms.internal.ads.zzfcf
            r10 = r92
            r9.<init>(r10)
            r19 = r9
            goto L_0x09db
        L_0x0945:
            r10 = r92
            java.util.List r9 = com.google.android.gms.internal.ads.zzfcb.zza(r92)
            r20 = r9
            goto L_0x09db
        L_0x094f:
            r10 = r92
            int r46 = r92.nextInt()
            goto L_0x09db
        L_0x0957:
            r10 = r92
            java.util.List r9 = com.google.android.gms.ads.internal.util.zzbs.zzd(r92)
            r21 = r9
            goto L_0x09db
        L_0x0961:
            r10 = r92
            java.util.List r9 = com.google.android.gms.ads.internal.util.zzbs.zzd(r92)
            r22 = r9
            goto L_0x09db
        L_0x096b:
            r10 = r92
            java.util.List r9 = com.google.android.gms.ads.internal.util.zzbs.zzd(r92)
            goto L_0x09dd
        L_0x0973:
            r10 = r92
            java.util.List r8 = com.google.android.gms.ads.internal.util.zzbs.zzd(r92)
            goto L_0x09db
        L_0x097b:
            r10 = r92
            org.json.JSONArray r9 = com.google.android.gms.ads.internal.util.zzbs.zzf(r92)
            com.google.android.gms.internal.ads.zzbwo r9 = com.google.android.gms.internal.ads.zzbwo.zza(r9)
            r15 = r9
            goto L_0x09db
        L_0x0987:
            r10 = r92
            java.lang.String r11 = r92.nextString()
            goto L_0x09db
        L_0x098e:
            r10 = r92
            java.lang.String r12 = r92.nextString()
            goto L_0x09db
        L_0x0995:
            r10 = r92
            java.util.List r7 = com.google.android.gms.ads.internal.util.zzbs.zzd(r92)
            goto L_0x09db
        L_0x099c:
            r10 = r92
            java.util.List r6 = com.google.android.gms.ads.internal.util.zzbs.zzd(r92)
            goto L_0x09db
        L_0x09a3:
            r10 = r92
            java.util.List r5 = com.google.android.gms.ads.internal.util.zzbs.zzd(r92)
            goto L_0x09db
        L_0x09aa:
            r10 = r92
            int r9 = r92.nextInt()
            int r14 = zze(r9)
            goto L_0x09db
        L_0x09b5:
            r10 = r92
            java.util.List r4 = com.google.android.gms.ads.internal.util.zzbs.zzd(r92)
            goto L_0x09db
        L_0x09bc:
            r10 = r92
            java.util.List r3 = com.google.android.gms.ads.internal.util.zzbs.zzd(r92)
            goto L_0x09db
        L_0x09c3:
            r10 = r92
            java.util.List r2 = com.google.android.gms.ads.internal.util.zzbs.zzd(r92)
            goto L_0x09db
        L_0x09ca:
            r10 = r92
            java.lang.String r9 = r92.nextString()
            int r13 = zzc(r9)
            goto L_0x09db
        L_0x09d5:
            r10 = r92
            java.util.List r1 = com.google.android.gms.ads.internal.util.zzbs.zzd(r92)
        L_0x09db:
            r9 = r25
        L_0x09dd:
            r10 = r22
            goto L_0x0107
        L_0x09e1:
            r25 = r9
            r22 = r10
            r10 = r92
            r92.endObject()
            r0.zza = r1
            r0.zzb = r13
            r0.zzc = r2
            r0.zzd = r3
            r0.zzf = r4
            r0.zze = r14
            r0.zzg = r5
            r0.zzh = r6
            r0.zzi = r7
            r0.zzj = r12
            r0.zzk = r11
            r0.zzl = r15
            r0.zzm = r8
            r0.zzn = r9
            r10 = r22
            r0.zzo = r10
            r11 = r21
            r0.zzp = r11
            r1 = r46
            r0.zzq = r1
            r12 = r20
            r0.zzr = r12
            r1 = r19
            r0.zzs = r1
            r13 = r18
            r0.zzt = r13
            r14 = r17
            r0.zzu = r14
            r1 = r47
            r0.zzw = r1
            r15 = r16
            r0.zzv = r15
            r1 = r48
            r0.zzx = r1
            r1 = r49
            r0.zzy = r1
            r1 = r50
            r0.zzz = r1
            r1 = r40
            r0.zzA = r1
            r1 = r51
            r0.zzB = r1
            r1 = r30
            r0.zzC = r1
            r1 = r31
            r0.zzD = r1
            r1 = r52
            r0.zzJ = r1
            r1 = r53
            r0.zzK = r1
            r1 = r54
            r0.zzL = r1
            r1 = r55
            r0.zzM = r1
            r1 = r56
            r0.zzN = r1
            r1 = r57
            r0.zzO = r1
            r1 = r58
            r0.zzP = r1
            r1 = r59
            r0.zzQ = r1
            r1 = r60
            r0.zzR = r1
            r1 = r61
            r0.zzT = r1
            r1 = r62
            r0.zzU = r1
            com.google.android.gms.internal.ads.zzfcz r1 = new com.google.android.gms.internal.ads.zzfcz
            r2 = r32
            r1.<init>(r2)
            r0.zzV = r1
            r1 = r63
            r0.zzW = r1
            r1 = r64
            r0.zzX = r1
            r1 = r65
            r0.zzY = r1
            r1 = r66
            r0.zzZ = r1
            r1 = r67
            r0.zzaa = r1
            r1 = r68
            r0.zzab = r1
            r1 = r69
            r0.zzac = r1
            r1 = r41
            r0.zzad = r1
            r1 = r42
            r0.zzae = r1
            r1 = r70
            r0.zzaf = r1
            r1 = r71
            r0.zzag = r1
            r1 = r33
            r0.zzah = r1
            r1 = r72
            r0.zzE = r1
            r1 = r73
            r0.zzF = r1
            r1 = r74
            r0.zzG = r1
            r1 = r75
            r0.zzH = r1
            r1 = r76
            r0.zzI = r1
            r1 = r77
            r0.zzai = r1
            r1 = r34
            r0.zzaj = r1
            r1 = r78
            r0.zzak = r1
            r1 = r43
            r0.zzal = r1
            r1 = r79
            r0.zzam = r1
            r1 = r80
            r0.zzS = r1
            r1 = r81
            r0.zzan = r1
            r1 = r82
            r0.zzao = r1
            r1 = r83
            r0.zzap = r1
            r1 = r84
            r0.zzaq = r1
            r1 = r85
            r0.zzar = r1
            r1 = r86
            r0.zzas = r1
            r1 = r35
            r0.zzau = r1
            r1 = r87
            r0.zzat = r1
            r1 = r88
            r0.zzav = r1
            r1 = r36
            r0.zzaw = r1
            r1 = r44
            r0.zzax = r1
            r1 = r45
            r0.zzay = r1
            r1 = r38
            r0.zzaz = r1
            r1 = r37
            r0.zzaA = r1
            r1 = r89
            r0.zzaB = r1
            r1 = r90
            r0.zzaC = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfca.<init>(android.util.JsonReader):void");
    }

    public static String zza(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzc(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }

    private static int zze(int i) {
        if (i == 0 || i == 1 || i == 3 || i == 4) {
            return i;
        }
        return 0;
    }

    public final boolean zzb() {
        return this.zzai || this.zzay != null;
    }
}
