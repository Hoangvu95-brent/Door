/**
 * SCADA & DAS Systems Group
 * Power Control Computer Systems Department
 * Fuchu Operations-Energy Systems & Solutions
 *
 * Copyright(c) TOSHIBA CORPORATION Energy Systems &
 * Solutions Company 2017 All Rights Reserved.
 *
 * ファイル名：CstRyConst.java
 * パッケージ名：jp.co.tmtd.fuchu.xp.dr.py
 *
 * 変更履歴
 * （初版作成）（製品履歴番号：XT52-000）
 *   設計　　 YYYY/MM/DD　承認：　　　調査：　　　担当：
 *   製造　　 YYYY/MM/DD　承認：　　　調査：　　　担当：
 *   単体試験 YYYY/MM/DD　承認：　　　調査：　　　担当：
 *
 * 製品履歴番号：XT52-000
 *
 * Rev.i01　　　2018/02/28　承認：　　　調査：　　　担当：(SCSK)佐々木
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #172685
 *   ・共通確認ダイアログを操作時に自画面表示が消去される不具合修正（定数追加）
 *
 * Rev.i02　　　2018/03/01　承認：　　　調査：　　　担当：(SCSK)佐々木
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #176455
 *   ・配電線事故状況画面の事故状況（第ｎ段）で「再々送電不良事故」が出力されない。
 *
 * Rev.i03　　2018/3/02　承認：　　　調査：　　　担当：(SCSK)赤津
 *   変更理由：（製品履歴番号：XT52-000）
 *    ・問題点番号 #176312
 *    ・手動模擬実行対応
 *
 * Rev.i04　　2018/03/30　承認：　　　調査：　　　担当：(SCSK)佐々木
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #177000
 *   ・有効日時の表示修正（終了時刻がMax値の場合）
 *
 * Rev.i05　　　2018/04/04　承認：　　　調査：　　担当(SCSK)赤津：
 *   変更理由：（製品履歴番号：XT52-000）
 *    ・問題点番号 #168297
 *    ・配制事故前後系統状態画面の単線結線図の表示対応
 *    ・タブの画面定義変更の為、「状変記録（変電所）」画面を事故対応業務タブで呼び出せるように修正
 *
 * Rev.i06　　　2018/04/19　承認：　　　調査：　　　担当：(SCSK)佐々木
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #169696
 *   ・初期表示時の描画速度が遅い為修正（性能対策）
 *
 * Rev.i07　　　2018/4/23　承認：　　　調査：　　　担当：(SCSK)佐々木
 *   変更理由：（製品履歴番号：XT52-000）
 *    ・問題点番号 #188319
 *    ・手動模擬実行対応（機器PSRでのスケルトン表示）
 *
 * Rev.i08　　　2018/5/11　承認：　　　調査：　　　担当：(SCSK)佐々木
 *   変更理由：（製品履歴番号：XT52-000）
 *    ・問題点番号 #XXXXXX
 *    ・新規案件の為
 *
 * Rev.i09　　　2019/7/23　承認：　　　調査：　　　担当：(SCSK)井村
 *   変更理由：（製品履歴番号：XT52-000）
 *    ・問題点番号 ##244460
 *    ・SFメッセージ出力対応
 *
 * Rev.i10　　　2019/8/05　承認：　　　調査：　　　担当：(SCSK)包　恒
 *   変更理由：（製品履歴番号：XT52-000）
 *    ・問題点番号 ##245265
 *    ・件名状態の第Ｘ段階を表示
 *
 * Rev.i11　　　2019/8/29　承認：　　　調査：　　　担当：(SCSK)包　恒
 *   変更理由：（製品履歴番号：XT52-000）
 *    ・問題点番号 ##245265
 *    ・件名状態の第Ｘ段階を表示
 *
 * Rev.i12　　　2019/9/26　承認：　　　調査：　　　担当：(SCSK)東田
 *   変更理由：（製品履歴番号：XT52-000）
 *    ・問題点番号
 *    ・新規案件対応
 *
 * Rev.i13　　　2019/12/17　承認：　　　調査：　　　担当：(SCSK)包　恒
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #XXXXXX
 *   ・６ｋＶ上位系統事故状況画面
 *
 * Rev.i14　　　2019/12/17　承認：　　　調査：　　　担当：(SCSK)岩井
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #XXXXXX
 *   ・監視対象確認イベント継承クラス(項目追加)
 *
 * Rev.i15　　　2020/1/6　承認：　　　調査：　　　担当：(SCSK)東田
 *   変更理由：（製品履歴番号：XT52-000）
 *    ・問題点番号
 *    ・新規案件対応
 *
 * Rev.i16　　　2020/1/17　承認：　　　調査：　　　担当：(SCSK)岩井
 *   変更理由：（製品履歴番号：XT52-000）
 *    ・問題点番号 #XXXXXX
 *    ・レコードの最大値変更対応
 *
 * Rev.i17　　　2020/01/23　承認：　　　調査：　　　担当：包恒
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #XXXXXX
 *   ・事故関連ポジション設定ダイアログ
 *
 * Rev.i18　　　2020/01/28　承認：　　　調査：　　　担当：包恒
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #309487  変更フォロー票 #309489
 *   ・６ｋＶ配電線事故判定マトリクス画面
 *
 * Rev.i19　　　2020/01/23　承認：　　　調査：　　　担当：井村
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #XXXXXX
 *   ・跨ぎ配電線事故自動復旧機能ロック設定
 *
 * Rev.i19　　　2020/02/04　承認：　　　調査：　　　担当：竹井
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #XXXXXX
 *   ・停電・復旧お客さま一覧ダイアログ画面（信頼度区分追加）
 *
 * Rev.i21　　　2020/02/05　承認：　　　調査：　　　担当：東田
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #XXXXXX
 *   ・事故関連ポジション画面
 *
 * Rev.i22　　　2020/02/05　承認：　　　調査：　　　担当：(SCSK)櫻木
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #XXXXXX
 *   ・ＦＡＸ送信結果レポート一覧画面(表示件数追加)
 *
 * Rev.i23　　　2020/02/02　承認：　　　調査：　　　担当：山崎
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #XXXXXX
 *   ・変更内容：表示内容変更に伴う修正
 *
 * Rev.i24　　　2020/02/10　承認：　　　調査：　　　担当：(SCSK)梁
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #XXXXXX
 *   ・６ｋＶ配電線事故判定条件設定ダイアログ画面(◎追加)
 *
 * Rev.i25　　　2020/02/10　承認：　　　調査：　　　担当：(SCSK)佐々木
 *   変更理由：（製品履歴番号：XT52-000）
 *    ・問題点番号 #311207
 *    ・「配変バンク」ボタン追加
 *
 * Rev.i26　　　2020/02/10　承認：　　　調査：　　　担当：(SCSK)岩井
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #XXXXXX
 *   ・高中低対応
 *
 * Rev.i27　　　2020/02/19　承認：　　　調査：　　　担当：(SCSK)竹井
 *   変更理由：（製品履歴番号：）
 *   ・問題点番号 #XXXXXX
 *   ・配電線事故トリップ画面の画面表示で使用する文字列の追加
 *
 * Rev.i28　　　2020/02/21　承認：　　　調査：　　　担当：(SCSK)櫻木
 *   変更理由：（製品履歴番号：）
 *   ・問題点番号 #311205
 *   ・再閉路状況の文言変更のため修正
 *
 * Rev.i29　　　2020/03/24　承認：　　　調査：　　担当：(SCSK)包恒
 *   変更理由：（製品履歴番号：）
 *    ・問題点番号 #XXXXXX
 *    ・新規作成したサブパネル画面に連携するため
 *
 * Rev.i30　　　2020/03/24　承認：　　　調査：　　担当：(SCSK)岩井
 *   変更理由：（製品履歴番号：）
 *    ・問題点番号 #318844
 *    ・新規作成したサブパネル画面(Subpry000155)に連携するための対応
 *
 * Rev.i31　　　2020/04/03　承認：　　　調査：　　担当：(SCSK)梁
 *   変更理由：（製品履歴番号：XT52-000）
 *    ・問題点番号 #318844  変更フォロー票#318858
 *    ・新規作成したサブパネル画面(Subpry000154)に連携するための対応
 *
 * Rev.i32　　　2020/07/02　承認：　　　調査：　　　担当：(メイズ)須藤
 *   変更理由：（製品履歴番号：）
 *   ・問題点番号 #
 *   ・【要件No268】実行済設定、実行中断、指令実行、操作終了の各ボタンの活性・非活性条件を追加
 *   ・【WT指摘No670】指令実行ボタン押下時に現地操作要求の指令実行処理を実行する処理を追加
 *                    操作終了ボタン押下時に現地操作要求の操作終了処理を実行する処理を追加
 *   ・【仕様懸案No129】タブから遷移した場合にタブフリッカを停止する仕様を追加
 *
 * Rev.i33　　　2020/07/27　承認：　　　調査：　　　担当：(PS開)向川
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #327372   変更フォロー表 #327373
 *   ・【WT指摘No709】事故状況画面から事故復旧日時の登録対応
 *
 * Rev.i34    2020/07/29  承認：      調査：    担当：(SCSK)梁
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号#328773  変更フォロー票#351624
 *     各連番テーブルと紐づく事故件名一覧テーブル（TblReSubjectList）
 *     インテックスカラムの名称変更
 *
 * Rev.i35　　　2020/08/25　承認：　　　調査：　　　担当：(PS開)向川
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #327372   変更フォロー表 #327373
 *   ・【要件No.277】22kV回線選択・お客様設備事故状況画面設計不備対応
 *
 *
 * Rev.i36　　　2020/09/7　承認：　　　調査：　　　担当：(SCSK)梁
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #355285
 *   ・マトリクス関連画面の不具合課題対応
 *
 * Rev.i37　　　2020/09/10　承認：　　　調査：　　　担当：(PS開)向川
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #355282
 *    ・要件No.293
 *        タブ集約表示要求のキュー通知処理を追加対応
 *    ・要件No.302
 *        運用面表示時におけるチェックボックス非表示処理追加
 *
 * Rev.i38　　　2020/09/17　承認：　　　調査：　　　担当：(メイズ)須藤
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #357631
 *   ・案件No,309:新規登録処理追加に伴い、新規追加行クリック時にダイアログ画面に渡す状態パラメータを追加
 *
 * Rev.i39　　　2020/09/30　承認：　　　調査：　　　担当：(PS開)向川
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #355282
 *   ・既存不備対応
 *        設定処理の不備修正による定数追加対応
 *
 * Rev.i40    2020/09/30  承認：      調査：    担当：(SCSK)櫻木
 *   変更理由：（製品履歴番号：XT52-000）
 *    ・問題点番号 #363828  変更フォロー票#363829
 *    ・要件No.364
 *    ・供給支障算出用オフラインＴＭ設定画面（発電支障表示用所名変換設定）の最大表示件数の修正
 *
 * Rev.i41　　　2020/10/12　承認：　　　調査：　　　担当：(PS開)向川
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #355282
 *   ・既存不備対応
 *        設定処理の不備修正による定数追加対応
 *
 * Rev.i42　　　2020/11/19　承認：　　　調査：　　　担当：(SCSK)杉澤
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・既存不備対応
 *        配制事故件名一覧画面の表示件数の修正
 *
 * Rev.i43　　　2020/11/24　承認：　　　調査：　　　担当：(PS開)向川
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・既存不備対応
 *        6kV配電線事故状況画面の事故状況（第ｎ段）の状況欄表示文言修正
 *
 * Rev.i44　　　　2020/12/11　承認：　　　調査：　　　担当：(SCSK)櫻木
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #367776  変更フォロー票#367777
 *   ・CstRyFdrLnTrblKindStrの配列の要素変更に関連する部分の修正
 * 
 * Rev.i45　　　　2020/12/17　承認：　　　調査：　　　担当：(PS開)向川
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #367776  変更フォロー票#367777
 *   ・要件No.375  スクロールバーの位置の初期化対応に伴う共通定数の追加
 * 
 * Rev.i46　　　　2021/01/13　承認：　　　調査：　　　担当：(SCSK)杉澤
 *   変更理由：（製品履歴番号：XT52-000）
 *   ・問題点番号 #367778  変更フォロー票#367779
 *   ・テストデータ送信画面のクラス名がWinpry010053に修正されたためConstの名称も併せて修正対応
 * 
 */

package jp.co.tmtd.fuchu.xp.dr.py;

/** import jp.co.tmtd.fuchu.xp.da.p0.A0Color; */

/**
 * 業務共通定数クラス
 * <Pre>
 * 障害・制約：
 * プログラムＭＳＧ： 無
 * WorkGroupを停止させるエラー：無
 * 永久ループするエラー：無
 * インターロック：無
 * 概数：
 * 100Kbyte以上の配列：無
 * 概略スピード：
 * 　　　主要処理１：
 * 主要処理２：
 * ステップ：11  流用率：0% (流用元：)
 * 機能説明：
 * 事故対応業務にて使用する定数を定義するクラスです。
 * </Pre>
 */
public class CstRyConst
{
  /** ==========================================================================// */
  /**  定数 */
  /** ==========================================================================// */
  /** 【共通】 */
  /**  ゼロ文字 */
  public static final String CstRyDefault_Zero = "0";

  /**  空文字 */
  public static final String CstRyBlankStr = "";

  /**  区切り文字 */
  public static final String CstRySplitStr1 = ",";
  public static final String CstRySplitStr2 = "〜";
  public static final String CstRySplitStr3 = "\\.";

  /**  コロン */
  public static final String CstRyColonStr = ":";
  public static final String CstRyColonStr2 = "：";
  /**  スラッシュ */
  public static final String CstRySlashStr = "/";
  /**  ピリオド */
  public static final String CstRyPeriodStr = ".";
  /**  ハイフン */
  public static final String CstRyHyphenStr = "-";
  /**  ハイフン（全角） */
  public static final String CstRyHyphenZenStr = "−";
  /**  アスタリスク */
  public static final String CstRyAsteriskStr = "*";
  /**  セミコロン */
  public static final String CstRySemicolonStr = ";";
  /**  カンマ */
  public static final String CstRyCommaStr = "，";
  /**  読点 */
  public static final String CstRyDokutennStr = "、";
  /**  改行 */
  public static final String CstRyNewLine = "\n";
  public static final String CstRyNewLineStr = "\\n";

  /**  フォーマット形式 */
  public static final String CstRyFormatSp4s = "%4s";

  /**  画面リスト表示件数 */
  public static final int CstRyDisplayLineCount30 = 30;
  public static final int CstRyDisplayLineCount100 = 100;

  /**  経過時間 */
  public static final String CstRyHourTimeStr = "時間";
  public static final String CstRyHourStr = "時";
  public static final String CstRyMiniStr = "分";


  /** Max日時 */
  /** Rev.i04 Mod Start */
  /** public static final String CstRyMaxDateTime = "9999/12/3123:59"; */
  /**  9999年だとDBに登録できない為、2035年にしてます。 */
  public static final String CstRyMaxDateTime = "2035/12/3123:59";
  /** Rev.i04 Mod End */

  /**  スペース */
  public static final String CstRySpace1 = " ";
  public static final String CstRySpace4 = "    ";
  public static final String CstRySpace5 = "     ";
  public static final String CstRySpaceZen = "　";

  /**  Boolean値 */
  public static final String CstRyTrue = "true";
  public static final String CstRyFalse = "false";

  /**  チェックボックス */
  public static final String CstRyChekOn = "1";
  public static final String CstRyChekOff = "0";
  public static final String CstRyChekNull = "null";

  /**  有無フラグ */
  public static final int CstRyFlgMu = 0;  /**  無効 */
  public static final int CstRyFlgYu = 1;  /**  有効 */

  /**  表示フラグ */
  public static final int CstRyDisplayOff = 0; /**  非表示 */
  public static final int CstRyDisplayOn = 1;  /**  表示 */

  /**  フリッカ判定フラグ */
  public static final int CstRyFlickerOff = 0; /**  消灯 */
  public static final int CstRyFlickerLit = 1; /**  点灯 */


  /**  有無文字 */
  public static final String[] CstRyYuMuStr = new String[]{ "無","有"};

  /** Rev.i08 Add Start */
  /**  有無文字２ */
  public static final String[] CstRyYuMuStr2 = new String[]{ "なし","あり"};
  /** Rev.i08 Add End */

  /** 秒・ミリ秒に変換する */
  public static final int CstRyScaleMilli = 1000;

  /**  明細文字 */
  public static final String CstRyMeisaiStr = "明細";
  /**  一覧文字 */
  public static final String CstRyIchiranStr = "一覧";

/**  Rev.i45 Add Start */
  /**  スクロールバー初期位置 */
  public static final int CstRyScrollBarInitialPosition = 0;  /**  先頭 */
/**  Rev.i45 Add End */

  /** 【業務】 */

  /** 都県名一覧 */
  public static final String[] CstRyPrefecturesStr = new String[]{"", "東京都", "神奈川県", "埼玉県", "千葉県", "静岡県", "茨城県", "栃木県", "群馬県", "山梨県"};

  /** 変圧器Ｎｏ． */
  public static final String[] CstRyTransformerNoStr = new String[]{"", "１Ｂ", "２Ｂ", "３Ｂ", "４Ｂ"};

  /**  TM内訳No.文字 */
  public static final String[] CstRyTMItems = new String[]{"","Ａ","Ｂ","Ｃ","Ｄ","Ｅ","Ｆ","Ｇ","Ｈ","Ｉ","Ｊ","Ｋ","Ｌ","Ｍ","Ｎ","Ｏ"};

  /** 系制事故件名一覧 文字色 */
  public static final int CstRyGreen = 0;
  public static final int CstRyWhite = 1;

  /** 系制事故状況一覧 文字色 */
  public static final int CstRyRed = 1;
  public static final int CstRyYell2 = 2;
  public static final int CstRyCYAN  = 0;
  public static final int CstRyGreen2 = 1;


 /** 系制事故件名一覧 件名一覧テーブル項目数 */
  public static final int CstRySubListColMax = 13;

  /** 系制事故状況一覧 事故内容テーブル項目数 */
  public static final int CstRyTrblecontsColMax = 5;

  /** 系制事故状況一覧 事故設備テーブル項目数 */
  public static final int CstRyTrbleeqpColMax = 4;

  /** 件名作成種別 */
  public static final int CstRyMakeMode_Auto   = 0;     /** 自動作成 */
  public static final int CstRyMakeMode_Manual = 1;     /** 手動作成 */

  /** 件名作成種別 */
  public static final int CstRyTrblPrmtRep_Not   = 0;   /** 未作成 */
  public static final int CstRyTrblPrmtRep_Jin   = 1;   /** 作成済 */

  /** 異常値表示 */
  public static final int CstRyRPowAbnFlg = 1;
  public static final int CstRyRPowAbnFlg_On = 1;
  public static final int CstRyRPowAbnFlg_Off = 0;
  public static final String CstRyPowAbnStr = "E0";
  public static final String CstRyZPhsVoltAbnStr = "E0.0";
  public static final String CstRyPowAbnAllStr = "E";

  /**  実装有無 */
  public static final int CstRyImplFlag_False = 0;    /**  無 */
  public static final int CstRyImplFlag_True =  1;    /**  有 */

  /** Rev.i26 Add Start */
  /** 削除不可判定 */
  public static final int CstRyDelete_Zero = 0;    /**  削除可 */
  public static final int CstRyDelete_One =  1;    /**  削除不可 */
  /** Rev.i26 Add End */

  /**  管理状況 */
  public static final int  CstRyManagemenRunningCd = 0;
  public static final int  CstRyManagemenClosingCd = 1;

  /** 事故件名追加ステータス */
  public static final int  CstRyNewMake_Suces  = 1;
  public static final int  CstRyNewMake_Err    = 2;
  public static final int  CstRyNewMake_Cancel = 3;

  /** ユーザイベントパラメータ */
  public static final String CstRyWinpry000002_1500_1 = "JKNO";

  /**  復旧抑制フラグ */
  public static final int CstRyFinalRestrPrcDtr_False = 0;
  public static final int CstRyFinalRestrPrcDtr_True = 1;

  /**  事故後監視キュー送信状況 */
  public static final int CstRyAftTrblQueStatus_False = 0;
  public static final int CstRyAftTrblQueStatus_True = 1;

  public static final String[] CstRyManagemenStr = new String[]{"管理中", "管理終了"};

  /** 系制事故件名一覧 事故発生日時検索条件取得パラメータ */
  public static final int CstRyTrblDateStart = 1;
  public static final int CstRyTrblDateEnd = 2;

  /** 系制事故件名一覧 事故件名一覧抽出条件 */
  public static final String CstRyVewRes0001main_Restriction = "'bImplFlag' == 1";

  /** 系制事故状況 事故件名抽出条件 */
  public static final String CstRyVewRes0002Add_Restriction = "'bImplFlag' == 1&&'PK_TblReSubjectList' == ";
  public static final String CstRyVewRes0002New_Restriction = "'PK_TblReSubjectList' == ";


  /** 系制事故状況 事故状況抽出条件 */
  public static final String CstRyVewRes0002cont_TableName = "TblReTroubleContents";
  public static final String CstRyVewRes0002cont_Restriction = "";

  /** 系制事故状況 事故状況設備抽出条件 */
  public static final String CstRyVewRes0002eqp_Restriction = "'nTrblIndexNo' == ";

  /** 系制事故状況 事故状況保安計器抽出条件 */
  public static final String CstRyVewRes0002sec_Restriction = "'nTrblIndexNo' == ";

  /** 停電ロック画面一覧抽出条件 */
  public static final String CstRy0052Restriction = "'bImplFlag' == 1";

  /**  停電ロック管理画面配電線区間充停電状態 */
  public static final String CstRySquare = "■";

  /** 系制事故件名一覧 選択ボタン表示 */
  public static final int CstRyDefPrint = 0;
  public static final int CstRySendRecoPrint = 1;
  public static final int CstRySendNamePrint = 2;

  /** 電圧階級 */
  public static final int CstRyVolClass_275kVOV   = 1;  /**  275kV以上 */
  public static final int CstRyVolClass_154kV     = 2;  /**  154kV */
  public static final int CstRyVolClass_66kV      = 3;  /**  66kV */
  public static final int CstRyVolClass_21kV      = 4;  /**  22kV */

  /** 事故種別 */
  /** 配制 */
  public static final int CstRyTrblKind_PowerSupply      = 1;  /**  電源 */
  public static final int CstRyTrblKind_Bank             = 2;  /**  バンク */
  public static final int CstRyTrblKind_Bus              = 3;  /**  母線 */
  public static final int CstRyTrblKind_GrndFlt          = 4;  /**  地絡 */
  public static final int CstRyTrblKind_PowMeasu         = 5;  /**  欠相 */
  public static final int CstRyTrblKind_22kVTMLine       = 6;  /**  22kV配電線 */
  public static final int CstRyTrblKind_6kVTMLine        = 7;  /**  6kV配電線 */
  /** Rev.i08 Add Start */
  public static final int CstRyTrblKind_22kVLineSelect   = 12;  /**  22kV回線選択式開閉器 */
  public static final int CstRyTrblKind_22kVCustomer     = 13;  /**  22kVお客さま */
  /** Rev.i08 Add End */
  /** 系制 */
  public static final int CstRyTrblKind_TransmissionLine = 8;  /**  送電線 */
  public static final int CstRyTrblKind_PowerTransformer = 9;  /**  変圧器 */
  public static final int CstRyTrblKind_BusBarSection    = 10; /**  母線 */
  public static final int CstRyTrblKind_Other            = 11; /**  その他 */
  /** Rev.i08 Mod Start */
  /** public static final String[] CstRyTrblKindStr = new String[]{"", "電源", "バンク", "母線", "地絡", "欠相", "22kV配電線","6kV配電線","送電線","変圧器","母線","その他" }; */
  public static final String[] CstRyTrblKindStr = new String[]{"", "電源", "バンク", "母線", "地絡", "欠相", "22kV配電線","6kV配電線","送電線","変圧器","母線","その他","回線選択式\n変圧器","お客さま\n設備" };
  public static final String[] CstRyTrblKindStr22kv = new String[]{"", "電源", "バンク", "母線", "地絡", "欠相", "22kV配電線","6kV配電線","送電線","変圧器","母線","その他","回線選択式変圧器","お客さま設備" };
  /** Rev.i08 Mod End */
  /** 事故状況 */
  public static final int CstRyTrblSitu_Judge   = 1;  /**  発生中（供給支障判定中） */
  public static final int CstRyTrblSitu_Final   = 2;  /**  発生中（供給支障確定） */
  public static final int CstRyTrblSitu_lRes    = 3;  /**  復旧済 */

  public static final String[] CstRyTrblSituStr = new String[]{"", "発生中（供給支障判定中）", "発生中（供給支障確定）", "復旧済" };

  /** 事故相 */
  public static final String[] CstRyTrblPhaseStr = new String[]{"赤", "白", "黒"};

  public static final int CstRyTrblPhaseOn = 1;
  public static final int CstRyTrblPhaseOff = 0;

  /** 設備種別 */
  public static final int CstRyTrblEquipment = 1;
  public static final int CstRyTrblCandidateEquipment = 2;

  public static final String[] CstRyEquipmentKindStr = new String[]{"","事故設備", "事故候補設備"};

  /** 件名作成種別 */
  public static final int CstRyMakeModeAutoCreate = 0;
  public static final int CstRyMakeModeManualCreate = 1;

  /** 事故速報作成状態 */
  public static final int CstRyTrblPrmtRepStsNotCreate = 0;
  public static final int CstRyTrblPrmtRepStsCreate = 1;

  /** 特記事項 */
  public static final int CstRySpecialMention_Eqpmntdmg  = 1;   /**  設備損壊 */
  public static final int CstRySpecialMention_Fire       = 2;   /**  火炎 */
  public static final int CstRySpecialMention_Explosion  = 3;   /**  爆発 */
  public static final int CstRySpecialMention_Flooding   = 4;   /**  冠水 */
  public static final int CstRySpecialMention_Collapse   = 5;   /**  倒壊 */
  public static final int CstRySpecialMention_OilSpill   = 6;   /**  油流出 */
  public static final int CstRySpecialMention_Rad        = 7;   /**  放射能 */
  public static final int CstRySpecialMention_Person     = 8;   /**  人身 */
  public static final int CstRySpecialMention_Earthquake = 9;   /**  地震 */
  public static final int CstRySpecialMention_Tsunami    = 10;  /**  津波 */
  public static final int CstRySpecialMention_Typhoon    = 11;  /**  台風 */
  public static final int CstRySpecialMention_Thunder    = 12;  /**  雷害 */
  public static final int CstRySpecialMention_Snow       = 13;  /**  雪害 */
  public static final int CstRySpecialMention_Flood      = 14;  /**  洪水 */
  public static final int CstRySpecialMention_Tornado    = 15;  /**  竜巻 */
  public static final int CstRySpecialMention_Gust       = 16;  /**  突風 */
  public static final int CstRySpecialMention_Other      = 17;  /**  その他 */

  public static final String[] CstRySpecialMentionStr = new String[]{"","設備損壊", "火災", "爆発", "冠水","倒壊", "油流出", "放射能", "人身", "地震", "津波", "台風", "雷害", "雪害", "洪水", "竜巻", "突風", "その他", ""};

  /** 状況 */
  public static final int CstRySituation_TrblJudgRun         = 1; /**  事故判定中 */
  public static final int CstRySituation_TrblJudgEnd         = 2; /**  事故判定終了 */
  public static final int CstRySituation_TrblMonitorRun      = 3; /**  事故時監視中 */
  public static final int CstRySituation_TrblMonitorErr      = 4; /**  事故時監視異常 */
  public static final int CstRySituation_TrblMonitorEnd      = 5; /**  事故時監視終了 */
  public static final int CstRySituation_AutoCreateWait      = 6; /**  自動作成待ち */
  public static final int CstRySituation_AutoCreateRun       = 7; /**  自動作成中 */
  public static final int CstRySituation_AutoCreateNo        = 8; /**  自動作成不可 */
  public static final int CstRySituation_AutoCreateEnd       = 9; /**  自動作成終了 */
  public static final int CstRySituation_PseudoRunning       = 10; /**  模擬実行中 */
  public static final int CstRySituation_PseudoRunningErr    = 11; /**  模擬実行異常 */
  public static final int CstRySituation_PseudoRunningEnd    = 12; /**  模擬実行終了 */
  public static final int CstRySituation_ProcedureRunning    = 13; /**  手順実行中 */
  public static final int CstRySituation_ProcedureStop       = 14; /**  手順中断中 */
  public static final int CstRySituation_RestorationStop     = 15; /**  復旧中止 */
  public static final int CstRySituation_ProcedureErrEnd     = 16; /**  手順異常終了 */
  public static final int CstRySituation_ProcedureCraWait    = 17; /**  手順再作成待ち */
  public static final int CstRySituation_AllSendTimeWait     = 18; /**  全送日時指定待ち */
  public static final int CstRySituation_ProcedureTimWait    = 19; /**  復旧日時指定待ち */
  public static final int CstRySituation_ManagemenEnd        = 20; /**  管理終了 */
  public static final int CstRySituation_SwitchwayLckRun     = 21; /**  再閉路ロック中 */
  public static final int CstRySituation_InputPowerLckRun    = 22; /**  投入電源ロック中 */
  public static final int CstRySituation_RetransmissionOK    = 23; /**  再事故再送電成功 */
  public static final int CstRySituation_RetransmissionNG    = 24; /**  再事故再送電不良 */
  public static final int CstRySituation_MultipleTrbl        = 25; /**  多重事故 */
  public static final int CstRySituation_GroundFaltLckRun    = 26; /**  微地絡ロック中 */
  public static final int CstRySituation_SituationUnknown    = 27; /**  状況不明 */
/** Rev.i31 Add Start */
  public static final int CstRySituation_LocalOperationWait  = 28; /**  現地操作待ち */
  public static final int CstRySituation_LocalOperationRun   = 29; /**  現地操作中 */
/** Rev.i31 Add End */
/** Rev.i32 Mod Start */
/**   public static final String[] CstRySituationStr = new String[]{"", "事故判定中", "事故判定終了", "事故時監視中", "事故時監視異常", "事故時監視終了", */
/**   "自動作成待ち", "自動作成中", "自動作成不可", "自動作成終了", "模擬実行中", "模擬実行異常", "模擬実行終了", "手順実行中", */
/**   "手順中断中", "復旧中止", "手順異常終了", "手順再作成待ち", "全送日時指定待ち", "復旧日時指定待ち", "管理終了", "再閉路ロック中", */
/**   "投入電源ロック中", "再事故再送電成功", "再事故再送電不良", "多重事故", "微地絡ロック中", "状況不明" }; */
  public static final String[] CstRySituationStr = new String[]{"", "事故判定中", "事故判定終了", "事故時監視中", "事故時監視異常", "事故時監視終了",
  "自動作成待ち", "自動作成中", "自動作成不可", "自動作成終了", "模擬実行中", "模擬実行異常", "模擬実行終了", "手順実行中",
  "手順中断中", "復旧中止", "手順異常終了", "手順再作成待ち", "全送日時指定待ち", "復旧日時指定待ち", "管理終了", "再閉路ロック中",
  "投入電源ロック中", "再事故再送電成功", "再事故再送電不良", "多重事故", "微地絡ロック中", "状況不明", "現地操作待ち", "現地操作中" };
/** Rev.i32 Mod Start */
  /** 事故後監視最新状況 */
  public static final int CstRyAftStatus_Notimplemented = 1; /**  未実施 */
  public static final int CstRyAftStatus_Progress       = 2; /**  実施中 */
  public static final int CstRyAftStatus_Suspended      = 3; /**  中断中 */
  public static final int CstRyAftStatus_Restarting     = 4; /**  再開中 */
  public static final int CstRyAftStatus_Aborted        = 5; /**  中止済 */
  public static final int CstRyAftStatus_Implemented    = 6; /**  実施済 */

  public static final String[] CstRyAftStatusStr = new String[] {"", "未実施", "実施中", "中断中", "再開中", "中止済", "実施済"};
  /** Rev.i08 Add Start */
  /**  事故後監視実行状況 */
  public static final int CstRyExeStatus_Notimplemented = 0; /**  未実施 */
  public static final int CstRyExeStatus_MntrgNormal    = 1; /**  通常 */
  public static final int CstRyExeStatus_MntrgClbrtn    = 2; /**  連係 */
  public static final int CstRyExeStatus_MntrgEnd       = 3; /**  末端 */
  public static final String[] CstRyAftExeStatusStr = new String[] {"", "通常", "連係", "末端"};
  /** Rev.i08 Add End */

  /** 事故後監視通常・連係 */
  public static final int CstRyAftTrblMntrgNot = 0; /**  未 */
  public static final int CstRyAftTrblMntrgOK  = 1; /**  済 */

  public static final String[] CstRyAftTrblMntrgStr = new String[] {"未", "済"};

  /**  現地操作 */
  public static final int CstRyLocalCtrl_NO  = 0; /**  無 */
  public static final int CstRyLocalCtrl_YES = 1; /**  有 */

  /** Rev.i13 Mod Start */
/**   public static final String[] CstRyLocalCtrlStr = new String[] {"無", ""}; */
  public static final String[] CstRyLocalCtrlStr = new String[] {"", "現"};
  /** Rev.i13 Mod End */

  /**  実施結果 */
  public static final int CstRyImpResult_NotImplement = 0;
  public static final int CstRyImpResult_MockImplementing = 1;
  public static final int CstRyImpResult_MockImplSuccess = 2;
  public static final int CstRyImpResult_MockImplFailure = 3;
  public static final int CstRyImpResult_Implementing = 4;
  public static final int CstRyImpResult_ImplChkSuccess = 5;
  public static final int CstRyImpResult_ImplChkFailure = 6;
  public static final int CstRyImpResult_OpeFailure = 7;
  public static final int CstRyImpResult_OpeSuccess = 8;
/** Rev.i32 Add Start */
  public static final int CstRyImpResult_LocalOpeWait = 9;  /**  現地操作待ち */
  public static final int CstRyImpResult_LocalOpe = 10;     /**  現地操作中 */
/** Rev.i32 Add End */

  /**  実施結果 */
  public static final String[] CstRyImplementationRstStr = new String[] {"未実施","模擬実行中","模擬実行正常","模擬異常","実実行中","実実行チェック正常",
    "実実行チェック異常","実操作異常","実操作正常"};

  /**  実施結果エラー */
  public static final int CstRyImpRsltErr_Level1 = 1;
  public static final int CstRyImpRsltErr_Level2 = 2;

  /** 官庁報告 */
  public static final int CstRyGovRep_NO = 0;
  public static final int CstRyGovRep_YES = 1;
  public static final String[] CstRyGovRepStr = new String[]{"", "有"};

  /** 区間状態 */
  public static final String[] CstRySectionFdrStsStr = new String[]{"健全停電", "事故停電", "融通元", "融通先","工事停電", "緊急停電", "運用除外", "ループ中", "自回線内ループ中", "自回線内切替中", ""};

  /** 区間状態No */
  public static final int CstRySection1FdrSts = 1;
  public static final int CstRySection2FdrSts = 2;
  public static final int CstRySection3FdrSts = 3;
  public static final int CstRySection4FdrSts = 4;
  public static final int CstRySection5FdrSts = 5;
  public static final int CstRySection6FdrSts = 6;
  public static final int CstRySection7FdrSts = 7;
  public static final int CstRySection8FdrSts = 8;
  public static final int CstRySection9FdrSts = 9;
  public static final int CstRySection10FdrSts = 10;
  public static final int CstRySection11FdrSts = 11;
  public static final int CstRySection12FdrSts = 12;
  public static final int CstRySection13FdrSts = 13;
  public static final int CstRySection14FdrSts = 14;

  /** 区間停電状態 */
  public static final int CstRySectionBoutSts0 = 0; /**  未実装（空白） */
  public static final int CstRySectionBoutSts1 = 1; /**  青：運用除外 */
  public static final int CstRySectionBoutSts2 = 2; /**  赤：充電（順送） */
  public static final int CstRySectionBoutSts3 = 3; /**  マゼンダ：充電（融通） */
  public static final int CstRySectionBoutSts4 = 4; /**  黄：事故停電（または工事停電，緊急停電含む） */
  public static final int CstRySectionBoutSts5 = 5; /**  緑：健全停電 */

  /** その他停電 */
  public static final int CstRyBoutPlace  = 1;
  public static final String CstRyBoutPlaceStr = "　他";

  /** 超重要お客様 */
  public static final int CstRySImpCustBout = 1;
  public static final String[] CstRySImpCustBoutStr = new String[]{"", "有"};

  /** 系制事故件名一覧 復旧ステータス */
  public static final int CstRyRes_NO = 0;
  public static final int CstRyRes_YES = 1;

  /** 再閉路再送電 */
  public static final int CstRyReClosTrans_No        = 0;
  public static final int CstRyReClosTrans_Reclosure = 1;
  public static final int CstRyReClosTrans_Reclosing = 2;
  public static final String[] CstRyReClosTransStr = new String[]{"", "再閉路", "再送電"};

  /** 短絡地絡 */
  public static final int CstRySCirGFault_Unknown       = 1;
  public static final int CstRySCirGFault_Shortcircuit  = 2;
  public static final int CstRySCirGFault_Earthfault    = 3;
  public static final int CstRySCirGFault_Same          = 4;

  public static final String[] CstRySCirGFault_Str = new String[]{"", "短絡", "地絡","短地"};

  /** 事故内容記録更新処理区分 */
  public static final int CstRyParamRequestNormal = 0;    /**  ６ｋＶ配電線事故状況画面からの表示（通常処理） */
  public static final int CstRyParamRequestAdd = 1;       /**  件名追加ダイアログからの表示（件名追加処理） */

  /**  エリア */
  public static final int CstRyAreaCode_Tochigi   = 1;  /**  栃木 */
  public static final int CstRyAreaCode_Gunma     = 2;  /**  群馬 */
  public static final int CstRyAreaCode_Ibaraki   = 3;  /**  茨城 */
  public static final int CstRyAreaCode_Saitama   = 4;  /**  埼玉 */
  public static final int CstRyAreaCode_Chiba     = 5;  /**  千葉 */
  public static final int CstRyAreaCode_Tokyo     = 6;  /**  東京 */
  public static final int CstRyAreaCode_Tama      = 7;  /**  多摩 */
  public static final int CstRyAreaCode_Kanagawa  = 8;  /**  神奈川 */
  public static final int CstRyAreaCode_Yamanashi = 9;  /**  山梨 */
  public static final int CstRyAreaCode_Shizuoka  = 10; /**  静岡 */

  /**  テーブル名 */
  public static final String CstRyTblReFLBoutRcvryConsumer = "TblReFLBoutRcvryConsumer";     /** 配電線停電復旧需要家情報 */
  public static final String CstRyTblReUSBoutRcvryConsumer = "TblReUSBoutRcvryConsumer";   /** 上位系統停電復旧需要家情報 */

  /**  一覧表示件数 */
  public static final int  CstRyWinpry000001_ListDispCnt01 = 50;      /**  系制事故件名一覧（事故件名一覧） */
  public static final int  CstRyWinpry000002_ListDispCnt01 = 100;      /**  系制事故状況一覧（事故内容記録） */
  public static final int  CstRyWinpry000002_ListDispCnt02 = 30;       /**  系制事故状況一覧（事故設備） */
  public static final int  CstRyWinpry000002_ListDispCnt03 = 30;       /**  系制事故状況一覧（保安計器指示状況） */
  /** Rev.i04 Mod Start */
  /** public static final int  CstRyWinpry000003_ListDispCnt01 = 100;    // 系制支障状況 画面（供給支障） */
  /** public static final int  CstRyWinpry000003_ListDispCnt02 = 100;    // 系制支障状況 画面（発電支障） */
  /** public static final int  CstRyWinpry000003_ListDispCnt03 = 100;    // 系制支障状況 画面（関連事業所名） */
  public static final int  CstRyWinpry000003_ListDispCnt01 = 150;     /**  系制支障状況 画面（供給支障） */
  public static final int  CstRyWinpry000003_ListDispCnt02 = 150;      /**  系制支障状況 画面（発電支障） */
  public static final int  CstRyWinpry000003_ListDispCnt03 = 150;     /**  系制支障状況 画面（関連事業所名） */
  /** Rev.i04 Mod End */
  public static final int  CstRyWinpry000004_ListDispCnt01 = 50;      /**  系制配信状況一覧画面 */
  public static final int  CstRyWinpry000005_ListDispCnt01 = 100;      /**  系制特高需要家停止実績一覧画面（停止実績一覧） */
  public static final int  CstRyWinpry000010_ListDispCnt01 = 80;      /**  調相設備稼働状況一覧画面 */
  public static final int  CstRyWinpry000010_ListDispCnt02 = 80;      /**  調相設備稼働状況一覧画面 */
  public static final int  CstRyWinpry000010_ListDispCnt03 = 80;      /**  調相設備稼働状況一覧画面 */
  public static final int  CstRyWinpry000011_ListDispCnt01 = 20;     /**  配変情報一覧画面（配変情報一覧） */
  /** Rev.i42 Mod Start */
/**   public static final int  CstRyWinpry000040_ListDispCnt01 = 45;     // 配制事故件名一覧画面（事故件名一覧） */
  public static final int  CstRyWinpry000040_ListDispCnt01 = 9000;     /**  配制事故件名一覧画面（事故件名一覧） */
  /** Rev.i42 Mod End */
  public static final int  CstRyWinpry000041_ListDispCnt01 = 30;       /**  ６ｋＶ配電線事故状況画面（配電線事故前電流） */
  public static final int  CstRyWinpry000041_ListDispCnt02 = 100;      /**  ６ｋＶ配電線事故状況画面（事故時操作手順） */
  public static final int  CstRyWinpry000041_ListDispCnt03 = 100;     /**  ６ｋＶ配電線事故状況画面（事故件名一覧） */
  public static final int  CstRyWinpry000041_ListDispCnt05 = 30;       /**  ６ｋＶ上位系統事故状況画面（事故前電流） */
  public static final int  CstRyWinpry000042_ListDispCnt01 = 30;       /**  ６ｋＶ上位系統事故状況画面（事故状況） */
  public static final int  CstRyWinpry000042_ListDispCnt02 = 100;      /**  ６ｋＶ上位系統事故状況画面（事故内容記録） */
  public static final int  CstRyWinpry000042_ListDispCnt03 = 100;      /**  ６ｋＶ上位系統事故状況画面（事故時操作手順） */
  public static final int  CstRyWinpry000042_ListDispCnt04 = 150;     /**  ６ｋＶ上位系統事故状況画面（事故件名一覧） */
  public static final int  CstRyWinpry000042_ListDispCnt05 = 30;       /**  ６ｋＶ上位系統事故状況画面（事故前電流） */
  public static final int  CstRyWinpry000043_ListDispCnt01 = 100;      /**  ２２ｋＶ系統事故状況画面（事故内容記録） */
  public static final int  CstRyWinpry000043_ListDispCnt02 = 100;      /**  ２２ｋＶ系統事故状況画面（事故設備） */
  public static final int  CstRyWinpry000043_ListDispCnt03 = 100;      /**  ２２ｋＶ系統事故状況画面（保安計器指示状況） */
  public static final int  CstRyWinpry000043_ListDispCnt04 = 150;     /**  ２２ｋＶ系統事故状況画面（事故件名一覧） */
  /** Rev.i22 Add Start */
  public static final int  CstRyWinpry020046_ListDispCnt01 = 1000;     /**  ＦＡＸ送信結果レポート一覧画面 */
  /** Rev.i22 Add End */
  /** Rev.i10 Mod Start */
  public static final int  CstRyWinpry000043_ListDispCnt05 = 80;     /**  ２２ｋＶ系統事検出段階出力（N段判定） */
  /** Rev.i10 Mod End */
  /** Rev.i04 Mod Start */
  /** public static final int  CstRyWinpry000044_ListDispCnt01 = 100;    // 配制支障状況画面（供給支障） */
  /** public static final int  CstRyWinpry000044_ListDispCnt02 = 100;    // 配制支障状況画面（発電支障） */
  /** public static final int  CstRyWinpry000044_ListDispCnt03 = 100;    // 配制支障状況画面（関連事業所名） */
  public static final int  CstRyWinpry000044_ListDispCnt01 = 150;     /**  配制支障状況画面（供給支障） */
  public static final int  CstRyWinpry000044_ListDispCnt02 = 150;      /**  配制支障状況画面（発電支障） */
  public static final int  CstRyWinpry000044_ListDispCnt03 = 150;     /**  配制支障状況画面（関連事業所名） */
  /** Rev.i04 Mod End */
  public static final int  CstRyWinpry000046_ListDispCnt01 = 45;     /**  配制配信状況一覧画面（配信状況一覧） */
  public static final int  CstRyWinpry000047_ListDispCnt01 = 100;      /**  配制特高需要家停止実績一覧画面（停止実績一覧） */
  /** Rev.i01 Mod Start */
  /** public static final int  CstRyWinpry000050_ListDispCnt01 = 100;    // 配電線事故前電流一覧画面（事故前電流情報） */
  public static final int  CstRyWinpry000050_ListDispCnt01 = 110;    /**  配電線事故前電流一覧画面（事故前電流情報） */
  /** public static final int  CstRyWinpry000052_ListDispCnt01 = 100;    // 配電線事故トリップ管理 */
  public static final int  CstRyWinpry000052_ListDispCnt01 = 100;     /**  配電線事故トリップ管理 */
  /** public static final int  CstRyWinpry000053_ListDispCnt01 = 100;    // 停電情報ロック管理画面（停電ロック情報） */
  public static final int  CstRyWinpry000053_ListDispCnt01 = 220;     /**  停電情報ロック管理画面（停電ロック情報） */
  /** public static final int  CstRyWinpry000054_ListDispCnt01 = 100;    // 事故停電変電所一覧画面（事故停電配電線状況情報） */
  public static final int  CstRyWinpry000054_ListDispCnt01 = 220;     /**  事故停電変電所一覧画面（事故停電配電線状況情報） */
  /** public static final int  CstRyWinpry000055_ListDispCnt01 = 100;    // 事故停電配電線一覧画面（事故停電配電線状況情報） */
  public static final int  CstRyWinpry000055_ListDispCnt01 = 220;     /**  事故停電配電線一覧画面（事故停電配電線状況情報） */
  /** Rev.i01 Mod End */
  /** Rev.i25 Mod Start */
  public static final int  CstRyWinpry000070_ListDispCnt01 = 100;     /**  オフラインＴＭ設定画面（オフラインＴＭ対象） */
  public static final int  CstRyWinpry000070_ListDispCnt02 = 50;     /**  オフラインＴＭ設定画面（配変バンク対象） */
  /** public static final int  CstRyWinpry000070_ListDispCnt01 = 140;     // オフラインＴＭ設定画面（オフラインＴＭ対象） */
  /** Rev.i25 Mod End */
  public static final int  CstRyWinpry100001_ListDispCnt01 = 140;     /**  オフラインＴＭ設定画面（オフラインＴＭ対象） */
  public static final int  CstRyWinpry000071_ListDispCnt01 = 100;    /**  供給支障算出用オフラインＴＭ設定画面（オンライン個別ＴＭ未設定所名） */
  public static final int  CstRyWinpry000071_ListDispCnt02 = 15;       /**  供給支障算出用オフラインＴＭ設定画面（TM内訳） */
  /**  Rev.i40 MOD Start */
/**   public static final int  CstRyWinpry000071_ListDispCnt03 = 80;      // 供給支障算出用オフラインＴＭ設定画面（発電支障表示用所名変換設定） */
  public static final int  CstRyWinpry000071_ListDispCnt03 = 15;      /**  供給支障算出用オフラインＴＭ設定画面（発電支障表示用所名変換設定） */
  /**  Rev.i40 MOD End */
  /** Rev.i08 Add Start */
  public static final int  CstRyWinpry000007_ListDispCnt01 = 100;      /**  系制事故速報画面 */
  public static final int  CstRyWinpry000045_ListDispCnt01 = 100;      /**  配制事故速報画面 */
  public static final int  CstRyWinpry000057_ListDispCnt01 = 150;     /**  末端事故後監視状況画面 */
  public static final int  CstRyWinpry000058_ListDispCnt01 = 100;      /**  事故用音声警報鳴動設定画面(設置拠点一覧テーブル) */
  public static final int  CstRyWinpry000058_ListDispCnt02 = 24;       /**  事故用音声警報鳴動設定画面(配電線一覧テーブル) */
  public static final int  CstRyWinpry000059_ListDispCnt01 = 100;      /**  ６ｋＶ配電線事故判定マトリクス */
  public static final int  CstRyWinpry000060_ListDispCnt01 = 100;      /**  ６ｋＶ上位系統事故判定マトリクス */
/** Rev.i38 Mod Start */
/**   public static final int  CstRyWinpry000061_ListDispCnt01 = 100;      // ２２ｋＶ系統事故判定マトリクス */
  public static final int  CstRyWinpry000061_ListDispCnt01 = 176;      /**  ２２ｋＶ系統事故判定マトリクス */
/** Rev.i38 Mod End */
  public static final int  CstRyWinpry000072_ListDispCnt01 = 100;      /**  供給地域設定画面テーブル１ */
  public static final int  CstRyWinpry000072_ListDispCnt02 = 100;      /**  供給地域設定画面テーブル２ */
  public static final int  CstRyWinpry000073_ListDispCnt01 = 500;     /**  配変供給地域設定画面テーブル */
  public static final int  CstRyWinpry010007_ListDispCnt01 = 100;      /**  系制事故速報特記事項設定画面 */
  public static final int  CstRyWinpry010045_ListDispCnt01 = 100;      /**  配制事故速報特記事項設定画面 */
  /** Rev.i08 Add End */
  /** Rev.i15 Add Start */
  public static final int  CstRyWinpry000062_ListDispCnt01 = 44;       /**  事故関連ポジション画面  // Rev.i21 Mod */
  /** Rev.i15 Add Start */

  public static final int  CstRyPoppry000204_ListDispCnt01 = 187;   /**  事故設備設定(所名一覧テーブル) */
  /** Rev.i06 Mod Start */
  /** public static final int  CstRyPoppry000204_ListDispCnt02 = 300;    // 事故設備設定(設備名一覧テーブル) */
  public static final int  CstRyPoppry000204_ListDispCnt02 = 250;     /**  事故設備設定(設備名一覧テーブル) */
  /** Rev.i06 Mod End */
  public static final int  CstRyPoppry000209_ListDispCnt01 = 181;   /**  所名変換設定(所名一覧テーブル) */
  /** Rev.i06 Mod Start */
  /** public static final int  CstRyPoppry000209_ListDispCnt02 = 300;    // 所名変換設定(設備名一覧テーブル) */
  public static final int  CstRyPoppry000209_ListDispCnt02 = 250;     /**  所名変換設定(設備名一覧テーブル) */
  /** Rev.i06 Mod End */
  public static final int  CstRyPoppry000210_ListDispCnt01 = 181;   /**  事故内容記録設定(所名一覧テーブル) */
  /** Rev.i06 Mod Start */
  /** public static final int  CstRyPoppry000210_ListDispCnt02 = 2000;   // 事故内容記録設定(設備名機器名一覧テーブル) */
  public static final int  CstRyPoppry000210_ListDispCnt02 = 500;     /**  事故内容記録設定(設備名機器名一覧テーブル) */
  /** Rev.i06 Mod End */
  public static final int  CstRyPoppry000211_ListDispCnt01 = 181;   /**  保安計器設定(所名一覧テーブル) */
  /** Rev.i06 Mod Start */
  /** public static final int  CstRyPoppry000211_ListDispCnt02 = 300;    // 保安計器設定(設備名一覧テーブル) */
  public static final int  CstRyPoppry000211_ListDispCnt02 = 250;     /**  保安計器設定(設備名一覧テーブル) */
  /** Rev.i06 Mod End */
  /** Rev.i02 Mod Start */
  /** public static final int  CstRyPoppry000245_ListDispCnt01 = 100;    // 停電・復旧お客さま一覧ダイアログ画面 */
  public static final int  CstRyPoppry000245_ListDispCnt01 = 200;      /**  停電・復旧お客さま一覧ダイアログ画面 */
  /** Rev.i02 Mod End */
  public static final int  CstRyPoppry000248_ListDispCnt01 = 100;      /**  事故内容記録 */
  public static final int  CstRyPoppry000249_ListDispCnt01 = 30;       /**  保安計器指示状況（配制） */
  public static final int  CstRyPoppry000273_ListDispCnt01 = 100;      /**  配信状況ダイアログ画面 */
  public static final int  CstRyPoppry000275_ListDispCnt01 = 187;   /**  設備名称設定(所名一覧テーブル) */
  /** Rev.i06 Mod Start */
 /**  public static final int  CstRyPoppry000275_ListDispCnt02 = 300;    // 設備名称設定(設備名一覧テーブル) */
  public static final int  CstRyPoppry000275_ListDispCnt02 = 250;     /**  設備名称設定(設備名一覧テーブル) */
  /** Rev.i06 Mod End */

  public static final int  CstRyPoppry000278_ListDispCnt01 = 187;   /**  オフラインＴＭ設定(所名一覧テーブル) */
  /** Rev.i06 Mod Start */
  /** public static final int  CstRyPoppry000278_ListDispCnt02 = 250;    // オフラインＴＭ設定(設備名一覧テーブル) */
  public static final int  CstRyPoppry000278_ListDispCnt02 = 20;     /**  オフラインＴＭ設定(設備名一覧テーブル) */
  /** Rev.i06 Mod End */
  public static final int  CstRyPoppry000282_ListDispCnt01 = 50;      /**  事故件名選択ダイアログ画面 */

  /** Rev.i08 Add Start */
  public static final int  CstRyPoppry000217_ListDispCnt01 = 100;      /**  発電機設定画面テーブル */
  public static final int  CstRyPoppry000217_ListDispCnt02 = 100;      /**  発電機（設備）設定画面テーブル */
  public static final int  CstRyPoppry000218_ListDispCnt01 = 100;      /**  需要家設定画面テーブル */
  public static final int  CstRyPoppry000256_ListDispCnt01 = 100;      /**  音声警報鳴動装置設定画面テーブル */
  public static final int  CstRyPoppry000276_ListDispCnt01 = 100;      /**  配変供給地域設定画面テーブル */
  public static final int  CstRyPoppry000283_ListDispCnt01 = 100;      /**  超重要お客様設定ダイアログ画面 */
  public static final int  CstRyPoppry000219_ListDispCnt01 = 100;     /**  送電線設定ダイアログ画面 */
  public static final int  CstRyPoppry000219_ListDispCnt02 = 100;      /**  送電線設定ダイアログ画面 */
  public static final int  CstRyWinpry010043_ListDispCnt01 = 30;       /**  ２２ｋＶ回線選択・お客さま設備事故状況画面（事故検出設備） */
  /** Rev.i16 Mod Start */
/**   public static final int  CstRyWinpry010043_ListDispCnt02 = 1500;     // ２２ｋＶ回線選択・お客さま設備事故状況画面（事故件名一覧） */
  public static final int  CstRyWinpry010043_ListDispCnt02 = 3000;     /**  ２２ｋＶ回線選択・お客さま設備事故状況画面（事故件名一覧） */
  /** Rev.i16 Mod End */
  /** Rev.i08 Add End */

  public static final int  CstRySubpry000110_ListDispCnt01 = 1000;     /**  調相設備検索条件 */
  public static final int  CstRySubpry000111_ListDispCnt01 = 1000;     /**  配変情報一覧サブパネル画面 */
  public static final int  CstRySubpry000145_ListDispCnt01 = 180;   /**  配制配電線検索(事故前電流一覧)(所名一覧テーブル) */
  public static final int  CstRySubpry000145_ListDispCnt02 = 200;      /**  配制配電線検索(事故前電流一覧)(配電線名一覧テーブル) */
  public static final int  CstRySubpry000146_ListDispCnt01 = 181807;   /**  配制配電線検索(事故前電流設定)(所名一覧テーブル) */
  public static final int  CstRySubpry000146_ListDispCnt02 = 300;      /**  配制配電線検索(事故前電流設定)(配電線名一覧テーブル) */
  public static final int  CstRySubpry000148_ListDispCnt01 = 200;      /**  配制電気所名選択サブパネル画面 */
  /** Rev.i08 Add Start */
  public static final int  CstRySubpry000150_ListDispCnt01 = 200;      /**  末端事故後監視状況検索条件サブパネル画面(所名一覧テーブル) */
  public static final int  CstRySubpry000151_ListDispCnt01 = 200;      /**  音声警報鳴動設定検索条件サブパネル画面(所名一覧テーブル) */
  public static final int  CstRySubpry000151_ListDispCnt02 = 100;      /**  音声警報鳴動設定検索条件サブパネル画面(設置拠点一覧テーブル) */
  public static final int  CstRySubpry000152_ListDispCnt01 = 100;      /**  事故判定マトリクス検索条件 */
  public static final int  CstRySubpry000152_ListDispCnt02 = 100;      /**  事故判定マトリクス検索条件 */
  public static final int  CstRySubpry000171_ListDispCnt01 = 800;      /**  供給地域検索条件サブパネル画面 */
  /** Rev.i08 Add End */
  /**  メイン画面ピクチャ名 */
  public static final String  CstRyWinpry000001 = "Winpry000001";  /**  系制事故件名一覧 画面 */
  public static final String  CstRyWinpry000002 = "Winpry000002";  /**  系制事故状況 画面 */
  public static final String  CstRyWinpry000003 = "Winpry000003";  /**  系制支障状況 画面 */
  public static final String  CstRyWinpry000004 = "Winpry000004";  /**  系制配信状況一覧 画面 */
  public static final String  CstRyWinpry000005 = "Winpry000005";  /**  系制特高需要家停止実績一覧 画面 */
  public static final String  CstRyWinpry000006 = "Winpry000006";  /**  系制事故前後系統状態 画面 */
  public static final String  CstRyWinpry000007 = "Winpry000007";  /**  系制事故速報 画面 */
  public static final String  CstRyWinpry000008 = "Winpry000008";  /**  ＦＡＸ送信先設定画面 */
  public static final String  CstRyWinpry000009 = "Winpry000009";  /**  事故速報特記事項設定 画面 */
  public static final String  CstRyWinpry000010 = "Winpry000010";  /**  調相設備稼働状況一覧画面 */
  public static final String  CstRyWinpry000011 = "Winpry000011";  /**  配変情報一覧画面 */
  public static final String  CstRyWinpry000040 = "Winpry000040";  /**  配制事故件名一覧 */
  public static final String  CstRyWinpry000041 = "Winpry000041";  /**  ６ｋＶ配電線事故状況画面 */
  public static final String  CstRyWinpry000042 = "Winpry000042";  /**  ６ｋＶ上位系統事故状況画面 */
  public static final String  CstRyWinpry000043 = "Winpry000043";  /**  ２２ｋＶ系統事故状況画面 */
  public static final String  CstRyWinpry000044 = "Winpry000044";  /**  配制支障状況画面 */
  public static final String  CstRyWinpry000045 = "Winpry000045";  /**  配制事故速報画面 */
  public static final String  CstRyWinpry000046 = "Winpry000046";  /**  配制配信状況一覧画面 */
  public static final String  CstRyWinpry000047 = "Winpry000047";  /**  配制特高需要家停止実績一覧画面 */
  public static final String  CstRyWinpry000048 = "Winpry000048";  /**  配制事故前後系統状態画面 */
  public static final String  CstRyWinpry000049 = "Winpry000049";  /**  配制事故速報特記事項設定画面 */
  public static final String  CstRyWinpry000050 = "Winpry000050";  /**  配電線事故前電流一覧画面 */
  public static final String  CstRyWinpry000051 = "Winpry000051";  /**  配電線事故前電流設定画面 */
  public static final String  CstRyWinpry000052 = "Winpry000052";  /**  配電線事故トリップ管理画面 */
  public static final String  CstRyWinpry000053 = "Winpry000053";  /**  停電情報ロック管理画面 */
  public static final String  CstRyWinpry000054 = "Winpry000054";  /**  事故停電変電所一覧画面 */
  public static final String  CstRyWinpry000055 = "Winpry000055";  /**  事故停電配電線一覧画面 */
  public static final String  CstRyWinpry000056 = "Winpry000056";  /**  手動模擬実行配電線路状態画面 */
  public static final String  CstRyWinpry010004 = "Winpry010004";  /**  系制FAX送信先設定画面 */
  public static final String  CstRyWinpry010006 = "Winpry010006";  /**  系制部分系統図スケルトン画面 */
  public static final String  CstRyWinpry010007 = "Winpry010007";  /**  系制事故速報特記事項設定画面 */
  public static final String  CstRyWinpry010045 = "Winpry010045";  /**  配制事故速報特記事項設定画面 */
  public static final String  CstRyWinpry010046 = "Winpry010046";  /**  配制FAX送信先設定画面 */
  public static final String  CstRyWinpry010048 = "Winpry010048";  /**  系制部分系統図スケルトン画面 */
  public static final String  CstRyWinpry020006 = "Winpry020006";  /**  系制単線結線図スケルトン画面 */
  public static final String  CstRyWinpry020048 = "Winpry020048";  /**  配制単線結線図・22kV系統図スケルトン画面 */
  public static final String  CstRyWinpry030006 = "Winpry030006";  /**  調相設備稼働状況一覧画面 */

  /** Rev.i05 Add Start */
  public static final String  CstRyWinpry000030 = "Winpry000030";  /**  状変記録（変電所）画面 */
  /** Rev.i05 Add End */
  /** Rev.i08 Add Start */
  public static final String  CstRyWinpry000057 = "Winpry000057";  /**  未端事故後監視状況画面 */
  public static final String  CstRyWinpry000058 = "Winpry000058";  /**  事故用音声警報鳴動設定画面 */
  public static final String  CstRyWinpry000059 = "Winpry000059";  /**  ６ｋＶ配電線事故判定マトリクス画面 */
  public static final String  CstRyWinpry000060 = "Winpry000060";  /**  ６ｋＶ上位系統事故判定マトリクス画面 */
  public static final String  CstRyWinpry000061 = "Winpry000061";  /**  ２２ｋＶ系統事故判定マトリクス画面 */
  public static final String  CstRyWinpry010043 = "Winpry010043";  /**  ２２ｋＶ回線選択・お客さま設備事故状況画面 */
  public static final String  CstRyWinpry000073 = "Winpry000073";  /**  配変供給地域設定 画面 */
  public static final String  CstRyWinpry020004 = "Winpry020004";  /**  ＦＡＸ送信結果レポート一覧画面 */
  public static final String  CstRyWinpry020046 = "Winpry020046";  /**  ＦＡＸ送信結果レポート一覧画面 */
  /** Rev.i08 Add End */
  /** Rev.i15 Add Start */
  public static final String  CstRyWinpry000062 = "Winpry000062";  /**  事故関連ポジション画面 */
  /** Rev.i46 Mod Start */
/**   public static final String  CstRyWinpry000063 = "Winpry000063";  // テストデータ送信画面 */
  public static final String  CstRyWinpry010053 = "Winpry010053";  /**  テストデータ送信画面 */
  /** Rev.i46 Mod End */
  public static final String  CstRyWinpry000064 = "Winpry000064";  /**  事故設備判定処理状態設定画面 */
  /** Rev.i15 Add End */
  /** スケルトン業務 */
  public static final String  CstRyWinpdy000001 = "Winpdy000001";  /**  部分系統図画面 */
  public static final String  CstRyWinpdy000002 = "Winpdy000002";  /**  単線結線図画面 */
  public static final String  CstRyWinpdy000003 = "Winpdy000003";  /**  系統総括図画面 */
  public static final String  CstRyWinpdy000008 = "Winpdy000008";  /**  配電線路図 */
  public static final String  CstRyWinpcy000021 = "Winpcy000021";  /**  状変記録（変電所）画面 */

  /** ダイアログ画面ピクチャ名 */
  public static final String  CstRyPoppry000200 = "Poppry000200";  /**  特高需要家設定ダイアログ画面 */
  public static final String  CstRyPoppry000201 = "Poppry000201";  /**  停電発生都県設定 ダイアログ画面 */
  public static final String  CstRyPoppry000202 = "Poppry000202";  /**  系制遷移先選択ダイアログ画面 */
  public static final String  CstRyPoppry000203 = "Poppry000203";  /**  系制事故状況印刷選択ダイアログ画面 */
  public static final String  CstRyPoppry000205 = "Poppry000205";  /**  通報印刷選択 ダイアログ画面 */
  public static final String  CstRyPoppry000208 = "Poppry000208";  /**  件名統合ダイアログ画面 */
  public static final String  CstRyPoppry000204 = "Poppry000204";  /**  事故設備設定ダイアログ画面 */
  public static final String  CstRyPoppry000206 = "Poppry000206";  /**  潮流図印字確認ダイアログ画面 */
  public static final String  CstRyPoppry000207 = "Poppry000207";  /**  支障状況印刷 ダイアログ画面 */
  public static final String  CstRyPoppry000209 = "Poppry000209";  /**  所名変換設定ダイアログ画面 */
  public static final String  CstRyPoppry000210 = "Poppry000210";  /**  事故内容記録設定ダイアログ画面 */
  public static final String  CstRyPoppry000211 = "Poppry000211";  /**  保安計器設定ダイアログ画面 */
  public static final String  CstRyPoppry000240 = "Poppry000240";  /**  配制事故件名検索ダイアログ画面 */
  public static final String  CstRyPoppry000241 = "Poppry000241";  /**  トリップ管理確認ダイアログ画面 */
  public static final String  CstRyPoppry000242 = "Poppry000242";  /**  管理終了設定ダイアログ画面 */
  public static final String  CstRyPoppry000243 = "Poppry000243";  /**  監視対象確認ダイアログ画面 */
  public static final String  CstRyPoppry000244 = "Poppry000244";  /**  配制事故状況印刷選択ダイアログ画面 */
  public static final String  CstRyPoppry000245 = "Poppry000245";  /**  停電・復旧お客さま一覧ダイアログ画面 */
  public static final String  CstRyPoppry000246 = "Poppry000246";  /**  配制遷移先選択ダイアログ画面 */
  public static final String  CstRyPoppry000247 = "Poppry000247";  /**  トリップ管理ダイアログ画面 */
  public static final String  CstRyPoppry000248 = "Poppry000248";  /**  事故内容記録ダイアログ画面 */
  public static final String  CstRyPoppry000249 = "Poppry000249";  /**  保安計器指示状況 */
  public static final String  CstRyPoppry000250 = "Poppry000250";  /**  件名追加ダイアログ画面 */
  /** Rev.03 Add Start */
  public static final String  CstRyPoppry000251 = "Poppry000251";  /**  ６ｋＶ配電線スケルトン図 */
  /** Rev.03 Add End */
  /** Rev.i07 Add Start */
  public static final String  CstRyPoppry000252 = "Poppry000252";  /**  ６ｋＶ配電線スケルトン図Pic_1 */
  public static final String  CstRyPoppry000253 = "Poppry000253";  /**  ６ｋＶ配電線スケルトン図Pic_2 */
  public static final String  CstRyPoppry000254 = "Poppry000254";  /**  ６ｋＶ配電線スケルトン図Pic_3 */
  /** Rev.i07 Add End */
  /**  Rev.i12 Add Start */
  public static final String  CstRyPoppry000259 = "Poppry000259";  /**  ６ｋＶ配電線事故判定条件設定ダイアログ */
/**   public static final String  CstRyPoppry000260 = "Poppry000260";  // ６ｋＶ上位系統事故判定条件設定ダイアログ */
  public static final String  CstRyPoppry000261 = "Poppry000261";  /**  XXXXXX事故判定条件設定ダイアログ */
  public static final String  CstRyPoppry000262 = "Poppry000262";  /**  XXXXXXXダイアログ */
  public static final String  CstRyPoppry000263 = "Poppry000263";  /**  XXXXXXXダイアログ */
  /**  Rev.i12 Add End */
  /**  Revi15 Add Start */
  public static final String  CstRyPoppry000264 = "Poppry000264";  /**  復旧手順作成手動起動確認ダイアログ画面 */
  public static final String  CstRyPoppry000265 = "Poppry000265";  /**  事故関連ポジション設定ダイアログ画面 */
  public static final String  CstRyPoppry000266 = "Poppry000266";  /**  配電線設定ダイアログ画面 */
  /**  Revi15 Add End */
  public static final String  CstRyPoppry000273 = "Poppry000273";  /**  配信状況ダイアログ画面 */
  public static final String  CstRyPoppry000274 = "Poppry000274";  /**  日時入力ダイアログ画面 */
  public static final String  CstRyPoppry000275 = "Poppry000275";  /**  設備名称設定ダイアログ画面 */

  public static final String  CstRyPoppry000278 = "Poppry000278";  /**  オフラインＴＭ設定（サブ） */
  public static final String  CstRyPoppry000281 = "Poppry000281";  /**  計算式設定ダイアログ画面 */
  public static final String  CstRyPoppry000282 = "Poppry000282";  /**  事故件名選択ダイアログ画面 */
  /** Rev.i08 Add Start */
  public static final String  CstRyPoppry000217 = "Poppry000217";  /**  発電機設定ダイアログ画面 */
  public static final String  CstRyPoppry000218 = "Poppry000218";  /**  需要家設定ダイアログ画面 */
  public static final String  CstRyPoppry000219 = "Poppry000219";  /**  送電線設定ダイアログ画面 */
  /** Rev.i25 Add Start */
  public static final String  CstRyPoppry000222 = "Poppry000222";  /**  配変バンク設定ダイアログ画面 */
  /** Rev.i25 Add End */
  public static final String  CstRyPoppry000256 = "Poppry000256";  /**  音声警報鳴動装置設定ダイアログ画面 */
  public static final String  CstRyPoppry000260 = "Poppry000260";  /**  機器状態・経路開閉器条件確認ダイアログ画面 */
  public static final String  CstRyPoppry000276 = "Poppry000276";  /**  配変供給地域設定ダイアログ画面 */
  public static final String  CstRyPoppry000283 = "Poppry000283";  /**  超重要お客様設定ダイアログ画面 */
  public static final String  CstRyPoppry000284 = "Poppry000284";  /**  事故速報送信イメージダイアログ画面 */
  public static final String  CstRyPoppry000220 = "Poppry000220";  /**  特記事項設定ダイアログ画面 */
  /** Rev.i08 Add End */
  /**  サブ画面ピクチャ名 */
  public static final String  CstRySubpry000101 = "Subpry000101";  /**  系制事故件名一覧サブパネル画面 */
  public static final String  CstRySubpry000102 = "Subpry000102";  /**  系制画面遷移サブパネル画面 */
  public static final String  CstRySubpry000104 = "Subpry000104";  /**  事故件名検索条件(特記なし)サブパネル画面 */
  public static final String  CstRySubpry000106 = "Subpry000106";  /**  系制事故前後系統サブパネル画面 */
  public static final String  CstRySubpry000110 = "Subpry000110";  /**  調相設備検索条件 */
  public static final String  CstRySubpry000111 = "Subpry000111";  /**  配変情報一覧サブパネル画面 */
  public static final String  CstRySubpry000141 = "Subpry000141";  /**  配制事故件名一覧サブパネル画面 */
  public static final String  CstRySubpry000142 = "Subpry000142";  /**  配制画面遷移サブパネル画面 */
  public static final String  CstRySubpry000143 = "Subpry000143";  /**  配制配信状況一覧サブパネル画面 */
  public static final String  CstRySubpry000144 = "Subpry000144";  /**  配制事故前後系統サブパネル画面 */
  public static final String  CstRySubpry000145 = "Subpry000145";  /**  配電線事故前電流一覧サブパネル画面 */
  public static final String  CstRySubpry000146 = "Subpry000146";  /**  配制配電線検索（事故前電流設定） */
  public static final String  CstRySubpry000147 = "Subpry000147";  /**  配電線事故トリップ管理サブパネル画面 */
  public static final String  CstRySubpry000148 = "Subpry000148";  /**  配制電気所名選択サブパネル画面 */
  /** Rev.i05 Add Start */
  public static final String  CstRySubpry000131 = "Subpry000131";  /**  状変記録（変電所）サブパネル画面 */
  public static final String  CstRySubpry000149 = "Subpry000149";  /**  単線結線図サブパネル画面 */
  /** Rev.i05 Add End */
  /** Rev.i08 Add Start */
  public static final String  CstRySubpry000150 = "Subpry000150";  /**  末端事故後監視状況検索条件サブパネル画面 */
  public static final String  CstRySubpry000151 = "Subpry000151";  /**  音声警報鳴動設定検索条件サブパネル画面 */
  public static final String  CstRySubpry000152 = "Subpry000152";  /**  事故判定マトリクス検索条件サブパネル画面 */
  /** Rev.i29 Add Start */
  public static final String  CstRySubpry000153 = "Subpry000153";  /**  6Kv上位事故判定マトリクス検索条件サブパネル画面 */
  /** Rev.i29 Add End */
  /** Rev.i31 Add Start */
  public static final String  CstRySubpry000154 = "Subpry000154";  /**  22Kv系統事故判定マトリクス検索条件サブパネル画面 */
  /** Rev.i31 Add End */
  /** Rev.i30 Add Start */
  public static final String  CstRySubpry000155 = "Subpry000155";  /**  事故関連ポジション検索条件サブパネル画面 */
  /** Rev.i30 Add End */
  public static final String  CstRySubpry000171 = "Subpry000171";  /**  供給地域検索条件サブパネル画面 */
  /** Rev.i08 Add End */
  /**  期間 */
  public static final int CstRyCrntTrmPeriod_CurrentTerm      = 1;  /**  当期 */
  public static final int CstRyCrntTrmPeriod_PreviousTerm     = 2;  /**  前期 */
  public static final int CstRyCrntTrmPeriod_BefSecndTerm     = 3;  /**  前々期 */

  public static final String[] CstRyCrntTrmPeriodStr    = new String[]{"当期", "前期", "前々期"};
  /** Rev.i19 Add Start */
  /** 跨ぎ配電線事故自動復旧機能ロック設定 */
  public static final int CstRyMTZidoufukyuStatus_use      = 1;  /**  使用 */
  public static final int CstRyMTZidoufukyuStatus_Lockyu     = 2;  /**  ロック（他管轄配電線有効） */
  public static final int CstRyMTZidoufukyuStatus_Lockmu     = 3;  /**  ロック（他管轄配電線無効） */

  public static final String[] CstRyMTZidoufukyuStatusStr    = new String[]{"使用", "ロック（他管轄配電線有効）", "ロック（他管轄配電線無効）"};
  /** Rev.i19 Add End */
  /**  管理区分 */
  public static final int CstRyManagementDivision_FdrLin   = 1; /**  配電線 */
  public static final int CstRyManagementDivision_6kV       = 2; /**  6kV上位 */
  public static final int CstRyManagementDivision_22kV      = 3; /**  22kV */
  public static final int CstRyManagementDivision_RelatedPos = 4; /**  事故関連ポジション  // Rev.i21 Add */

  public static final String[] CstRyManagementDivisionStr = new String[]{"","配電線","6kV上位","22kV"};

  /**  釦押下種別 */
  public static final int CstRyBtnKindOK = 1;
  public static final int CstRyBtnKindCancel = 0;

  /**  特定区分 */
  public static final String CstRyTokuteiMu = "無効";
  public static final String CstRyTokuteiYu = "有効";

  /**  設定区分 */
  public static final int CstRyPatternFlgMu = 0;  /**  無効 */
  public static final int CstRyPatternFlgYu = 1;  /**  有効 */

  public static final String[]CstRyPatternFlgStr = new String[]{"無効","有効"};

  /**  系制・配制フラグ */
  public static final int CstRyKeisei = 0;  /**  系制 */
  public static final int CstRyHaisei = 1;  /**  配制 */

  /**  事故区分 */
  public static final int CstRyTrblDivisionSerious = 1;       /**  重大事故 */
  public static final int CstRyTrblDivisionGeneral = 2;       /**  一般事故 */
  public static final int CstRyTrblDivisionSystem = 3;        /**  系統情報 */
  public static final int CstRyTrblDivisionNuclearPower = 4;  /**  原子力情報 */
  public static final int CstRyTrblDivisionOtherCompany = 5;  /**  他社情報 */
  public static final int CstRyTrblDivisionVoltageDown = 6;   /**  瞬時電圧低下 */

  public static final String[] CstTrblDivisionStr = new String[]{"","重大事故","一般事故","系統情報","原子力情報","他社情報","瞬時電圧低下"};

  /**  事故速報メッセージ送信状態 */
  public static final int CstRyMsgSendStateinit = 0;    /**  初期値 */
  public static final int CstRyMsgSendStateComp = 1;    /**  送信完 */
  public static final int CstRyMsgSendStateNotSend = 2; /**  未送信 */
  public static final int CstRyMsgSendStateSend = 3;    /**  送信中 */
  public static final int CstRyMsgSendStateFailure = 4; /**  送信失敗 */

  public static final String[] CstRyMsgSendStateStr = new String[]{"","送信完","未送信","送信中","送信失敗"};

  /**  事故速報FAX送信状態 */
  public static final int CstRyFaxSendStateinit = 0;    /**  初期値 */
  public static final int CstRyFaxSendStateComp = 1;    /**  送信完 */
  public static final int CstRyFaxSendStateNotSend = 2; /**  未送信 */
  public static final int CstRyFaxSendStateSend = 3;    /**  送信中 */
  public static final int CstRyFaxSendStateFailure = 4; /**  送信失敗 */
  public static final int CstRyFaxSendStateLock = 5;    /**  ロック中 */

  public static final String[] CstRyFaxSendStateStr = new String[]{"","送信完","未送信","送信中","送信失敗","ロック中"};

/**  Rev.i35 Add Start */
  /**  処理要求情報 */
  public static final int CstRyReqInf5= 5;    /**  事故情報更新要求中 */
/**  Rev.i35 Add End */

  /**  系統事故速報(イントラ) */
  public static final int CstRyIntraSendStateinit = 0;    /**  初期値 */
  public static final int CstRyIntraSendStateComp = 1;    /**  送信完 */
  public static final int CstRyIntraSendStateNotSend = 2; /**  未送信 */
  public static final int CstRyIntraSendStateSend = 3;    /**  送信中 */
  public static final int CstRyIntraSendStateFailure = 4; /**  送信失敗 */
  public static final int CstRyIntraSendStateLock = 5;    /**  ロック中 */
  public static final int CstRyIntraSendDeleteFailure = 6; /**  削除済 */

  public static final String[] CstRyIntraSendStateStr = new String[]{"","送信完","未送信","送信中","送信失敗","ロック中","削除済"};


  /** 配信状況ダイアログ送信状態 */
  public static final int CstRyRcSendStsComp = 1;      /**  送信完 */
  public static final int CstRyRcSendStsFailure = 3;   /**  送信失敗 */

  public static final String[] CstRyRcSendStsStr = new String[] { "", "送信完", "", "送信失敗" };

  /**  送信先情報 */
  public static final int CstRySendDestInfo_Fax = 1;    /**  事故速報FAX */
  public static final int CstRySendDestInfo_Msg = 2;    /**  事故速報メッセージ */
  public static final int CstRySendDestInfo_Auto = 3;   /**  自動通報(地中送電グループ) */
  public static final int CstRySendDestInfo_Intra = 4;  /**  系統事故速報(イントラ) */
  public static final int CstRySendDestInfo_XML = 6;    /**  事故速報XML */

  /** public static final String[] CstRySendInfoStr = new String[]{"","事故速報","事故速報","自動通報","イントラ"}; */
  public static final String[] CstRySendInfoStr = new String[]{"","事故速報","事故速報","自動通報","イントラ","","事故速報"};
  public static final String[] CstRySendDestStr = new String[]{"","ＦＡＸ同報グループコメント","中系給システム","ＰＣ地端","イントラシステム"};

  /**  第N報 */
  public static final String CstRySendRepNo = "第N報";

  /**  削除 */
  public static final String CstRyDelete = "削除";

  /**  超重 */
  public static final String CstRySuperHeavey = "超重";

  /**  データ取得先 */
  public static final String CstRyShomeiStr = "所名";

  /**  データ取得先 */
  public static final String CstRyHaidenStr = "配電線名";

  /**  データ取得先 */
  public static final String CstRySetteiStr = "設定区分";

  /**  データ取得先 */
  public static final int CstRyDataAcqstnDstntn_Online = 0;
  public static final int CstRyDataAcqstnDstntn = 1;

  /** PV加算 */
  public static final int CstRyPVAddition_True = 1;
  public static final int CstRyPVAddition_False = 0;

  /** 設定有効 */
  public static final int CstRyPattern_True = 1;
  public static final int CstRyPattern_False = 0;

  /**  負荷モデル */
  public static final int CstRyFukaModel_Weekday1 = 1;  /**  平日１ */
  public static final int CstRyFukaModel_Weekday2 = 2;  /**  平日２ */
  public static final int CstRyFukaModel_Weekday3 = 3;  /**  平日３ */
  public static final int CstRyFukaModel_saturday = 4;  /**  土曜日 */
  public static final int CstRyFukaModel_Sunday = 5;    /**  日曜日 */

  public static final String[] CstRyFukaModelStr = new String[]{"","平日１","平日２","平日３","土曜日","日曜日"};
  public static final String[] CstRyFukaModelKey = new String[]{"","RETA","RETB","RETC","RETD","RETE"};

  /**  再閉路ＲＹ自動ロック */
  public static final int CstRyAutoReclosureStatus_True = 1; /** 有効 */
  public static final int CstRyAutoReclosureStatus_False = 0; /** 無効 */

  public static final String[] CstRyAutoReclosureStatusStr = new String[]{"再閉路ＲＹ自動ロック無効","再閉路ＲＹ自動ロック有効"};

  /**  再閉路RY状態 */
  public static final int CstRyReclosureStatus_True = 1; /** 使用 */

  public static final String CstRyReclosureStatusStr = "使用";

  /** Rev.i27 Add Start */
  public static final String CstRyLockStatusStr = "ロック";
  /** Rev.i27 Add End */

  /**  トリップ発生日時 */
  public static final String CstRyTripOccTim = "トリップ発生日時";

  /**  ロック状態 */
  public static final int CstRyLockStatus_True = 1;
  public static final int CstRyLockStatus_False = 0;

  /**  ロック状態 */
  public static final String CstRyLockStatus = "ロック状態";
  /**  ロック中 */
  public static final String CstRyLock = "ロック中";
  /**  トリップ管理状況 */
  public static final String CstRyTripMngState = "トリップ管理状況";

  /**  操作履歴 */
  public static final int CstRyOprHistory_1 = 1; /** 自動再閉路ロック */
  public static final int CstRyOprHistory_2 = 2; /** ロック操作有 */
  public static final int CstRyOprHistory_3 = 3; /** ロック操作無 */
  public static final int CstRyOprHistory_4 = 4; /** 状変検出 */
  public static final int CstRyOprHistory_5 = 5; /** 操作異常終了 */

  public static final String[] CstRyOprHistoryStr = new String[]{"","自動再閉路ロック","ロック操作有","ロック操作無","状変検出","操作異常終了"};

  /**  トリップ管理状況 */
  public static final int CstRyTripMngState_True = 1; /** 管理中 */
  public static final int CstRyTripMngState_False = 0; /** 管理対象外 */

  public static final String[] CstRyTripMngStateStr = new String[]{"管理対象外","管理中"};

  /**  ロック制御可能状態 */
  public static final int CstRyLockAbleState_True = 1; /** ロック制御可能 */

  /**  トリップ管理 */
  public static final int CstRyRimitRY =10;   /**  自動再閉路RYロック回数の上限 */
  public static final int CstRyRimitTrip =10; /**  メッセージ喚起トリップ回数の上限 */
  public static final int CstRyRimitMM =99;   /**  管理時間の時間の上限 */
  public static final int CstRyRimitSS =59;   /**  管理時間の分の上限 */
  public static final int CstRyReqReMode =61;   /**  要求種別：復旧モード設定要求 */
  public static final int CstRyReqKind =62;   /**  要求種別 */

  /**  キューの種別コード */
  public static final int CstRyQueKind0 = 0;
  public static final int CstRyQueKind1 = 1;
  public static final int CstRyQueKind2 = 2;
  public static final int CstRyQueKind3 = 3;
  public static final int CstRyQueKind4 = 4;
  public static final int CstRyQueKind5 = 5;
  public static final int CstRyQueKind6 = 6;
  public static final int CstRyQueKind7 = 7;
  public static final int CstRyQueKind8 = 8;
  public static final int CstRyQueKind9 = 9;
  public static final int CstRyQueKind10 = 10;
  public static final int CstRyQueKind11 = 11;
  public static final int CstRyQueKind12 = 12;
  public static final int CstRyQueKind13 = 13;
  public static final int CstRyQueKind14 = 14;
  public static final int CstRyQueKind15 = 15;
  public static final int CstRyQueKind16 = 16;
  public static final int CstRyQueKind17 = 17;
  public static final int CstRyQueKind20 = 20;
  /** Rev.03 Add Start */
  public static final int CstRyQueKind41 = 41;
  /** Rev.03 Add Start */
  public static final int CstRyQueKind42 = 42;
  /** Rev.03 Add Start */
  public static final int CstRyQueKind43 = 43;
  /** Rev.03 Add Start */
  public static final int CstRyQueKind62 = 62;
  public static final int CstRyQueKind63 = 63;
/** Rev.i32 Add Start */
  public static final int CstRyQueKind92 = 92;  /**  タブフリッカ停止要求 */
/** Rev.i32 Add End */
/** Rev.i36 Add Start */
  public static final int CstRyQueKind93 = 93;  /**  タブ集約表示停止要求 */
/** Rev.i36 Add End */
  /** Rev.i09 Add Start */
  public static final int CstRyQueKind101 = 101;
/**  Rev.i037 Add Start */

  /**  サブ要求種別 */
  public static final int CstRySubReqKind4 =4;  /**  ６ｋＶ配電線事故判定マトリクス */
  public static final int CstRySubReqKind5 =5;  /**  ６ｋＶ上位系統事故判定マトリクス */
  public static final int CstRySubReqKind6 =6;  /**  ２２ｋＶ系統事故判定マトリクス */
  public static final int CstRySubReqKind7 =7;  /**  事故関連ポジション */
/**  Rev.i037 Add End */

  /**  送信種別 */
  public static final int CstRySendKind_Initial = 0; /**  初期値 */
  public static final int CstRySendKind_Auto = 1;    /**  自動 */
  public static final int CstRySendKind_Manual = 2;  /**  手動 */

  /**  手動送信種別 */
  public static final int CstRyManuSendKind1 = 1; /**  イントラ１報 */
  public static final int CstRyManuSendKind2 = 2; /**  イントラ２報 */
  public static final int CstRyManuSendKind3 = 3; /**  イントラ３報 */
  public static final int CstRyManuSendKind4 = 4; /**  自動通報 */
  public static final int CstRyManuSendKind5 = 5; /**  メッセージ */
  public static final int CstRyManuSendKind6 = 6; /**  DWH(csv) */
  public static final int CstRyManuSendKind7 = 7; /**  FAX、DWH(pdf) */
  public static final int CstRyManuSendKind8 = 8; /**  イントラ削除 */
  public static final int CstRyManuSendKind9 = 9; /**  テストデータ送信 */

  /**  印刷対象種別 */
  public static final int CstRyPrintKind1  = 1;  /**  事故件名一覧             (系制) */
  public static final int CstRyPrintKind2  = 2;  /**  事故内容記録             (系制) */
  public static final int CstRyPrintKind3  = 3;  /**  事故設備一覧             (系制) */
  public static final int CstRyPrintKind4  = 4;  /**  保安計器指示状況一覧     (系制) */
  public static final int CstRyPrintKind5  = 5;  /**  供給支障一覧             (系制、配制) */
  public static final int CstRyPrintKind6  = 6;  /**  発電支障一覧             (系制、配制) */
  public static final int CstRyPrintKind7  = 7;  /**  特高需要家停止実績一覧   (系制、配制) */
  public static final int CstRyPrintKind8  = 8;  /**  事故速報                 (系制、配制) */
  public static final int CstRyPrintKind9  = 9;  /**  事故前系統               (系制) */
  public static final int CstRyPrintKind10 = 10; /**  事故後系統              (系制) */
  public static final int CstRyPrintKind11 = 11; /**  自動通報（第１報）      (系制) */
  public static final int CstRyPrintKind12 = 12; /**  自動通報（第２報）      (系制) */
  public static final int CstRyPrintKind13 = 13; /**  自動通報（第３報）      (系制) */
  public static final int CstRyPrintKind14 = 14; /**  停電・復旧お客さま一覧  (配制) */
  public static final int CstRyPrintKind15 = 15; /**  事故操作手順表          (配制) */
  public static final int CstRyPrintKind16 = 16; /**  事故前電流情報          (配制) */
  public static final int CstRyPrintKind17 = 17; /**  事故停電配電線一覧      (系制) */

  /**  監視ステータス */
  public static final String CstRyStatusMishori = "未処理";
  public static final String CstRyStatusShorichuu = "処理中";
  public static final String CstRyStatusChuushichuu = "中止中";

  /**  要因 */
  public static final String CstRyFactor = "事故";

  /**  印刷対象 */
  public static final int CstRyPrintTagetFalse = 0; /**  対象外 */
  public static final int CstRyPrintTagetTrue = 1;  /**  対象 */

  public static final String[] CstRyPrintTarget = new String[]{"対象外",""};

  /**  オフラインＴＭバイアス値 */
  public static final String CstRyWinpry000070Bias = "0.1";
  public static final String CstRyWinpry100001Bias = "0.1";

  /**  件名追加処理結果 */
  public static final int CstRyNNoake = 0;        /** 通常表示 */
  public static final int CstRyNewMakeNormal = 1; /** 新規追加正常 */
  public static final int CstRyNewMakeErr = 2;    /** 新規追加エラー */
  public static final int CstRyNewMakeCancel = 3; /** 新規追加キャンセル */

  /**  系統図 */
  public static final int CstRynTblRmPictureBef = 1; /** 事故前系統図 */
  public static final int CstRynTblRmPictureAft = 2; /** 事故後系統図 */
  public static final int CstRynTblRmPictureAll = 3; /** 系統総括図 */

  /**  零相電圧値異常 */
  public static final int CstRyZPhsVoltAbn = 0;   /** 正常値 */
  public static final int CstRyZPhsVoltAbnErr = 1;/** 異常値 */

  /**  零相電圧値 */
  public static final String CstRyZPhsVoltAbnErrStr = "E0.0";

  /**  管理状況 */
  public static final int CstRyManageSituation_Kanrichu = 0;  /**  管理中 */
  public static final int CstRyManageSituation_Kanriend =  1;  /**  管理終了 */

  public static final String[] CstRyManagemenSituationStr = new String[]{"管理中","管理終了"};

  /**  動作RY */
  public static final int CstRyOperateRYOCR    = 1;  /**  OCR */
  public static final int CstRyOperateRYDGR    = 2;  /**  DGR */
  public static final int CstRyOperateRYOCRDGR = 3;  /**  OCR・DGR */

  public static final String[] CstRyOperateStr = new String[]{"","ＯＣＲ","ＤＧＲ","ＯＣＲ\nＤＧＲ"};
  public static final String[] CstRyOperateStr2 = new String[]{"","ＯＣＲ","ＤＧＲ","ＯＣＲ・ＤＧＲ"};

  /**  配制事故件名一覧画面 トグルボタン種別 */
  public static final int CstRyToggleButton_Haiden = 0; /**  配電線自動復旧ボタン */
  public static final int CstRyToggleButton_Jyoui = 1;  /**  ６kV上位系統自動復旧ボタン */

  /**  配制事故件名一覧画面 トグルボタン表示名称 */
  public static final String CstRyToggleButton_Haiden_Yu = "配電線自動復旧\r\n有効";
  public static final String CstRyToggleButton_Haiden_Mu = "配電線自動復旧\r\n無効";
  public static final String CstRyToggleButton_Jyoui_Yu = "6KV上位系統\r\n自動復旧有効";
  public static final String CstRyToggleButton_Jyoui_Mu = "6KV上位系統\r\n自動復旧無効";

  /**  配制事故速報画面 */
  public static final String CstRyReason ="調査中";

  /** 送電復旧見通し状況リスト */
  public static final String[] CstRyResPrspctStn = new String[]{"未定","復旧見込","送電復旧完了"};

  /** 事故区分リスト */
  public static final String[] CstRyDivisionStr = new String[]{"重大事故","一般事故","系統情報","原子力情報","他社情報"};

  /**  配電線自動復旧・６kV上位系統自動復旧状態 */
  public static final int CstRyRestorationYu = 1; /**  有効 */
  public static final int CstRyRestorationMu = 0; /**  無効 */

  /**  FAX自動送信有無 */
  public static final int CstRyFaxAutoSendYu = 1;
  public static final int CstRyFaxAutoSendMu = 0;

  /**  配信状況一覧画面 トグルボタン表示名称 */
  public static final String CstRyToggleButton_Fax_Yu = "FAX自動送信有効";
  public static final String CstRyToggleButton_Fax_Mu = "FAX自動送信無効";
  /** Rev.i08 Add Start */
  /**  配信状況一覧画面 トグルボタン表示名称 */
  public static final String CstRyToggleButton_Xml_Yu = "XML送信ロック解除";
  public static final String CstRyToggleButton_Xml_Mu = "XML送信ロック";
  /**  XML送信ステータス */
  public static final int CstRyXmlModeSt_Mu = 3; /**  XML送信ロック */
  public static final int CstRyXmlModeSt_Yu = 4; /**  XML送信ロック解除 */
  /** Rev.i08 Add End */

  /**  融通先配電線 */
  public static final int CstRyFlxbDstnFeederLine0 = 0; /**  事故配電線 */
  public static final int CstRyFlxbDstnFeederLine1 = 1; /**  融通先配電線 */

  /**  状変検出段階 */
  public static final int CstRyStChgStage1 = 1; /** 第1段階 */
  public static final int CstRyStChgStage2 = 2; /** 第2段階 */
  public static final int CstRyStChgStage3 = 3; /** 第3段階 */
  public static final int CstRyStChgStage4 = 4; /** 最終状変 */

  /** Rev.i11 Mod Start */
  /** 6KV状変検出段階 */
  public static final String[] CstRyFdrLnTrblKindStr3 = new String[] { "","第1段階",
      "第2段階","第3段階", "最終状況"};

  /** 6KV事故種別 */
  public static final String[] CstRyFdrLnTrblKindStr4 = new String[] { "","電源",
      "バンク", "母線","地絡","欠相"};

  /** 停電 */
  public static final String CstRyHaidenteiden = "停電";

  /** 事故捜査器ロック区間 */
  public static final String CstRyHaidenkuukann = "事故捜査器ロック区間";

  /** 事故捜査器ロック区間　無 */
  public static final String CstRyHaidennasi = "無";

  /** 6KV手段種別 */
  public static final String[] CstRyFdrLnTrblKindStr5 = new String[] { "","","",
      "停電中", "送電","より送電","より母線送電"};

  /** 自動切替装置ロック中 */
  public static final String CstRyHaidenjidou = "自動切替装置ロック中";

  /** 微地絡リレーロック中 */
  public static final String CstRyHaidenrire = "微地絡リレーロック中";

  /** ＣＢ投入ロック中 */
  public static final String CstRyHaidentounyu = "投入ロック中";

  /** 空白 */
  public static final String CstRyHaidenkuuhaku = "";

  /** 配電線微地絡 */
  public static final String CstRyHaidenhaithi = "配電線微地絡";

  /** 母線地絡 */
  public static final String CstRyHaidenbothi = "母線地絡";

  /** ＴＲ地絡 */
  public static final String CstRyHaidenTRthi = "ＴＲ地絡";

  /** 欠相復帰 */
  public static final String CstRyHaidenfukae = "欠相復帰 ";

  /** 切 */
  public static final String CstRyHaidenkiri = "切";

  /** 停止後送電 */
  public static final String CstRyHaidenteisisou = "停止後送電";

  /** 欠相事故発生 */
  public static final String CstRyHaidenkessoujiko = "欠相事故発生";

  /** iBj 母線欠相 */
  public static final String CstRyHaideniBj = "iBj 母線欠相";
  /** Rev.i11 Mod End */
  /** Rev.i10 Mod Start */
  /** ２２KV状変検出段階 */
  public static final String[] CstRyFdrLnTrblKindStr1 = new String[] { "","第1段階",
      "第2段階", "最終状況"};

  /** 事故種別 */
  public static final String[] CstRyFdrLnTrblKindStr2 = new String[] { "","電源",
      "バンク", "母線","","", "配電線"};

  /** 事故発生 */
  public static final String CstRyHaidenjikohasei = "事故発生";

  /** 停止母線 */
  public static final String CstRyHaidenbosen = "停止母線";

  /** 停止配電線 */
  public static final String CstRyHaidentehai = "停止配電線";

  /** 送電配電線 */
  public static final String CstRyHaidensouhai = "送電配電線";

  /** 電圧未復旧 */
  public static final String CstRyHaidenmifukyu = "電圧未復旧";

  /** 電圧復旧 */
  public static final String CstRyHaidenfukyu = "電圧復旧";

  /** 動作Ry */
  public static final String CstRyHaidenry = "動作Ry";

  /** 動作CB */
  public static final String CstRyHaidencb = "動作CB";

  /** ２次電流未復帰 */
  public static final String CstRyHaidenmifuki = "２次電流未復帰";

  /** ２次電流復帰 */
  public static final String CstRyHaidenfuki = "２次電流復帰";

  /**  機器Ｎｏ */
  public static final String CstRyHaidenkikino = "機器Ｎｏ";

  /**  再送電なし */
  public static final String CstRyHaidensaisounasi = "再送電なし";

  /**  再送電成功 */
  public static final String CstRyHaidensaisouseikou = "再送電成功";

  /**  再送電不良 */
  public static final String CstRyHaidensaisoufuryou = "再送電不良";

  /** 対象バンク・母線 */
  public static final String CstRyHaidentaisyou = "対象バンク・母線";
  /** Rev.i10 Mod End */

  /**  配電線事故 */
  public static final String CstRyHaidenJiko = "配電線事故";

  /**  配電線事故 */
  public static final String CstRyHaidenJikoHassei = "配電線事故発生";

  /**  配電線事故種別 */
  /**  Rev.i44 MOD Start */
/**   public static final int CstRyFdrLnTrblKind1 = 1; //再送電成功事故 */
/**   public static final int CstRyFdrLnTrblKind2 = 2; //再送電不良事故 */
/**   public static final int CstRyFdrLnTrblKind3 = 3; //再々送電成功事故 */
/**   public static final int CstRyFdrLnTrblKind4 = 4; //再々送電不良事故 */
/**   public static final int CstRyFdrLnTrblKind5 = 5; //再事故再送電成功事故 */
/**   public static final int CstRyFdrLnTrblKind6 = 6; //再事故再送電不良事故 */
/**   public static final int CstRyFdrLnTrblKind7 = 7; //再送電不良（再送ぜず） */
/**   public static final int CstRyFdrLnTrblKind8 = 8; //再々送電不良 */
/**   public static final int CstRyFdrLnTrblKind9 = 9; //再々送電不良（再送ぜず） */
/**   public static final int CstRyFdrLnTrblKind10 = 10; //再事故発生 */
/**   public static final int CstRyFdrLnTrblKind11 = 11; //再事故再送電不良（再送ぜず） */
/**   public static final int CstRyFdrLnTrblKind12 = 12; //事故状況判定不可 */
/**   public static final int CstRyFdrLnTrblKind13 = 13; //投入ロック中 */
  public static final int CstRyFdrLnTrblKind1 = 1; /** 配電線事故 */
  public static final int CstRyFdrLnTrblKind2 = 2; /** 再送電成功事故 */
  public static final int CstRyFdrLnTrblKind3 = 3; /** 再送電不良事故 */
  public static final int CstRyFdrLnTrblKind4 = 4; /** 再々送電成功事故 */
  public static final int CstRyFdrLnTrblKind5 = 5; /** 再々送電不良事故 */
  public static final int CstRyFdrLnTrblKind6 = 6; /** 再事故再送電成功事故 */
  public static final int CstRyFdrLnTrblKind7 = 7; /** 再事故再送電不良事故 */
  public static final int CstRyFdrLnTrblKind8 = 8; /** 再送電不良（再送ぜず） */
  public static final int CstRyFdrLnTrblKind9 = 9; /** 再々送電不良 */
  public static final int CstRyFdrLnTrblKind10 = 10; /** 再々送電不良（再送ぜず） */
  public static final int CstRyFdrLnTrblKind11 = 11; /** 再事故発生 */
  public static final int CstRyFdrLnTrblKind12 = 12; /** 再事故再送電不良（再送ぜず） */
  public static final int CstRyFdrLnTrblKind13 = 13; /** 事故状況判定不可 */
  public static final int CstRyFdrLnTrblKind14 = 14; /** 投入ロック中 */
  public static final int CstRyFdrLnTrblKind15 = 15; /** 再閉路ロック中 */
  /**  Rev.i44 MOD End */

  /** Rev.i02 Mod Start */
  /** public static final String[] CstRyFdrLnTrblKindStr = new String[] { "", */
  /**     "再送電成功事故", "再送電不良事故", "再々送電成功事故","再事故再送電成功事故", "再事故再送電不良事故", */
  /**     "再送電不良（再送ぜず）", "再々送電不良", "再々送電不良（再送ぜず）", "再事故発生", "再事故再送電不良（再送ぜず）", */
  /**     "事故状況判定不可", "投入ロック中", "再閉路ロック中" }; */
/**  Rev.i43 Mod Start */
/**   public static final String[] CstRyFdrLnTrblKindStr = new String[] { "", */
/**       "再送電成功事故", "再送電不良事故", "再々送電成功事故", "再々送電不良事故","再事故再送電成功事故", "再事故再送電不良事故", */
/**       "再送電不良（再送ぜず）", "再々送電不良", "再々送電不良（再送ぜず）", "再事故発生", "再事故再送電不良（再送ぜず）", */
/**       "事故状況判定不可", "投入ロック中", "再閉路ロック中" }; */
  public static final String[] CstRyFdrLnTrblKindStr = new String[] { "",
      "配電線事故","再送電成功事故", "再送電不良事故", "再々送電成功事故", "再々送電不良事故","再事故再送電成功事故", "再事故再送電不良事故",
      "再送電不良（再送ぜず）", "再々送電不良", "再々送電不良（再送ぜず）", "再事故発生", "再事故再送電不良（再送ぜず）",
      "事故状況判定不可", "投入ロック中", "再閉路ロック中" };
/**  Rev.i43 Mod End */
  /** Rev.i02 Mod End */

  /**  手順抑制フラグ */
  public static final int CstRyRestrPrcssDtrrnc_True = 1;

  /**  OK */
  public static final String CstRyOK = "ＯＫ";
  /**  NG */
  public static final String CstRyNG = "ＮＧ";

  /**  ユーザイベントID */
  /**  public static final int CstRyUsrEventXXXXXXXX = 9999; */

  /**  業務ＩＤ */
  public static final int CstRyFunctionID_Skelton      = 1000; /** スケルトン */
  public static final int CstRyFunctionID_Distribution = 2000; /** 配電線路図 */
  public static final int CstRyFunctionID_Trbl         = 7000; /** 事故対応 */

  /** ワークエリア連番 */
  /** Rev.i16 Mod Start */
/**   public static final int CstRyWorkIndex_ReFdrLine = 4600; // 配電線 */
  public static final int CstRyWorkIndex_ReFdrLine = 9000; /**  配電線 */
/**   public static final int CstRyWorkIndex_6kV       = 4800; // 6kV上位 */
  public static final int CstRyWorkIndex_6kV       = 9030; /**  6kV上位 */
/**   public static final int CstRyWorkIndex_22kV      = 5000; // 22kV */
  public static final int CstRyWorkIndex_22kV      = 9060; /**  22kV */
  /** Rev.i16 Mod End */
  public static final int CstRyWorkIndex_Keisei    = 600;  /**  系制 */
  /** Rev.i16 Mod Start */
/**   public static final int CstRyWorkIndex_ChildTableKey    = 1600; // 子テーブルキー */
  /** Rev.i34 Mod Start */
  /** public static final int CstRyWorkIndex_ChildTableKey    = 3000; // 子テーブルキー */
  public static final int CstRyWorkIndex_nTableIdx    = 3000; /**  子テーブルキー */
  /** Rev.i34 Mod End */
  /** Rev.i01 Add Start */
/**   public static final int CstRyWorkIndex_Haisei    = 4500; // 配制 */
  public static final int CstRyWorkIndex_Haisei    = 9000; /**  配制 */
  /** Rev.i16 Mod End */
  /** Rev.i01 Add End */
  /**  全て */
  public static final String CstRyAllZenkakuStr = "全て";

  /**  総合計 */
  public static final String CstRyTotalStr = "■総合計";

  /** レコード区分 */
  public static final int CstRyRecordClass_Total      = 1;   /**  総合計 */
  public static final int CstRyRecordClass_FeederLine = 2;   /**  配電線 */
  public static final int CstRyRecordClass_Section    = 3;   /**  区間 */
  public static final int CstRyRecordClass_Consumer   = 4;   /**  需要家 */

  /** 復旧表示 */
  public static final int CstRyRecoveryFlg_Bout        = 0;    /**  停電中 */
  public static final int CstRyRecoveryFlg_Restoration = 1;    /**  復旧済 */

  /** 事故状況 */
  public static final int CstRyTrblSituationBlackOut1 = 1;     /**  発生中（供給支障判定中) */
  public static final int CstRyTrblSituationBlackOut2 = 2;     /**  発生中（供給支障確定） */
  public static final int CstRyTrblSituationRestoration = 3;   /**  復旧済 */

  /** 区間フォーマット */
  public static final String CstRySectionNoFormat = "第%d区間";

  /** 需要家区分名称． */
  public static final String[] CstRyConsumersClsNameStr = new String[]{"","高圧一般", "高圧重要", "高圧分散", "低圧重要", "重要信号"};

  /** 信頼度区分 */
  public static final String[] CstRyReliabilityCls = new String[]{"", "一般", "重", "重", "重", "要注意", "苦情", "超重"};

  /**  機器名コンボボックスの選択肢 */
  public static final int CstRyFkClassIdxblank     = 0;    /**  ブランク */
  public static final int CstRyFkClassIdxCB        = 1;    /**  CB */
  public static final int CstRyFkClassIdxRY        = 2;    /**  リレー */
  public static final int CstRyFkClassIdxDMS       = 3;    /**  その他開閉器 */

  /**  機器名コンボボックスの選択肢 */
  public static final String[] CstRyFkClass = new String[]{"","ＣＢ","ＲＹ","その他開閉器"};

  /**  TM種類コンボボックスの選択肢 */
  public static final int CstRyEngineerUnitIdxblank  = 0; /**  ブランク */
  public static final int CstRyEngineerUnitIdxP = 1; /**  有効電力 */
  public static final int CstRyEngineerUnitIdxV = 2; /**  電圧 */
  public static final int CstRyEngineerUnitIdxI = 3; /**  電流 */
  public static final int CstRyEngineerUnitIdxWh = 4; /**  Ｗｈ */
  /**  TM種類コンボボックスの選択肢 */
  public static final String[] CstRyEngineeringUnits = new String[]{"","有効電力","電圧","電流","Ｗｈ"};

  /**  TM種別 */
  public static final int CstRyEngineerUnitP = 1;   /**  Ｐ値 */
  public static final int CstRyEngineerUnitV = 4;   /**  Ｖ値 */
  public static final int CstRyEngineerUnitI = 5;   /**  Ｉ値 */
  public static final int CstRyEngineerUnitWh = 9;  /**  配変ＷＨ−Ｌ（順潮流・逆潮流・順逆積算） */
  public static final int CstRyEngineerUnitPL = 10; /**  特高Ｐ（Ｌ） */
  public static final int CstRyEngineerUnitPG = 11; /**  特高Ｐ（Ｇ） */

  /**  終報フラグ */
  public static final int CstRyFinalRepFlagNormal = 0;
  public static final int CstRyFinalRepFlagFinal = 1;

  /**  テキストエリア文字数 */
  public static final int CstRyTextAreaTokki =9760;
  public static final int CstRyTextAreaTokki1 =360;

  /**  テーブル出力位置 */
  public static final int CstRyPositionLeft = 1;  /** 左テーブル */
  public static final int CstRyPositionCentr = 2; /** 中央テーブル */
  public static final int CstRyPositionRight = 3; /** 右テーブル */

  /**  調相設備種別 */
  public static final int CstRySC =1;   /** SC */
  public static final int CstRyShr =2;  /** ShR */

  /**  稼働状況 */
  public static final int CstRyOperatingException = 1;    /**  情報異常 */
  public static final int CstRyOperatingOperation = 2;    /**  作業中 */
  public static final int CstRyOperatingLiberation = 3;   /**  対応CB解放 */
  public static final int CstRyOperatingCharge = 4;       /**  対応CB投入 */

  /**  稼働状況異常 */
  public static final int CstRyOperatingflg0 = 0;    /**  切 */
  public static final int CstRyOperatingflg1 = 1;    /**  入 */

  /**  外部キー_クラス */
  public static final int CstRyFKClassSubstation = 2;          /**  電気所 */
  public static final int CstRyFKClassTransmissionLine = 3;    /**  送電線 */
  public static final int CstRyFKClass7 = 7;                   /**  */
  public static final int CstRyFKClassLine = 21;               /**  配電線 */
  public static final int CstRyFKClassCB = 23;                 /**  CB */
  public static final int CstRyFKClassDMeasurementStatus1 = 24;/**  その他開閉器 */
  public static final int CstRyFKClassDMeasurementStatus2 = 25;/**  その他開閉器 */
  public static final int CstRyFKClassRY = 29;                 /**  リレー */
  public static final int CstRyFKClassManagementOffice = 47;   /**  運用事象所 */

  /**  発電支障表示 */
  public static final int CstRyPGenHidFlag1 = 1;
  public static final int CstRyPGenHidFlag2 = 0;

  /**  被災状況 */
  public static final int CstRyDstrStnFalse = 1;
  public static final int CstRyDstrStnTrue = 2;
  public static final int CstRyDstrStnUnkwnoun = 3;

  /** 送電復旧見通し状況 */
  public static final int CstRyResPrspctStnMitei = 1;
  public static final int CstRyResPrspctStnStnMikomi = 2;
  public static final int CstRyResPrspctStnKanryo = 3;

  /**  十音検索かな */
  public static final String CstRyKaNaA = "あ";
  public static final String CstRyKaNaK = "か";
  public static final String CstRyKaNaS = "さ";
  public static final String CstRyKaNaT = "た";
  public static final String CstRyKaNaN = "な";
  public static final String CstRyKaNaH = "は";
  public static final String CstRyKaNaM = "ま";
  public static final String CstRyKaNaY = "や";
  public static final String CstRyKaNaR = "ら";
  public static final String CstRyKaNaW = "わ";
  public static final String CstRyKaNaZ = "全";
  public static final int CstRyCustomerKind = 1;  /**  需要家設定ダイアログ:1 */
  public static final int CstRyPowerGeneratorsKind = 2;  /**  発電機設定ダイアログ:2 */
  /**  テーブルボタン表示用 */
  public static final String CstRyAllPowerSysResName1 = "全変電所表示";

  /**  50音検索 */
  public static final String[] CstRyKana1 = new String[]{"あ","い","う","え","お","か","き","く","け","こ","さ","し","す","せ","そ",
                                                         "た","ち","つ","て","と","な","に","ぬ","ね","の","は","ひ","ふ","へ","ほ",
                                                         "ま","み","む","め","も","や","ゆ","よ","ら","り","る","れ","ろ","わ"};
  public static final String[] CstRyKana2 = new String[]{"ア","イ","ウ","エ","オ","カ","キ","ク","ケ","コ","サ","シ","ス","セ","ソ",
                                                         "タ","チ","ツ","テ","ト","ナ","ニ","ヌ","ネ","ノ","ハ","ヒ","フ","ヘ","ホ",
                                                         "マ","ミ","ム","メ","モ","ヤ","ユ","ヨ","ラ","リ","ル","レ","ロ","ワ"};
  public static final String[] CstRyKana3 = new String[]{"ｱ","ｲ","ｳ","ｴ","ｵ","ｶ","ｷ","ｸ","ｹ","ｺ","ｻ","ｼ","ｽ","ｾ","ｿ",
                                                         "ﾀ","ﾁ","ﾂ","ﾃ","ﾄ","ﾅ","ﾆ","ﾇ","ﾈ","ﾉ","ﾊ","ﾋ","ﾌ","ﾍ","ﾎ",
                                                         "ﾏ","ﾐ","ﾑ","ﾒ","ﾓ","ﾔ","ﾕ","ﾖ","ﾗ","ﾘ","ﾙ","ﾚ","ﾛ","ﾜ"};
  public static final String[] CstRyKana4 = new String[]{"ぁ","ぃ","ぅ","ぇ","ぉ","が","ぎ","ぐ","げ","ご","ざ","じ","ず","ぜ","ぞ","だ","ぢ","づ","で","ど","","","","","","ば","び","ぶ","べ","ぼ","","","","","","ゃ","ゅ","ょ","","","","","",""};
  public static final String[] CstRyKana5 = new String[]{"","","","","","","","","","","","","","","","","","っ","","","","","","","","ぱ","ぴ","ぷ","ぺ","ぽ","","","","","","","","","","","","","",""};
  public static final String[] CstRyKana6 = new String[]{"ァ","ィ","ゥ","ェ","ォ","ガ","ギ","グ","ゲ","ゴ","ザ","ジ","ズ","ゼ","ゾ","ダ","ヂ","ヅ","デ","ド","","","","","","バ","ビ","ブ","ベ","ボ","","","","","","ャ","ュ","ョ","","","","","",""};
  public static final String[] CstRyKana7 = new String[]{"","","","","","","","","","","","","","","","","","ッ","","","","","","","","パ","ピ","プ","ペ","ポ","","","","","","","","","","","","","","",};
  public static final String[] CstRyKana8 = new String[]{"ｧ","ｨ","ｩ","ｪ","ｫ","ｶﾞ","ｷﾞ","ｸﾞ","ｹﾞ","ｺﾞ","ｻﾞ","ｼﾞ","ｽﾞ","ｾﾞ","ｿﾞ","ﾀﾞ","ﾁﾞ","ﾂﾞ","ﾃﾞ","ﾄﾞ","","","","","","ﾊﾞ","ﾋﾞ","ﾌﾞ","ﾍﾞ","ﾎﾞ","","","","","","ｬ","ｭ","ｮ","","","","","",""};
  public static final String[] CstRyKana9 = new String[]{"","","","","","","","","","","","","","","","","","ｯ","","","","","","","","ﾊﾟ","ﾋﾟ","ﾌﾟ","ﾍﾟ","ﾎﾟ","","","","","","","","","","","","","",""};

  /** Rev.i17 Add Start */
  /** 50音検索 */
  public static final String[] CstRykana1 = new String[]{"ｱ","ｧ","あ","ぁ","ア","ァ"};
  public static final String[] CstRykana2 = new String[]{"ｲ","ｨ","ｳﾞ","ぃ","イ","ィ"};
  public static final String[] CstRykana3 = new String[]{"ｳ","ｩ","う","ぅ","ウ","ヴ","ゥ"};
  public static final String[] CstRykana4 = new String[]{"ｴ","ｪ","え","ぇ","エ","ェ"};
  public static final String[] CstRykana5 = new String[]{"ｵ","ｫ","お","ぉ","オ","ォ"};
  public static final String[] CstRykana6 = new String[]{"ｶ","ｶﾞ","か","が","カ","ガ"};
  public static final String[] CstRykana7 = new String[]{"ｷ","ｷﾞ","き","ぎ","キ","ギ"};
  public static final String[] CstRykana8 = new String[]{"ｸ","ｸﾞ","く","ぐ","ク","グ"};
  public static final String[] CstRykana9 = new String[]{"ｹ","ｹﾞ","け","げ","ケ","ゲ"};
  public static final String[] CstRykana10 = new String[]{"ｺ","ｺﾞ","こ","ご","コ","ゴ"};
  public static final String[] CstRykana11 = new String[]{"ｻ","ｻﾞ","さ","ざ","サ","ザ"};
  public static final String[] CstRykana12 = new String[]{"ｼ","ｼﾞ","し","じ","シ","ジ"};
  public static final String[] CstRykana13 = new String[]{"ｽ","ｽﾞ","す","ず","ス","ズ"};
  public static final String[] CstRykana14 = new String[]{"ｾ","ｾﾞ","せ","ぜ","セ","ゼ"};
  public static final String[] CstRykana15 = new String[]{"ｿ","ｿﾞ","そ","ぞ","ソ","ゾ"};
  public static final String[] CstRykana16 = new String[]{"ﾀ","ﾀﾞ","た","だ","タ","ダ"};
  public static final String[] CstRykana17 = new String[]{"ﾁ","ﾁﾞ","ち","ぢ","チ","ヂ"};
  public static final String[] CstRykana18 = new String[]{"ﾂ","ﾂﾞ","ｯ","つ","づ","っ","ツ","ヅ","ッ"};
  public static final String[] CstRykana19 = new String[]{"ﾃ","ﾃﾞ","て","で","テ","デ"};
  public static final String[] CstRykana20 = new String[]{"ﾄ","ﾄﾞ","と","ど","ト","ド"};
  public static final String[] CstRykana21 = new String[]{"ﾅ","な","ナ",};
  public static final String[] CstRykana22 = new String[]{"ﾆ","に","ニ"};
  public static final String[] CstRykana23 = new String[]{"ﾇ","ぬ","ヌ"};
  public static final String[] CstRykana24 = new String[]{"ﾈ","ね","ネ"};
  public static final String[] CstRykana25 = new String[]{"ﾉ","の","ノ"};
  public static final String[] CstRykana26 = new String[]{"ﾊ","ﾊﾞ","ﾊﾟ","は","ば","ぱ","ハ","バ","パ"};
  public static final String[] CstRykana27 = new String[]{"ﾋ","ﾋﾞ","ﾋﾟ","ひ","び","ぴ","ヒ","ビ","ピ"};
  public static final String[] CstRykana28 = new String[]{"ﾌ","ﾌﾞ","ﾌﾟ","ふ","ぶ","ぷ","フ","ブ","プ"};
  public static final String[] CstRykana29 = new String[]{"ﾍ","ﾍﾞ","ﾍﾟ","へ","べ","ぺ","ヘ","ベ","ペ"};
  public static final String[] CstRykana30= new String[]{"ﾎ","ﾎﾞ","ﾎﾟ","ほ","ぼ","ぽ","ホ","ボ","ポ"};
  public static final String[] CstRykana31 = new String[]{"ﾏ","ま","マ"};
  public static final String[] CstRykana32 = new String[]{"ﾐ","み","ミ"};
  public static final String[] CstRykana33 = new String[]{"ﾑ","む","ム"};
  public static final String[] CstRykana34 = new String[]{"ﾒ","め","メ"};
  public static final String[] CstRykana35 = new String[]{"ﾓ","も","モ"};
  public static final String[] CstRykana36 = new String[]{"ﾔ","ｬ","や","ゃ","ヤ","ャ"};
  public static final String[] CstRykana37 = new String[]{"ﾕ","ｭ","ゆ","ゅ","ユ","ュ"};
  public static final String[] CstRykana38 = new String[]{"ﾖ","ｮ","よ","ょ","ヨ","ョ"};
  public static final String[] CstRykana39 = new String[]{"ﾗ","ら","ラ"};
  public static final String[] CstRykana40 = new String[]{"ﾘ","り","リ"};
  public static final String[] CstRykana41 = new String[]{"ﾙ","る","ル"};
  public static final String[] CstRykana42 = new String[]{"ﾚ","れ","レ"};
  public static final String[] CstRykana43 = new String[]{"ﾛ","ろ","ロ"};
  public static final String[] CstRykana44 = new String[]{"ﾜ","わ","ワ"};
  public static final String[] CstRykana45 = new String[]{};
  /** Rev.i17 Add End */


  /**  10音検索 */
  public static final String[] CstRyKANA1 = new String[]{"ｱ","ｲ","ｳ","ｴ","ｵ","ｧ","ｨ","ｩ","ｪ","ｫ","ｳﾞ","あ","い","う","え","お","ぁ","ぃ","ぅ","ぇ","ぉ","ア","イ","ウ","エ","オ","ヴ","ァ","ィ","ゥ","ェ","ォ"};
  public static final String[] CstRyKANA2 = new String[]{"ｶ","ｷ","ｸ","ｹ","ｺ","ｶﾞ","ｷﾞ","ｸﾞ","ｹﾞ","ｺﾞ","か","き","く","け","こ","が","ぎ","ぐ","げ","ご","カ","キ","ク","ケ","コ","ガ","ギ","グ","ゲ","ゴ"};
  public static final String[] CstRyKANA3 = new String[]{"ｻ","ｼ","ｽ","ｾ","ｿ","ｻﾞ","ｼﾞ","ｽﾞ","ｾﾞ","ｿﾞ","さ","し","す","せ","そ","ざ","じ","ず","ぜ","ぞ","サ","シ","ス","セ","ソ","ザ","ジ","ズ","ゼ","ゾ"};
  public static final String[] CstRyKANA4 = new String[]{"ﾀ","ﾁ","ﾂ","ﾃ","ﾄ","ﾀﾞ","ﾁﾞ","ﾂﾞ","ﾃﾞ","ﾄﾞ","ｯ","た","ち","つ","て","と","だ","ぢ","づ","で","ど","っ","タ","チ","ツ","テ","ト","ダ","ヂ","ヅ","デ","ド","ッ"};
  public static final String[] CstRyKANA5 = new String[]{"ﾅ","ﾆ","ﾇ","ﾈ","ﾉ","な","に","ぬ","ね","の","ナ","ニ","ヌ","ネ","ノ"};
  public static final String[] CstRyKANA6 = new String[]{"ﾊ","ﾋ","ﾌ","ﾍ","ﾎ","ﾊﾞ","ﾋﾞ","ﾌﾞ","ﾍﾞ","ﾎﾞ","ﾊﾟ","ﾋﾟ","ﾌﾟ","ﾍﾟ","ﾎﾟ","は","ひ","ふ","へ","ほ","ば","び","ぶ","べ","ぼ","ぱ","ぴ","ぷ","ぺ","ぽ","ハ","ヒ","フ","ヘ","ホ","バ","ビ","ブ","ベ","ボ","パ","ピ","プ","ペ","ポ"};
  public static final String[] CstRyKANA7 = new String[]{"ﾏ","ﾐ","ﾑ","ﾒ","ﾓ","ま","み","む","め","も","マ","ミ","ム","メ","モ"};
  public static final String[] CstRyKANA8 = new String[]{"ﾔ","ﾕ","ﾖ","ｬ","ｭ","ｮ","や","ゆ","よ","ゃ","ゅ","ょ","ヤ","ユ","ヨ","ャ","ュ","ョ"};
  public static final String[] CstRyKANA9 = new String[]{"ﾗ","ﾘ","ﾙ","ﾚ","ﾛ","ら","り","る","れ","ろ","ラ","リ","ル","レ","ロ"};
  public static final String[] CstRyKANA10 = new String[]{"ﾜ","わ","ワ"};
  public static final String[] CstRyKANA11 = new String[]{};

  /** Rev.i05 Add Start */
  public static final String CstRyREGGREX_A    = "^[ｱｲｳｴｵｧｨｩｪｫｳﾞあいうえおぁぃぅぇぉアイウエオヴァィゥェォ].*";
  public static final String CstRyREGGREX_KA   = "^[ｶｷｸｹｺｶﾞｷﾞｸﾞｹﾞｺﾞかきくけこがぎぐげごカキクケコガギグゲゴ].*";
  public static final String CstRyREGGREX_SA   = "^[ｻｼｽｾｿｻﾞｼﾞｽﾞｾﾞｿﾞさしすせそざじずぜぞサシスセソザジズゼゾ].*";
  public static final String CstRyREGGREX_TA   = "^[ﾀﾁﾂﾃﾄﾀﾞﾁﾞﾂﾞﾃﾞﾄﾞｯたちつてとだぢづでどっタチツテトダヂヅデドッ].*";
  public static final String CstRyREGGREX_NA   = "^[ﾅﾆﾇﾈﾉなにぬねのナニヌネノ].*";
  public static final String CstRyREGGREX_HA   = "^[ﾊﾋﾌﾍﾎﾊﾞﾋﾞﾌﾞﾍﾞﾎﾞﾊﾟﾋﾟﾌﾟﾍﾟﾎﾟはひふへほばびぶべぼぱぴぷぺぽハヒフヘホバビブベボパピプペポ].*";
  public static final String CstRyREGGREX_MA   = "^[ﾏﾐﾑﾒﾓまみむめもマミムメモ].*";
  public static final String CstRyREGGREX_YA   = "^[ﾔﾕﾖｬｭｮやゐゆゑよゃゅょヤユヨャュョ].*";
  public static final String CstRyREGGREX_RA   = "^[ﾗﾘﾙﾚﾛらりるれろラリルレロ].*";
  public static final String CstRyREGGREX_WA   = "^[わをんワヲンﾜｦﾝ].*";
  /** Rev.i05 Add End */

  /** Rev.i08 Add Start */
  public static final String[] CstRyZEN_EIJI = new String[]{"Ａ","Ｂ","Ｃ","Ｄ","Ｅ","Ｆ","Ｇ","Ｈ","Ｉ","Ｊ","Ｋ","Ｌ","Ｍ","Ｎ","Ｏ",
      "Ｐ","Ｑ","Ｒ","Ｓ","Ｔ","Ｕ","Ｖ","Ｗ","Ｘ","Ｙ","Ｚ",
      "ａ","ｂ","ｃ","ｄ","ｅ","ｆ","ｇ","ｈ","ｉ","ｊ","ｋ","ｌ","ｍ","ｎ","ｏ","ｐ","ｑ","ｒ","ｓ","ｔ","ｕ","ｖ","ｗ","ｘ","ｙ","ｚ"};
  public static final String[] CstRyHAN_EIJI = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O",
      "P","Q","R","S","T","U","V","W","X","Y","Z",
      "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
  public static final String[] CstRyZEN_SUUJI = new String[]{"０","１","２","３","４","５","６","７","８","９"};
  public static final String[] CstRyHAN_SUUJI = new String[]{"0","1","2","3","4","5","6","7","8","9"};
  public static final String[] CstRyZEN_OTHER = new String[]{"　","ン","ヲ","，"};
  public static final String[] CstRyHAN_OTHER = new String[]{" ","ﾝ","ｦ",","};

  /** 事故区分リスト */
  public static final String[] CstRyDivision = new String[]{"重大事故速報","一般事故速報","系統情報","原子力情報","他社情報"};
  /**  SV/TM区分 */
  public static final int CstRySvTmKindNot = 0; /**  未定義 */
  public static final int CstRySvTmKindSv = 1;  /**  SV */
  public static final int CstRySvTmKindTm = 2;  /**  TM */
  public static final String[] CstRySvTmStr = new String[]{ "","SV","TM"};
  public static final String CstRyManagemenSituationEnd = "(件名終了)";
  /**  機器状態 */
  public static final String[] CstRyMachineStatusStr = new String[]{ "切","入"};

  public static final String[] CstRyReclosureSituation = new String[]{"","最終遮断","再閉路成功","再閉路最終遮断"};
  /** Rev.i28 Add Start */
  public static final String[] CstRyReclosureSituation1 = new String[]{"","再送電成功事故","再送電不良事故","再々送電成功事故","再々送電不良事故" ,"再事故再送電成功事故","再事故再送電不良事故"};
  /** Rev.i28 Add End */
  /** Poppry000284使用定数 */
  public static final String CstRySpaceZen2 = "　　";
  public static final String CstRySpaceZen3 = "　　　";
  public static final String CstRySpaceZen4 = "　　　　";
  public static final String CstRySpaceZen5 = "　　　　　";
  public static final String CstRyFinalRepStr = "終報";
  public static final String CstRyKunaichouStr = "官庁報告有";
  public static final String CstRyDaisanjyouStr = "省令第３条該当";
  public static final String CstRyMillionKWAOverSupHid = "１００万ｋＷ以上供給支障（都区内５０万ｋＷ）";
  public static final String CstRyGaitou = "該当";
  public static final String CstRyGoro = "頃";
  public static final String[] CstRyResPrspctStn1 = new String[]{"未定","送電復旧見込","送電復旧完了"};
  public static final String CstRySocietyEffectTitle = "社会的影響";
  public static final String CstRyMediaInqryNews = "マスコミ問い合わせ，報道";
  public static final String CstRyOtherImpact = "その他影響";
  public static final String CstRyContent = "内容：";
  public static final String CstRyNoZero = "０";
  public static final String CstRyNoSix = "６．";
  public static final String CstRyNoSeven = "７．";
  public static final String CstRyNoEight = "８．";
  public static final String CstRyNoNine = "９．";
  public static final String CstRyPlaceTitle = "事故箇所";
  public static final String CstRyTrblCauseTitle = "事故原因";
  public static final String CstRySpecialMentionTitle = "復旧状況・特記事項";
  public static final String CstRyKakko = "（";
  public static final String CstRyKakkotoji = "）";
  public static final String CstRygDstrStnTitle = "被害・被災状況：有";
  public static final String[] CstRygDstrStn = new String[]{"設備損壊","火災","爆発","冠水","倒壊","油流出事故","放射線事故","人身災害","地震","津波","台風","雷害","雪害","洪水","竜巻","突風","その他"};
  public static final String CstRyWeatherInforTitle = "発表中の気象情報：";
  public static final String CstRyInstntVltgDrpTitle = "瞬時電圧低下の発生：有";
  public static final String CstRygTrblJudgResTitle = "　【重大事故判定結果】\n";
  public static final String CstRyTensen = "　＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝\n";
  public static final String CstRyTrblJudgResStr1 = "　・超重要なお客さまが５分以上停電した場合\n　（お客さま都合により充電できない場合を含む）\n";
  public static final String CstRyTrblJudgResStr2 = "　・東京２３区において，変電所の ６kV 母線の停電\n　によりお客さまが停電した事故で停電時間が５分以\n　上の場合（ただし，配電塔は除く）\n";
  public static final String CstRyTrblJudgResStr3 = "　・東京２３区および横浜・川崎地区において，発変\n　電所の２２kV以上の母線停電によりお客さまが停電\n　した事故（ただし，配電塔は除く）\n"
                                                  + "　（再閉路成功，配変自切装置および再送電良好の場\n　合を含む。配電用変電所の１次側母線の停電は除く\n　。中間変電所および水力発電所の配電用変圧器の１\n"
                                                  + "　次側母線の停電は除く）\n";
  public static final String CstRyTrblJudgResStr4 = "　・地方重要地域（県庁所在地）に供給する発変電所\n　・開閉所６６kV以上の母線の停電によりお客さまが\n　停電した事故\n"
                                                  + "　（再閉路成功，配変自切装置および再送電良好の場\n　合を含む。配電用変電所の１次側母線の停電は除く\n　。中間変電所および水力発電所の配電用変圧器の１\n"
                                                  + "　次側母線の停電は除く）\n";
  public static final String CstRyTrblJudgResStr5 = "　・その他の地域において，発変電所・開閉所の１５\n　４kV以上の母線の停電によりお客さまが停電した事\n　故\n"
                                                  + "　（再閉路成功，配変自切装置および再送電良好の場\n　合を含む。配電用変電所の１次側母線の停電は除く\n　。中間変電所および水力発電所の配電用変圧器の１\n"
                                                  + "　次側母線の停電は除く）\n";
  public static final String CstRyTrblJudgResStr6 = "　・すべての地域において，供給支障電力が７万kW以\n　上の供給支障事故であって，その支障時間が１０分\n　以上の場合\n";
  public static final String CstRyTrblJudgResStr7 = "　・すべての地域において，供給支障電力が７千kW以\n　上７万kW未満の供給支障事故であって，その支障時\n　間が１時間以上の場合\n";
  public static final String CstRyTrblJudgResStr8 = "　・すべての地域において，１００万kW以上（東京２\n　３区内は５０万kW以上）の供給支障が発生した場合\n";
  public static final String CstRyTrblJudgResStr9 = "　・他社連系にかかわる設備事故の場合\n";
  /** Poppry000212使用定数 */
  public static final String CstRyBosenKousei1 = "複母線（６６ｋＶ−１次）";
  public static final String CstRyBosenKousei2 = "複母線（６６ｋＶ−２次）";
  public static final String CstRyBosenKousei3 = "複母線（１５４ｋＶ−１次）";
  public static final String CstRyBosenKousei4 = "複母線（１５４ｋＶ−２次）";
  public static final String CstRyBosenKousei5 = "複母線（２７５ｋＶ−１次）";
  public static final String CstRyBosenKousei6 = "複母線（２７５ｋＶ−２次）";
  public static final String CstRyBosenKousei7 = "ユニット母線（６６ｋＶ−１次）";
  public static final String CstRyBosenKousei8 = "ユニット母線（６６ｋＶ−２次）";
  public static final String CstRyBosenKousei9 = "ユニット母線（１５４ｋＶ−１次）";
  public static final String CstRyBosenKousei10 = "ユニット母線（１５４ｋＶ−２次）";
  public static final String CstRyBosenKousei11 = "ユニット母線（２７５ｋＶ−１次）";
  public static final String CstRyBosenKousei12 = "ユニット母線（２７５ｋＶ−２次）";
  public static final String CstRyBosenKousei13 = "ユニット母線１系統（６６ｋＶ−１次）";
  public static final String CstRyBosenKousei14 = "ユニット母線１系統（６６ｋＶ−２次）";
  public static final String CstRyBosenKousei15 = "ユニット母線１系統（１５４ｋＶ−１次）";
  public static final String CstRyBosenKousei16 = "ユニット母線１系統（１５４ｋＶ−２次）";
  public static final String CstRyBosenKousei17 = "ユニット母線１系統（２７５ｋＶ−１次）";
  public static final String CstRyBosenKousei18 = "ユニット母線１系統（２７５ｋＶ−２次）";
  public static final int[]  CstRyBosen= new int[]{1,2,3,4,5,6,11,12,13,14,15,16,21,22,23,24,25,26};
  /** Rev.i08 Add End */
  /** Rev.i08 Add Start */
  public static final int CstRyTextAreaTokki2 =100;
  /** Rev.i08 Add End */
  /**  メッセージNo (HMI) */
  public static final int CstRyMsg00001 =  1; /**  表示要求データが取得できません。 */
  public static final int CstRyMsg00002 =  2; /**  サーバ処理で異常が発生しました。 */
  public static final int CstRyMsg00003 =  3; /**  サーバへの要求がタイムアウトしました。 */
  public static final int CstRyMsg00004 =  4; /**  該当データが存在しません。 */
  public static final int CstRyMsg00005 =  5; /**  設定値が上限を超えています。 */
  public static final int CstRyMsg00006 =  6; /**  設定値が下限を超えています。 */
  public static final int CstRyMsg00007 =  7; /**  設定値が異常です。 */
  public static final int CstRyMsg00008 =  8; /**  発生時刻，復帰時刻に矛盾があります。 */
  public static final int CstRyMsg00009 =  9; /**  開始時刻，終了時刻に矛盾があります。 */
  public static final int CstRyMsg00010 = 10; /**  日付または時刻データが不正です。 */
  public static final int CstRyMsg00011 = 11; /**  設定データに不正値があり送信を中止しました。 */
  public static final int CstRyMsg00012 = 12; /**  送信結果が異常のため処理を中止しました。 */
  public static final int CstRyMsg00013 = 13; /**  ハードコピーのファイル転送に失敗しました。 */
  public static final int CstRyMsg00014 = 14; /**  半角カナもしくは特殊文字は登録できません。 */
  public static final int CstRyMsg00015 = 15; /**  最小，最大に矛盾があります。 */
  public static final int CstRyMsg00016 = 16; /**  要求したプリンタが応答しないため，印刷できません。 */
  public static final int CstRyMsg00017 = 17; /**  接続中サーバの常用系が切り替わりました。 */
  public static final int CstRyMsg00018 = 18; /**  要求画面は，ショートカット割り付け済みです。 */
  public static final int CstRyMsg00019 = 19; /**  要求画面は，現在のモードでは表示できません。 */
  public static final int CstRyMsg00020 = 20; /**  画面消去中のため，登録できません。 */
  public static final int CstRyMsg00021 = 21; /**  要求画面は，現在ショートカット登録できません。 */
  public static final int CstRyMsg00022 = 22; /**  カードが認証されていません。 */
  public static final int CstRyMsg00023 = 23; /**  認証中カードでは当該要求を実施する権限がありません。 */
  public static final int CstRyMsg00024 = 24; /**  制御権限がありません。 */
  public static final int CstRyMsg00025 = 25; /**  生体認証がタイムアウトしました。 */
  public static final int CstRyMsg00026 = 26; /**  データの書込で異常が発生しました。 */
  public static final int CstRyMsg00027 = 27; /**  データの読込で異常が発生しました。 */
  public static final int CstRyMsg00028 = 28; /**  修正中データを破棄しますがよろしいですか？ */
  public static final int CstRyMsg00029 = 29; /**  キー入力エラーです。 */
  public static final int CstRyMsg00030 = 30; /**  印刷開始要求を受け付けました。 */
  public static final int CstRyMsg00031 = 31; /**  印刷開始要求に失敗しました。 */
  public static final int CstRyMsg00032 = 32; /**  画像保存要求を受け付けました。 */
  public static final int CstRyMsg00033 = 33; /**  画像保存要求に失敗しました。 */
  public static final int CstRyMsg00034 = 34; /**  モニタリングが異常終了しました。 */
  public static final int CstRyMsg00035 = 35; /**  スケルトンの機器応動待ちのため，画面消去できません。 */
  public static final int CstRyMsg00036 = 36; /**  制御卓での画面表示を優先するため，画面を消去しました。 消去された画面の表示は，しばらく待ってから行って下さい。 */
  public static final int CstRyMsg00037 = 37; /**  表示要求した画面のリソースを確保できませんでした　他卓の画面を消去してから，再度表示要求を行って下さい。 */
  public static final int CstRyMsg00038 = 38; /**  業務実行中のため表示できません。 */
  public static final int CstRyMsg00039 = 39; /**  計算を開始しました。 */
  public static final int CstRyMsg00040 = 40; /**  計算が終了しました。 */
  public static final int CstRyMsg00041 = 41; /**  空きがないため登録できません。登録したい行を選択してから登録してください。 */
  public static final int CstRyMsg00042 = 42; /**  イントラへ送信要求しました。 */

  /**  メッセージNo (事故対応) */
  public static final int CstRyMsg07001 = 7001; /**  事故件名を削除しました。 */
  public static final int CstRyMsg07002 = 7002; /**  系統事故速報(イントラ)へ送信しました。 */
  public static final int CstRyMsg07003 = 7003; /**  自動通報(地中送電G)へ送信しました。 */
  public static final int CstRyMsg07004 = 7004; /**  事故速報をＦＡＸ送信しました。 */
  public static final int CstRyMsg07005 = 7005; /**  事故速報をメッセージ送信しました。 */
  public static final int CstRyMsg07006 = 7006; /**  系統事故速報(イントラ)を削除しました。 */
  public static final int CstRyMsg07007 = 7007; /**  同一事故件名が他卓にて編集中です。 */
  public static final int CstRyMsg07008 = 7008; /**  第４レベル以外の供給地域が選択されています。 */
  public static final int CstRyMsg07009 = 7009; /**  順位が未割当の行が選択されています。 */
  public static final int CstRyMsg07010 = 7010; /**  供給地域が下位レベルに割当られています。 */
  public static final int CstRyMsg07011 = 7011; /**  供給地域名が設定されていません。 */
  public static final int CstRyMsg07012 = 7012; /**  選択した供給地域の順位は最上位です。 */
  public static final int CstRyMsg07013 = 7013; /**  選択した供給地域の順位は最下位です。 */
  public static final int CstRyMsg07014 = 7014; /**  順位が未割当の行が上位レベルに選択されています。 */
  public static final int CstRyMsg07015 = 7015; /**  設定した供給地域は削除されました。 */
  public static final int CstRyMsg07016 = 7016; /**  選択したＴＭ内訳は計算式で使用しています。 */
  public static final int CstRyMsg07017 = 7017; /**  印刷対象が存在しません。 */
  public static final int CstRyMsg07018 = 7018; /**  削除対象が送信済ではありません。 */
  public static final int CstRyMsg07019 = 7019; /**  削除対象が配電用変圧器に設定されています。 */
  public static final int CstRyMsg07020 = 7020; /**  設定した供給地域名は変更されています。 */
  public static final int CstRyMsg07021 = 7021; /**  事故件名を追加しました。追加事故No.：ZZ9 */
  public static final int CstRyMsg07022 = 7022; /**  選択対象は送信できません。 */
  public static final int CstRyMsg07023 = 7023; /**  サーバへ配電線の事故トリップ管理設定要求をしました。 */
  public static final int CstRyMsg07024 = 7024; /**  サーバへ配電線の事故トリップ管理終了要求をしました。 */
  public static final int CstRyMsg07025 = 7025; /**  サーバへ再閉路RY自動ロック要求をしました。 */
  public static final int CstRyMsg07026 = 7026; /**  サーバへ再閉路RY自動ロック解除要求をしました。 */
  public static final int CstRyMsg07027 = 7027; /**  サーバへ停電情報ロック要求をしました。 */
  public static final int CstRyMsg07028 = 7028; /**  サーバへ停電情報ロック解除要求をしました。 */
  public static final int CstRyMsg07029 = 7029; /**  サーバへ現在電流値の更新要求をしました。 */
  public static final int CstRyMsg07030 = 7030; /**  サーバへ監視対象ステータス更新要求をしました。 */
  public static final int CstRyMsg07031 = 7031; /**  サーバへ負荷モデルの電流値情報の要求をしました。 */
  public static final int CstRyMsg07032 = 7032; /**  サーバへＦＡＸ自動送信切替の要求をしました。 */
  public static final int CstRyMsg07033 = 7033; /**  サーバへ配電線自動復旧切替の要求をしました。 */
  public static final int CstRyMsg07034 = 7034; /**  サーバへ６ｋV上位系統自動復旧切替の要求をしました。 */
  public static final int CstRyMsg07035 = 7035; /**  事故速報をテスト送信しました。 */
  public static final int CstRyMsg07036 = 7036; /**  事故速報が未作成です。 */
  public static final int CstRyMsg07037 = 7037; /**  サーバへ事故速報送信状況変更の要求をしました。 */
  public static final int CstRyMsg07038 = 7038; /**  停電ロック中のデータはありません。 */
  public static final int CstRyMsg07039 = 7039; /**  データが更新されました。画面を再表示してください。 */
  public static final int CstRyMsg07040 = 7040; /**  サーバへ印刷要求をしました。 */
  public static final int CstRyMsg07041 = 7041; /**  サーバへＣＳＶ出力要求をしました。 */
  public static final int CstRyMsg07042 = 7042; /**  サーバへ件名追加要求をしました。 */
  public static final int CstRyMsg07043 = 7043; /**  サーバへ件名削除要求をしました。 */
  public static final int CstRyMsg07044 = 7044; /**  サーバへ件名統合要求をしました。 */
  public static final int CstRyMsg07045 = 7045; /**  サーバへ事故情報編集通知をしました。 */
  public static final int CstRyMsg07046 = 7046; /**  サーバへ自動手順作成要求をしました。 */
  public static final int CstRyMsg07047 = 7047; /**  サーバへ事故後監視要求をしました。 */
  public static final int CstRyMsg07048 = 7048; /**  サーバへ模擬実行要求をしました。 */
  public static final int CstRyMsg07049 = 7049; /**  サーバへ本実行要求をしました。 */
  public static final int CstRyMsg07050 = 7050; /**  サーバへ系統初期表示要求をしました。 */
  public static final int CstRyMsg07051 = 7051; /**  表示している事故時操作手順の模擬実行は実行済です。 */
  public static final int CstRyMsg07052 = 7052; /**  {0}のデータ数が{1}件を超えています。{1}件までを表示します。 */
  /** Rev.i08 Add Start */
  public static final int CstRyMsg07053 = 7053; /**  直接入力されたデータのチェックが外れています。 */
  public static final int CstRyMsg07054 = 7054; /**  ダイアログで設定したデータに直接入力のチェックが付いています。 */
  public static final int CstRyMsg07063 = 7063; /**  事故速報をXML送信しました。 */
  public static final int CstRyMsg07064 = 7064; /**  サーバへＸＭＬ送信ロック切替の要求をしました。 */
  /** Rev.i08 Add End */

  /** MSG7052埋め込み文字 */
  public static final String CstRyWinpry000001MSG1         = "事故件名一覧";        /** 系制事故件名一覧 */
  public static final String CstRyWinpry000002MSG1         = "事故内容記録";        /** 系制事故状況一覧 */
  public static final String CstRyWinpry000002MSG2         = "事故設備";            /** 系制事故状況一覧 */
  public static final String CstRyWinpry000002MSG3         = "保安計器指示状況";    /** 系制事故状況一覧 */
  public static final String CstRyWinpry000041MSG1         = "事故件名一覧";        /** ６ｋＶ配電線事故状況 */
  public static final String CstRyWinpry000041MSG2         = "事故時操作手順";      /** ６ｋＶ配電線事故状況 */
  public static final String CstRyWinpry000041MSG3         = "事故前電流情報";      /** ６ｋＶ配電線事故状況 */
  public static final String CstRyWinpry000042MSG1         = "事故前電流";          /** ６ｋＶ上位系統事故状況 */
  /**  Rev.i08 Add Start */
  public static final String CstRyWinpry000057MSG1         = "末端事故後監視状況一覧";/** 末端事故後監視状況 */
  public static final String CstRyWinpry000059MSG1         = "マトリクス";          /** ６ｋV配電線事故判定マトリクス */
  public static final String CstRyWinpry000072MSG1         = "第１レベルテーブル";  /** 供給地域設定 */
  public static final String CstRyWinpry000072MSG2         = "第２レベルテーブル";  /** 供給地域設定 */
  public static final String CstRyPoppry000276MSG2         = "配変供給地域設定";    /** 配変供給地域設定ダイアログ */
  /**  Rev.i08 Add End */

  /**  共通確認ダイアログ */
  public static final String CstRySetDialogTitle         = "設定確認";        /**  設定確認ダイアログタイトル */
  public static final String CstRyPrintDialogTitle       = "印刷確認";        /**  印刷確認ダイアログタイトル */
  public static final String CstRyClearDelDialogTitle    = "データ破棄確認";  /**  データ破棄確認ダイアログタイトル */
  public static final String CstRyRunDialogTitle         = "実行確認";        /**  実行確認ダイアログタイトル */
  public static final String CstRySubjectDelDialogTitle  = "件名削除確認";    /**  件名削除確認ダイアログタイトル */
  public static final String CstRyClearDialogTitle       = "取消確認";        /**  取消確認ダイアログタイトル */
  public static final String CstRyDeleteDialogTitle      = "削除確認";        /**  削除確認ダイアログタイトル */
  public static final String CstRyClearCheckDialogTitle  = "クリア確認";      /**  クリア確認ダイアログ  // Rev.i21 Add */

  public static final String CstRySetDialogMessage         = "データを設定します。\nよろしいですか？";           /**  設定確認ダイアログメッセージ */
  public static final String CstRyPrintDialogMessage       = "データを印刷します。\nよろしいですか？";           /**  印刷確認ダイアログメッセージ */
  public static final String CstRyClearDelDialogMessage    = "編集中のデータを破棄します。\nよろしいですか？";   /**  データ破棄確認ダイアログメッセージ */
  public static final String CstRyRunDialogMessage         = "実行します。よろしいですか？";                     /**  実行確認ダイアログメッセージ */
  public static final String CstRySubjectDelDialogMessage  = "件名を削除します。\nよろしいですか？";               /**  件名削除確認ダイアログメッセージ */
  public static final String CstRyClearDialogMessage       = "設定を取り消します。\nよろしいですか？";           /**  取消確認ダイアログメッセージ */
  public static final String CstRyDeleteDialogMessage      = "削除します。\nよろしいですか？";                   /**  削除確認ダイアログメッセージ */
  public static final String CstRyClearCheckDialogMessage  = "編集データをクリアします。\nよろしいでしょうか？"; /**  クリア確認ダイアログメッセージ  // Rev.i21 Add */

  public static final String CstRyDialogbutton_YES = "はい";    /**  共通確認ダイアログ はい */
  public static final String CstRyDialogbutton_NO = "いいえ";   /**  共通確認ダイアログ いいえ */

  /** 印刷ダイアログ設定 */
  /** 用紙サイズ */
  public static final int CstRyPrintSizeDef = 0; /** HC設定 */
  public static final int CstRyPrintSizeA4  = 1; /** A4 */
  public static final int CstRyPrintSizeA3  = 2; /** A3 */
  /** 印刷方法 */
  public static final int CstRyPrintKindSingle  = 1; /** 片面 */
  public static final int CstRyPrintKindDuplex  = 2; /** 両面 */
  /** 割り付け */
  public static final int CstRyPrintSepEqual  = 1; /** 等倍 */
  public static final int CstRyPrintSepSplit  = 2; /** 分割 */
  /** 印刷カラー */
  public static final int CstRyPrintColorDef   = 0; /** HC設定 */
  public static final int CstRyPrintColorFull  = 1; /** カラー */
  public static final int CstRyPrintColorMono  = 2; /** モノクロ */

  /** 印刷ユーザーイベント */
  public static final String CstRyPrintRETN = "RETN";
  public static final String CstRyPrintSIZE = "SIZE";
  public static final String CstRyPrintKIND = "KIND";
  public static final String CstRyPrintSEP  = "SEP";
  public static final String CstRyPrintCOLR = "COLR";
  public static final String CstRyPrintNAME = "NAME";
  public static final String CstRyPrintCODE = "CODE";
  public static final String CstRyPrintPRNO = "PRNO";

  /** 画面種別 */
  public static final String CstRyLevel_A0 = "A0"; /** 系統総括図 */
  public static final String CstRyLevel_B0 = "B0"; /** 主要系統図 */
  public static final String CstRyLevel_C0 = "C0"; /** 部分系統図 */
  public static final String CstRyLevel_D0 = "D0"; /** 単線結線図 */
  public static final String CstRyLevel_E0 = "E0"; /** 22kV系統図 */
  public static final String CstRyLevel_F0 = "F0"; /** LNG系統図 */
  public static final String CstRyLevel_G0 = "G0"; /** 水系総括図 */
  public static final String CstRyLevel_H0 = "H0"; /** 水系図 */
  public static final String CstRyLevel_I0 = "I0"; /** 総監盤 */
  public static final String CstRyLevel_J0 = "J0"; /** 電力潮流図 */

  /** 画面モニタ種別 */
  public static final String CstRyMonitorKind_LEFT   = "1"; /** 左 */
  public static final String CstRyMonitorKind_CENTER = "2"; /** 中央 */
  public static final String CstRyMonitorKind_RIGHT  = "3"; /** 右 */

  /** 画面待ち時間 */
  public static final int CstRyShowSleepTime = 3000;

/**  Rev.i33 Add Start */
  /**  マンマシンNo */
  public static final int CstRyMMNumber352 = 352; /** 352：メッセージＮｏ */
/**  Rev.i33 Add End */
/**  Rev.i41 Add Start */
  public static final int CstRyMMNumber346 = 346; /** 346：事故判定マトリクス設定変更時、事故関連ポジション変更時、事故設備判定処理状態設定変更時 */
/**  Rev.i41 Add End */
/**  Rev.i37 Add Start */
  /**  ダイアログの呼び出しモード */
  public static final int CstRyDialogModeReadOnly = 0;  /**  読み込みのみ */
  public static final int CstRyDialogModeEditCondition = 1; /**  編集条件の編集 */
  public static final int CstRyDialogModeEditStatus = 2;  /**  編集状態の変更 */
/**  Rev.i37 Add End */

/**  ############################################################################# */
/**  以下、参考エリアのため、これより前に追加してください。 */
/**  ############################################################################# */
/** 【参考　Ｇ中給】 */
  /**  グラフのデータ線の太さ */
  public static final int Graph_DataLineSize = 1;
  /**  発電支障量単位調整 */
  public static final double CstRyMWCntrol = 0.1;
  /**  事故件名一覧 事故種別 */
  public static final int CstRyTroubleKindMax = 6;
  public static final String[] CstRyTroubleKindStr = new String[]{" ", "瞬時事故", "永久事故", "過負荷", "系統異常", "その他事故"};
  public static final int[] CstRyTroubleKindCmb = new int[]{ -1, 2, 3, 4, 1, 5, 0 };
  /**  事故件名一覧 件名状態 */
  public static final int CstRySubjectStatusMax = 4;
  public static final String[] CstRySubjectStatusStr = new String[]{" ", "判定中", "確定事故", "復旧済"};
/**   public static final Color[] CstRySubjectStatusClr = new Color[]{AColor.cyan, AColor.ORG_YELLOW2, AColor.ORG_LIGHTWHITE, AColor.ORG_GREEN2 }; */
  public static final int[] CstRySubjectStatusCmb = new int[]{ -1, 3, 2, 1 };
  /**  事故件名一覧 送信状況 */
  public static final int CstRySubjectSendStsMax = 5;
  public static final String[] CstRySubjectSendStsStr = new String[]{"未送信", "送信中", "送信済", "送信失敗", "送信済（更新有）"};
  public static final int[] CstRySubjectSendStsCmb = new int[]{ -1, 2, 4, 3, 0, 1 };
  /**  事故件名一覧 件名保護 */
  public static final int CstRySubjectProtectMax = 2;
  public static final String[] CstRySubjectProtectStr = new String[]{"  ", "■"};
  public static final int[] CstRySubjectProtectCmb = new int[]{ -1, 1, 0 };
  /**  事故件名一覧 記録託送への自動送信 */
  public static final int CstRyAutoSendMax = 2;
  public static final String[] CstRyAutoSendStr = new String[]{"ロック", "使用"};
  public static final int CstRyAutoSendUse  = 1;    /**  使用 */
  public static final int CstRyAutoSendLock = 0;    /**  ロック */
  /**  事故件名一覧 事故件名 */
  public static final int CstRy0001OneRowStrByteMax = 40;  /**  １行当たりの文字最大バイト数 */

  /**  事故状変記録 行種別 */
  public static final int CstRySummaryRowTypeMax    = 3;
  public static final int CstRySummaryRowTypeInit   = 0;   /**  初期値 */
  public static final int CstRySummaryRowTypeName   = 1;   /**  名称有 */
  public static final int CstRySummaryRowTypeEvent  = 2;   /**  事象のみ */

  /**  事故状変記録 テーブルMax */
  public static final int CstRyStatchgRecordMax     = 3000;    /**  最大行数 */
  public static final int CstRyStatchgRecordPMax    = 1000;    /**  ページ単位の最大行数 */
  /**  事故状変記録 行種別 */
  public static final int CstRyStatchgRowTypeMax    = 3;
  public static final int CstRyStatchgRowTypeInit   = 0;   /**  初期値 */
  public static final int CstRyStatchgRowTypeName   = 1;   /**  名称有 */
  public static final int CstRyStatchgRowTypeEvent  = 2;   /**  事象のみ */
  /**  事故状変記録 色種別 */
  public static final int CstRyStatchgColorMax = 4;
/**   public static final Color[] CstRyStatchgColor = new Color[]{AColor.ORG_LIGHTWHITE, AColor.ORG_BENIAKA, AColor.ORG_YELLOW2, AColor.ORG_GREEN2 }; */
  /**  事故状変記録 ページ最大値 */
  public static final int CstRyStatchgPageMAX = 3;

  /**  事故速報送信履歴 テーブルMax */
  public static final int CstRySendHistoryRecordMax = 1000;    /**  最大行数 */
  /**  事故速報送信履歴 送信結果 */
  public static final int CstRySendHistoryResultMax = 3;
  public static final String[] CstRySendHistoryResultStr = new String[]{"  ", "成功", "失敗"};
/**   public static final Color[] CstRySendHistoryResultClr = new Color[]{AColor.cyan, AColor.ORG_LIGHTWHITE, AColor.ORG_BENIAKA }; */
  /**  事故速報送信履歴 送信区分 */
  public static final int CstRySubjectSendDivMax = 3;
  public static final String[] CstRySubjectSendDivStr = new String[]{"  ", "自動", "手動"};
  /**  事故速報送信履歴 事故件名 */
  public static final int CstRy0005OneRowStrByteMax = 42;      /**  １行当たりの文字最大バイト数 */

  /**  ユーザイベントID */
  public static final int CstRyUsrEventUpdPicRy0001 = 1001;    /**  事故件名一覧画面       表示更新通知 */
  public static final int CstRyUsrEventUpdPicRy0002 = 1002;    /**  事故概要画面           表示更新通知 */
  public static final int CstRyUsrEventUpdPicRy0003 = 1003;    /**  事故前後全体系統図画面 表示更新通知 */
  public static final int CstRyUsrEventUpdPicRy0004 = 1004;    /**  事故状変編集画面       表示更新通知 */
  public static final int CstRyUsrEventUpdPicRy0005 = 1005;    /**  事故速報送信履歴画面   表示更新通知 */

  /**  クラス番号 */
  public static final int CstRyClassNoLine    = 3;  /**  送電線 */
  public static final int CstRyClassNoBus     = 6;  /**  母線 */
  public static final int CstRyClassNoTr      = 4;  /**  変圧器 */
  public static final int CstRyClassNoG       = 12; /**  発電機 */

  /**  メッセージNo */
  public static final int CstRyMsgTimeOut           =    3;   /**  サーバへの要求がタイムアウトしました。 */
  public static final int CstRyMsgSetValueNG        =    8;   /**  設定値が異常です。 */
  public static final int CstRyMsgSendResultNG      =   11;   /**  送信結果が異常のため処理を中断しました。 */
  public static final int CstRyMsgSetSearchTimeNG   = 3700;   /**  開始時刻，終了時刻に矛盾があります。 */
  public static final int CstRyMsgDeleteSubject     = 3701;   /**  事故件名を削除しました。 */
  public static final int CstRyMsgProtectSubject    = 3702;   /**  事故件名を保護しました。 */
  public static final int CstRyMsgUnProtectSubject  = 3703;   /**  事故件名の保護を解除しました。 */
  public static final int CstRyMsgSendReqExe        = 3704;   /**  記録託送システムへ送信要求しました。 */
  public static final int CstRyMsgChgStsRestore     = 3705;   /**  件名状態を「復旧済」にしました。 */

    /**
     * 事故後監視種別enum
     *
     * @author scsk-onodera
     *
     */
    public enum MonitoringKind {
      /** Rev.i08 Mod Start */
/**       /** 通常事故後監視 */ */
/**       KIND1(1), */
      /** Rev.i14 Mod Start */
      /** 事故後監視中止*/
      KIND1(1),
      /** Rev.i14 Mod End */
/**       /** 連係事故後監視 */ */
/**       KIND2(2), */
      /** Rev.i14 Mod Start */
      /** 事故後監視中断 */
      KIND2(2),
      /** Rev.i14 Mod End */
/**       /** 事故後監視再開 */ */
/**       KIND3(3), */
      /** 通常事故後監視開始 */
      KIND5(5),
      /** 連係事故後監視開始 */
      KIND6(6),
      /** 事故後監視再開 */
      KIND7(7),
      /** Rev.i08 Mod End */
      /** Rev.i08 Add Start */
      /** 末端幹線事故後監視開始 */
      KIND8(8);
      /** Rev.i08 Add End */
        private final int code;

        private MonitoringKind(final int code) {
            this.code = code;
        }

        /**
         * コード値を取得します。
         * @return 事故後監視種別
         */
        public int getCode() {
            return this.code;
        }
    }

    /** Rev.i12 Add Start */

    /**  エラーメッセージ */
    public static final int CstRyMsg07060 = 7060; /**  {0}の編集項目に不正な値が存在します。 */


    /**  汎用 */
    public static final String CstRyMaru = "○";
    /** Rev.i24 ADD Start */
    public static final String CstRyNijyuMaru = "◎";
    /** Rev.i24 ADD End */



    /**  編集ステータス */
    public static final String[] CstRyEditStatusString =  {"運用中", "編集終了", "編集終了(差戻)", "編集終了(取消)", "審査申請中",
            "承認申請中", "承認済", "設備ＤＢ不一致", "設備ＤＢ不一致", "運用開始失敗",};

    /**  判定条件種別 */
    public static final String[] CstRyDetectTCKindString = {
               "CDT：200bps 配変",
               "CDT：1200bps 単母線配変",
               "CDT：1200bps 並列母線配変",
               "HLDC 単母線配変",
               "HLDC 並列母線配変",
               "配電塔TCP/IP接続",
               "CDT：200bps 中継装置経由",
               /** Rev.i18 Mod Start */
/**                "CDT：1200bps中継装置経由" */
               "CDT：1200bps単母線中継装置経由",
               "CDT：1200bps並列母線中継装置経由",
               "水力TC中継装置経由"
               /** Rev.i18 Mod End */
    };

    /**
     * 運用中
     */
    public static final int CstRyEditStatusUnderOperation = 0;
    /**
     * 編集終了
     */
    public static final int CstRyEditStatusEnded            = 1;
    /**
     * 編集終了(差戻)
     */
    public static final int CstRyEditStatusEndedRemand     = 2;
    /**
     * 編集終了(取消)
     */
    public static final int CstRyEditStatusEndedChancel    = 3;
    /**
     * 審査申請中
     */
    public static final int CstRyEditStatusApplicationPending  = 4;
    /**
     * 承認申請中
     */
    public static final int CstRyEditStatusApprovalPending      = 5;
    /**
     * 承認済
     */
    public static final int CstRyEditStatusApproved              = 6;
    /**
     * 設備ＤＢ不一致(審査申請中)
     */
    public static final int CstRyEditStatusDBDiscordanceAppli  = 7;
    /**
     * 設備ＤＢ不一致(承認申請中)
     */
    public static final int CstRyEditStatusDBDiscordanceAppro  = 8;
    /**
     * 運用開始失敗
     */
    public static final int CstRyEditStatusStartFailure  = 9;
/** Rev.i38 Add Start */
    /**
     * 新規登録編集時  ※プログラム内でのみ使用するパラメータ値
     */
    public static final int CstRyEditStatusNewEdit  = 99;
/** Rev.i38 Add Start */
    /**  審査承認状態 */
    /**
     * 審査依頼
     */
    public static final int CstRyAAStatusApplicationRequested  = 1;
    /**
     * 審査差戻
     */
    public static final int CstRyAAStatusApplicationRejected    = 2;
    /**
     * 承認依頼
     */
    public static final int CstRyAAStatusApprovalRequested    = 3;
    /**
     * 承認差し戻し
     */
    public static final int CstRyAAStatusApprovalRejected  = 4;
    /**
     * 承認
     */
    public static final int CstRyAAStatusApproved      = 5;
    /**
     * 承認取消
     */
    public static final int CstRyAAStatusApprovalChancel              = 6;
    /**
     * 依頼取消
     */
    public static final int CstRyAAStatusRequestCancel              = 9;
    /**  Rev.i21 Add S */
    /**
     * 運用開始
     */
    public static final int CstRyAAStatusOperationStart      = 4;
    /**
     * 設定変更
     */
    public static final int CstRyAAStatusConfigurationChange = 2;
    /**  Rev.i21 Add E */
/**  Rev.i41 Add Start */
        /**
     * 新規登録
     */
    public static final int CstRyAAStatusNewRegistration = 1;
        /**
     * 削除
     */
    public static final int CstRyAAStatusDelete = 3;
/**  Rev.i41 Add End */

    /**  動作ポジション種別 */
    /**  */
    /**
     * CB・LS
     */
    public static final int CstRyActionPositionKindCB = 1;
    /**
     * リレー
     */
    public static final int CstRyActionPositionKindRY = 2;
    /**
     * 母連
     */
    public static final int CstRyActionPositionKindBR = 3;
    /**
     * TM
     */
    public static final int CstRyActionPositionKindTM = 4;

    /**  動作状変有 */
    public static final String CstRyJyouhenAri     = "状変 有";
    /**  動作状変無 */
    public static final String CstRyJyouhenNashi     = "状変 無";
    /**  動作切状変有 */
    public static final String CstRyKiriJyouhenAri = "切状変 有";

    /** ONL状態 */
    /** 発生 */
    public static final String CstRyONLHassei     = "発生";
    /** 復帰 */
    public static final String CstRyONLFukki     = "復帰";
    /** 動作 */
    public static final String CstRyONLDousa     = "動作";

    public static final String CstRyDialogbutton_CANCEL = "キャンセル";   /**  共通確認ダイアログ キャンセル */

    /** Rev.i12 Add End */


/**  Rev.i23 ADD S */
    /**  音声警報鳴動装置設定画面 */
    /**  電気所設定 */
    public static final int CstRySetKindSS = 1;
    /**  バンク設定 */
    public static final int CstRySetKindPT = 2;
    /**  配線線設定 */
    public static final int CstRySetKindFL = 3;
/**  Rev.i23 ADD E */

/**  Rev.i39 Add Start */
    /**  必須未入力フラグ */
    public static final int CstRyRequiredNotEnteredFlagYes = 0;  /**  必須入力あり */
    public static final int CstRyRequiredNotEnteredFlagNo = 1;  /**  必須入力なし */
/**  Rev.i39 Add End */
/** Rev.i41 Add Start */
    /**  自動未作成フラグ */
    public static final int CstRyAutoNotCreatedFlagYes = 0;  /**  自動作成 */
    public static final int CstRyAutoNotCreatedFlagNo = 1;  /**  自動未作成 */
    /**  必須フラグ */
    public static final int CstRyRequiredFlagNo = 0;  /**  任意 */
    public static final int CstRyRequiredFlagYes = 1;  /**  必須 */
/** Rev.i41 Add End */
/** Rev.24.2.21 Add Start */
    /**
     * MAGIC NUMBER
     */
    /** Length of the string */
    /** length: 0 */
    public static final int CstRySizeZero = 0;
    /** length: 1 */
    public static final int CstRySize1 = 1;
    /** length: 2 */
    public static final int CstRySize2 = 2;
    /** length: 3 */
    public static final int CstRySize3 = 3;

    /** length: 8 */
    public static final int CstRySize8 = 8;
    /** length: 10 */
    public static final int CstRySize10 = 10;
    /** length: 15 */
    public static final int CstRySize15 = 15;
    /** length: 19 */
    public static final int CstRySize19 = 19;
    /** length: 20 */
    public static final int CstRySize20 = 20;
    /** length: 22 */
    public static final int CstRySize22 = 22;
    /** length: 190 */
    public static final int CstRySize190 = 190;
    /** length: 360 */
    public static final int CstRySize360 = 360;

    /** Date and Time */
    public static final long CstRyDate_Default = 0;
	public static final long CstRyTime_Default = 0;
    public static final int CstRyoLiveTimerInterval_10s = 10000;
    public static final int CstRyoLiveTimerInterval_3s = 3000;
    public static final float CstRyProcessTimeLogMilli = 1000000f;


    /** Sub request type */
    /** Initialize value */
    public static final int CstRySubReqKind0 = 0;
    /** Command execution */
    public static final int CstRySubReqKind_63_1 = 1;
    /** Actual execution interruption 43 */
    public static final int CstRySubReqKind_43_2 = 2;
    /** Actual execution interruption 63 */
    public static final int CstRySubReqKind_63_2 = 2;

    /** 検出段階出力対象種別 */
    public static final int CstRyDetectStageOutputKind1 = 1;
    public static final int CstRyDetectStageOutputKind3 = 3;
    public static final int CstRyDetectStageOutputKind4 = 4;
    public static final int CstRyDetectStageOutputKind7 = 7;
    public static final int CstRyDetectStageOutputKind8 = 8;
    public static final int CstRyDetectStageOutputKind9 = 9;
    public static final int CstRyDetectStageOutputKind10 = 10;
    public static final int CstRyDetectStageOutputKind11 = 11;
    public static final int CstRyDetectStageOutputKind12 = 12;
    public static final int CstRyDetectStageOutputKind13 = 13;
    public static final int CstRyDetectStageOutputKind16 = 16;
    public static final int CstRyDetectStageOutputKind17 = 17;
    public static final int CstRyDetectStageOutputKind19 = 19;
    public static final int CstRyDetectStageOutputKind20 = 20;
    public static final int CstRyDetectStageOutputKind21 = 21;

    /** 6kV upper system accident detection stage status */
    /** 0: Not set */
    public static final int CstRyUSDetectStageStatus0 = 0;
    /** 1: Accident occurred */
    public static final int CstRyUSDetectStageStatus1 = 1;
    /** 2: CB input is locked  */
    public static final int CstRyUSDetectStageStatus2 = 2;
    /** 3: No recovery */
    public static final int CstRyUSDetectStageStatus3 = 3;
    /** 4: With recovery */
    public static final int CstRyUSDetectStageStatus4 = 4;
    /** 5: Receiving wire switching power transmission */
    public static final int CstRyUSDetectStageStatus5 = 5;
    /** 6: Bus switching power transmission */
    public static final int CstRyUSDetectStageStatus6 = 6;
    /** 7: Power transmission other than bus switching */
    public static final int CstRyUSDetectStageStatus7 = 7;
    /** 8: Re-accident */
    public static final int CstRyUSDetectStageStatus8 = 8;
    /** 9: No re-accident re-transmissiont */
    public static final int CstRyUSDetectStageStatus9 = 9;
    /** 10: Re-accident re-transmission */
    public static final int CstRyUSDetectStageStatus10 = 10;
    /** 11: Distribution line fine ground fault */
    public static final int CstRyUSDetectStageStatus11 = 11;
    /** 12: Busbar ground fault */
    public static final int CstRyUSDetectStageStatus12 = 12;
    /** 13: Secondary cable ground fault */
    public static final int CstRyUSDetectStageStatus13 = 13;

    /** 
     * 22kV system accident detection stage status 
     */
    /** 0: Not set */
    public static final int CstRyDetectStageStatus0 = 0;
    /** 1: Accident occurred */
    public static final int CstRyDetectStageStatus1 = 1;
    /** 2: Voltage recovery */
    public static final int CstRyDetectStageStatus2 = 2;
    /** 3: Voltage unrecovered */
    public static final int CstRyDetectStageStatus3 = 3;
    /** 4: Secondary current recovery */
    public static final int CstRyDetectStageStatus4 = 4;
    /** 5: Secondary current not restored */
    public static final int CstRyDetectStageStatus5 = 5;
    /** 6: Successful re-transmission */
    public static final int CstRyDetectStageStatus6 = 6;
    /** 7: Poor re-transmission */
    public static final int CstRyDetectStageStatus7 = 7;
    /** 8: No re-transmission */
    public static final int CstRyDetectStageStatus8 = 8;

    /** Substring of toStringYMD function */
    /** 0: start index */
    public static final int CstRySubStrYMDStart = 0;
    /** 10: end index */
    public static final int CstRySubStrYMDEnd = 10;
	
    /** Substring of toStringHM function */
    /** 0: start index */
    public static final int CstRySubStrHMStart = 0;
    /** 5: end index */
    public static final int CstRySubStrHMEnd = 5;



    /** Substring of toStringYMDS function */
    /** 0: start index */
    public static final int CstRySubStrYMDSStart = 0;
    /** 10: end index */
    public static final int CstRySubStrYMDSEnd = 10;


    /** Initialization value of Transformer No*/
    public static final int CstRyTrblDivisioninit = 0;

    /** Flexible state */
    /** 0: No flexibility */
    public static final int CstRySectionYuzu_No = 0;
    /** 1: Flexible */
    public static final int CstRySectionYuzu_Yes = 1;

    /** 6kV distribution line accident detection stage status */
    /** 0: Not set */
    public static final int CstRyFLDetectStageStatus0 = 0;
    /** 1: Distribution line accident */
    public static final int CstRyFLDetectStageStatus1 = 1;
    /** 2: Successful re-transmission */
    public static final int CstRyFLDetectStageStatus2 = 2;
    /** 3: Poor re-transmission */
    public static final int CstRyFLDetectStageStatus3 = 3;
    /** 4: Successful power transmission again */
    public static final int CstRyFLDetectStageStatus4 = 4;
    /** 5: Power transmission failure again */
    public static final int CstRyFLDetectStageStatus5 = 5;
    /** 6: Successful re-accident re-transmission */
    public static final int CstRyFLDetectStageStatus6 = 6;
    /** 7: Re-accident re-transmission failure */
    public static final int CstRyFLDetectStageStatus7 = 7;
    /** 8: No re-transmission  */
    public static final int CstRyFLDetectStageStatus8 = 8;

    /** 0: Section 0 status No */
    public static final int CstRySection0FdrSts = 0;

    /** Comma character */
    public static final char CstRyCommaChar = ',';



    /** Status */
    /** 0: None */
    public static final int CstRySituation_No = 0;


    /** Category NO */
    /** Category NO1 0 */
    public static final int CstRyKubun1_0 = 0;

    /** Category NO2 (6kV distribution line accident situation) */
    /** Machine No 352 */
    public static final int CstRyKubun2_352_6kV = 1;
    /** Machine No 346 */
    public static final int CstRyKubun2_346_6kV = 1;
    /** Machine No 347 */
    public static final int CstRyKubun2_347_6kV = 1;

    /** Category NO2 ( 6kV upper system accident judgment matrix) */
    /** Machine No 346 */
    public static final int CstRyKubun2_346_Over6kV = 2;
    /** Machine No 346 */
    public static final int CstRyKubun2_347_Over6kV = 2;
    /** Machine No 346 */
    public static final int CstRyKubun2_352_Over6kV = 2;

    /** Category NO2 (22kV system accident judgment matrix) */
    /** Machine No 346 */
    public static final int CstRyKubun2_346_22kV = 3;
    /** Machine No 352 */
    public static final int CstRyKubun2_352_22kV = 4;

    /** Category NO2 (5: Accident equipment judgment processing status setting) */
	/** Machine No 352 */
    public static final int CstRyKubun2_352_SetAccJudgSts = 5;
    /** Machine No 346 */
    public static final int CstRyKubun2_346_SetAccJudgSts = 5  ;
    /** Category NO2 (6: preparation of accident report) */
    public static final int CstRyKubun2_352_JikoSokuho = 6;
    /** JikoSokuhoTokki */
    public static final int CstRyKubun2_352_JikoSokuhoTokki = 7;
    /** Fax */
    public static final int CstRyKubun2_352_Fax = 8;
    /** Current List */
    public static final int CstRyKubun2_352_CurrentList = 9;
    /** Set current */
    public static final int CstRyKubun2_352_SetCurrent = 10;
    /** Category NO2 (12: Offline TM setting) */
    public static final int CstRyKubun2_352_OffLineTM = 12;
    /** Offline TM calculator */
    public static final int CstRyKubun2_352_OffLineTMCal = 13;
    /** Category NO2 (16: Accident voice alarm ringing setting) */
    public static final int CstRyKubun2_352_SetVoiceAlarm = 16;
    /** Setting accident system information */
    public static final int CstRyKubun2_352_SetAccSysInfo = 17;
    /** Category NO2 (19: Offline TM Juko) */
    public static final int CstRyKubun2_352_OffLineTM_Juyo = 19;
    /** Category NO2 (20: Offline TM Hatsu) */
    public static final int CstRyKubun2_352_OffLineTM_Hatsu = 20;
    /** Category NO2 (21: Distribution bank setting) */
    public static final int CstRyKubun2_352_OffLineTM_Bank = 21;

    /** Category NO3 (1: New registration) */
    public static final int CstRyKubun3_NewRegistration = 1;
    /** Category NO3 (2: Change settings) */
    public static final int CstRyKubun3_352_SetChange = 2;
    /** Category NO3 (3: Delete) */
    public static final int CstRyKubun3_352_Delete = 3;

    /** Category NO4 0 */
    public static final int CstRyKubun4_0 = 0;
    /** Category NO4 (1: 6kV distribution line) */
    public static final int CstRyKubun4_347_FdrLin = 1;

    /** Category NO5 0 */
    public static final int CstRyKubun5_0 = 0;
    /** Category NO5 (1: No.) */
    public static final int CstRyKubun5_No = 1;

    /** Identifier type 0 */
    public static final int CstRyPKKind_0 = 0;
    /** Identifier type (1: SV key / equipment key) */
    public static final int CstRyPKKind_SVKey = 1;
    /** Identifier type (3: Electric station key) */
    public static final int CstRyPKKind_Substation = 3;



    /** Identifier 1 (0: Zero) */
    public static final int CstRyFKMessage1_0 = 0;
    /** Numerical information (0: Zero) */
    public static final int CstRyValue_0 = 0;


    /** Length of string */
    /** 1: Size 1 */
    public static final int CstRyNewLineWordSize1 = 1;
    /** 3: Size 3 */
    public static final int CstRyNewLineWordSize3 = 3;
    /** 4: Size 4 */
    public static final int CstRyNewLineWordSize4 = 4;
    /** 8: Size 8 */
    public static final int CstRyNewLineWordSize8 = 8;
    /** 12: Size 12 */
/**     public static final int CstRyNewLineWordSize12 = 12; */
    /** 13: Size 13 */
    public static final int CstRyNewLineWordSize13 = 13;
    /** 15: Size 15 */
    public static final int CstRyNewLineWordSize15 = 15;
    /** 15: Size 15 */
    public static final int CstRyNewLineWordSize19 = 19;
    /** 20: Size 20 */
    public static final int CstRyNewLineWordSize20 = 20;



    /** Second limit split */
    public static final int CstRySplitLimit2 = 2;

    /** Message display reset */
    public static final int CstRyMsgNo = 0;

    
    /** Bus type */
    /** 1: Single bus */
    public static final int CstRyBSType_Single = 1;
    /** 2: Parallel bus */
    public static final int CstRyBSType_Parallel = 2;

    /** Digits's maximum number is 30 */
    public static final int CstRyMaxWordLength30 = 30;

    /**  
     * Accident detection TC type 
     */
    /** 1: CDT200bps */
    public static final int CstRyTCKind_CDT200 = 1;
    /** 2: CDT1200bps */
    public static final int CstRyTCKind_CDT1200 = 2;
    /** 3: HDLC */
    public static final int CstRyTCKind_HDLC = 3;
    /** 4: Distribution tower TCP/IP */
    public static final int CstRyTCKind_DstTwrTCP = 4;
    /** 5: Via relay device (CDT200bps) */
    public static final int CstRyTCKind_CDT200VR = 5;
    /** 6: Via relay device (CDT1200bps) */
    public static final int CstRyTCKind_CDT1200VR = 6;
    /** 8: Via relay device (hydraulic TC) */
    public static final int CstRyTCKind_HydPwrvR = 8;


    /** First element in the array */
/**     public static final int CstRyElementFirst = 0; */

    /**
     * Equipment type (accident equipment or accident candidate equipment)
     */
    /** 0: Init */
    public static final int CstRyEquipmentKindInit = 0;
    /** 1: Accident equipment */
    public static final int CstRyEquipment_Acident = 1;
    /** 2: Accident candidate equipment */
    public static final int CstRyEquipment_AccCandiEquip = 2;


    /** FK_BusbarSection (0: None) */
    public static final int CstRyFKBusBarSection_No = 0;

    /** 
     * Bank, bus maximum Ry 
     */
    /** Display up to 10 operation Ry */
    public static final int CstRyOperateRYDispMax10 = 10;
    /** Display up to 30 operation Ry */
    public static final int CstRyOperateRYDispMax30 = 30;

    /** 
     * Bank, bus maximum CB 
     */
    /** Display up to 20 operation CB */
/**     public static final int CstRySaidaiCB20 = 20; */


    /** Convert time */
    public static final int CstRyConvertTime = 60;
    /** 60 Minutes */
/**     public static final int CstRySixtyMinutes = 60; */
    /** 60 seconds */
/**     public static final int CstRySixtySecond = 60; */


    /** Accident classification */
    public static final int CstRyTrblDivision_Zero = 0;
    public static final int CstRyTrblDivision6 = 6;

    /**
     * Damage situation (others) 
     */
    /** 0: False */
    public static final int CstRyDstrStnOther_False = 0;
    /** 1: True */
    public static final int CstRyDstrStnOther_True = 1;

    /**
     * System batch send lock status
     */
    /** 1: Send lock  */
    public static final int CstRyIkatuStatus_SendLock = 1;
    /** 0: No send lock */
    public static final int CstRyIkatuStatus_NoSendLock = 0;

    /** Displaying substation name list (0: zero index) */
/**     public static final int CstRyAddFKMemOfLst_Zero = 0; */


    /** Latest status of post-accident monitoring (0: None) */
    public static final int CstRyAftTrblMntrgLtstStat0 = 0;

    /** Set the zero value */
    public static final int CstRyClearValue = 0;

    /** Man Machine NO (347: Man Machine NO) */
    public static final int CstRyMMNumber347 = 347;

    /** Matrix information registration update judgment flag (0: Not registered) */
/**     public static final int CstRyMatrixProcFlag_False = 0; */


    /** The primary key of position edit data is 0 */
    public static final int CstRyTrblMatrixPosition_No = 0;


    /** Condition type */
    /** 1: Measured value condition */
    public static final int CstRy22TCK_Mes = 1;
    /** 2: UVR condition */
    public static final int CstRy22TCK_UVR = 2;
    /** 3: A method Ry condition */
    public static final int CstRy22TCK_Ary = 3;
    /** 4: CB condition */
    public static final int CstRy22TCK_CB = 4;
    /** 5: Device status condition */
    public static final int CstRy22TCK_McnCnd = 5;
    /** 6: Route CB name */
    public static final int CstRyTrblConditionKind_RouteCB = 6;

    /** Edit matrix information Record implementation flag */
    /** 1: True */
    public static final int CstRyDataEditImplFlag_True = 1;
    /** 2: Additional lines */
    public static final int CstRyDataEditImplFlag_Add = 2;

	

    /** Newly added row judgment item */
    /** 0: Existing data */
    public static final int CstRyAddRowJug_ExistData = 0;
    /** 1: Newly added */
    public static final int CstRyAddRowJug_NewData = 1;

    /** Adding a line */
    public static final int CstRyAddLineFlag_True = 1;

    /** Super important customer */
    public static final int CstRySImpRegistData = 2;

    /** The serious accident judgment result is the target */
    public static final int CstRySeriousJudgRes_True = 1;


    /** Interger number */
    public static final int CstRyMaxValueHour = 24;
    public static final int CstRyMaxValueMinute = 60;


    /** Equipment (PSR) */
    public static final int CstEquipmentPSR_No = 0;


    /** Editable map (1: True) */
    public static final int CstRyCanWriteMapTrue = 1;

    /** Status change behavior flag */
    /** 1: On */
    public static final int CstRyTrblMatrixStatON = 1;
    /** 0: Off */
    public static final int CstRyTrblMatrixStatOFF = 0;

    /** Start condition flag 1 */
    /** 1: True */
    public static final int CstRyStartConFlag1_True = 1;
    /** 0: False */
    public static final int CstRyStartConFlag1_False = 0;
    /** Start condition flag 2 */
    /** 1: True */
    public static final int CstRyStartConFlag2_True = 1;
    /** 0: False */
    public static final int CstRyStartConFlag2_False = 0;

    /** Not automatically created */
    public static final int CstRyAutoNotCreatedFlg_False = 1;


    /** Continuation flag (1: True) */
    public static final int CstRyContinueFlag_True = 1;


    /** The presence or absence of an opening parenthesis */
    /** 1: Yes */
    public static final int CstRyLeftBracket_Yes = 1;
    /** 0: None */
    public static final int CstRyLeftBracket_None = 0;

    /** The presence or absence of closing parenthesis */
    /** 1: Yes */
    public static final int CstRyRightBracket_Yes = 1;
    /** 0: None */
    public static final int CstRyRightBracket_None = 0;


    /** The measured value is ON */
    public static final int CstRyMeasurementValue_ON = 1;
    /** The measured value is OFF */
    public static final int CstRyMeasurementValue_OFF = 0;


    /** Status of PicInfo */
    public static final int CstRyOpeReqMngStatus4 = 4;
    public static final int CstRyOpeReqMngStatus5 = 5;
    public static final int CstRyOpeReqMngStatus7 = 7;
    public static final int CstRyOpeReqMngStatus8 = 8;


    /** PSR type at the time of parallel bus */
    public static final int CstRyBusSecPSRType_Default = 0;
    /** PSR type 2 of equipment location */
    public static final int CstRyEquPointPSRType2_Default = 0;
    /** PSR type 3 at the location of the equipment */
    public static final int CstRyEquPointPSRType3_Default = 0;


    /** Switch type OLS*/
    public static final int CstRySWType_OLS = 6;

    /** Request type 43 */
    public static final int CstRyReqKind43 = 43;
    /** Request type 63 */
    public static final int CstRyReqKind63 = 63;



    /** Print kind 0 */
    public static final int CstRyPrintKind0 = 0;

    /* CONSTANT OF STRING */

    /** Format time date */
    public static final String CstRyFormatYMDHm = "yyyy/MM/dd HH:mm";
    public static final String CstRyFormatYMDHms = "yyyy/MM/ddHH:mmss";
    public static final String CstRyFormatHm = "HH:mm";

    /** Milliseconds */
    public static final String CstRyMiliSecond = "ms";

    /** "MODI" */
    public static final String CstRyGPinfJsetDataKeyword_MODI = "MODI";
    /** "SSNO" */
    public static final String CstRyGPinfJsetDataKeyword_SSNO = "SSNO";
    /** "SSNM" */
    public static final String CstRyGPinfJsetDataKeyword_SSNM = "SSNM";
    /** "SYST " */
    public static final String CstRyGPinfJsetDataKeyword_SYST = "SYST";
    /** "GMNO" */
    public static final String CstRyGPinfJsetDataKeyword_GMNO = "GMNO";
    /** "GMN2" */
    public static final String CstRyGPinfJsetDataKeyword_GMN2 = "GMN2";
    /** "AREA" */
    public static final String CstRyGPinfJsetDataKeyword_AREA = "AREA";
    /** "CCNO"*/
    public static final String CstRyGPinfJsetDataKeyword_CCNO = "CCNO";
    /** "SSN3" */
    public static final String CstRyGPinfJsetDataKeyword_SSN3 = "SSN3";


    /** "%02d" */
    public static final String CstRyFormat02d = "%02d";
    /** "%03d" */
    public static final String CstRyFormat03d = "%03d";
    /** "%04d" */
    public static final String CstRyFormat04d = "%04d";
    /** "%08d" */
    public static final String CstRyFormat08d = "%08d";
    /** "%2s" */
    public static final String CstRyFormatSp2s = "%2s";


    /** 4 digital format */
    public static final String CstRyFormat4Digit = "0000";
    /** 2 digital format */
    public static final String CstRyFormat2Digit = "00";
    /** Ten thousand format */
    public static final String CstRyFormatTenThousand = "##,##0";
    /** Ten thousand not split format */
    public static final String CstRyFormatTenThousandNotSplit = "####0";
    /** Decimal format */
    public static final String CstRyDecimalFormat = "###0.0";
    /** HundredMillion format */
    public static final String CstRyFormatHundredMillion = "###,###,##0";
    /** Million format */
    public static final String CstRyFormatMillion = "#,###,##0";
    /** Comma3 zero format */
    public static final String CstRyComma3Zero = ",000";

    /** Hour Min */
    public static final String CstRyHourMinStr = "H時mm分";

    /** Number char */
    /** Number 0 */
    public static final char CstRyHanZeroChar = '0';
    /** Number 1 */
    public static final char CstRyHanOneChar = '1';
    /** Number 2 */
    public static final char CstRyHanTwoChar = '2';
    /** Number 3 */
    public static final char CstRyHanThreeChar = '3';
    /** Number 4 */
    public static final char CstRyHanFourChar = '4';
    /** Number 5 */
    public static final char CstRyHanFiveChar = '5';
    /** Number 6 */
    public static final char CstRyHanSixChar = '6';
    /** Number 7 */
    public static final char CstRyHanSevenChar = '7';
    /** Number 8 */
    public static final char CstRyHanEightChar = '8';
    /** Number 9 */
    public static final char CstRyHanNineChar = '9';

    /** Number string */
    /** Number 0 */
    public static final String CstRyZenZeroStr = "０";
    /** Number 1 */
    public static final String CstRyZenOneStr = "１";
    /** Number 2 */
    public static final String CstRyZenTwoStr = "２";
    /** Number 3 */
    public static final String CstRyZenThreeStr = "３";
    /** Number 4 */
    public static final String CstRyZenFourStr = "４";
    /** Number 5 */
    public static final String CstRyZenFiveStr = "５";
    /** Number 6 */
    public static final String CstRyZenSixStr = "６";
    /** Number 7 */
    public static final String CstRyZenSevenStr = "７";
    /** Number 8*/
    public static final String CstRyZenEightStr = "８";
    /** Number 9 */
    public static final String CstRyZenNineStr = "９";

    /** Time start */
    public static final String CstRyComboTimeStart = " 0:00";
    /** Time end */
    public static final String CstRyComboTimeEnd = "23:59";
    /** Start minute */
    public static final String CstRyStartSecondStr = "00";
    /** End minute */
    public static final String CstRyEndSecondStr = "59";



    public static final String CstRyHaidenari = "有";
	
	/** Check Approved */
    public static final String CstRyChekApproved = "1";

    /** Check Rejected */
    public static final String CstRyChekRejected = "2";

    /** Space 2*/
    public static final String CstRySpace2 = "  ";



    /** PNG format */
    public static final String CstRySuffixStr_PNG = "-000.png";


    /** Offline TM bias value */
    public static final String CstRyPoppry000249Bias = "0.1";
    public static final String CstRyWinpry000071Bias = "0.01";
    public static final String CstRyWinpry000044Bias = "0.1";

    /** Test */
    public static final String ExternalTest = "Poppau000202";
    public static final String InternalTest = "Poppau000201";

    /** Picture name */
    public static final String CstRyPoppau000203 = "Poppau000203";
    public static final String CstRyPoppau000204 = "Poppau000204";
    public static final String CstRyPoppau000205 = "Poppau000205";



    /** Close stand line */
    public static final String CstRyCRLF = "\r\n";

    /** Right bracket */
    public static final String CstRyRightBracketStr = ")";


    /** Receive key information string */
    public static final String CstRyRecvKey_Info = "INFO";



	/** Situation 0 */
	public static final int CstRySubjctLstSituation0 = 0;
	
	/** Voltage 6k */
	public static final String CstRyVoltage_6k = "7";
	/** Voltage 22k */
	public static final String CstRyVoltage_22k = "6";
	
	
	/** The employer TM information is none */
	public static final int CstRyUseFlg_None = 0;

	/** The employer TM information is 1 */
	public static final int CstRyUseFlg_RelayTM = 1;
	
	/** The employer TM information is 2 */
	public static final int CstRyUseFlg_TCKeiseiGW = 2;
	
	/** The employer TM information is 3 */
	public static final int CstRyUseFlg_TCHaiseiGW = 3;

	/** The employer TM information is 4 */
	public static final int CstRyUseFlg_MeasTM = 4;
	
	/** Initial value of set value at */
	/** 0: Edit */
	public static final int CstRySetValueAtInit_EditYes = 0;
	/** 1: No edit */
	public static final int CstRySetValueAtInit_EditNo = 1;
	
	/** Default 3 seconds */
	public static final int CstRyLimitTime3sec = 3;
	/** Default 30 seconds */
	public static final int CstRyLimitTime30sec = 30;
	
	
	/** The same screen is displayed */
	public static final int CstRyNext6kVSkeltonNo_Same = -1;
	
	/** Latest status of post-accident monitoring */
	/** 0: Initialization value*/
	public static final int CstRyAftStatus_Init = 0;

	/** Transformer Number */
	/** 0: No number */
	public static final int CstRyTransformerNo_NoNum = 0;

    /** Byte max of a row string */
    public static final int CstRy0049OneRowStrByteMax = 34;
	
    /** Haiden Mode ON */
    public static final int CstRyHaidenModeOn = 1;
	
    /** Haiden Mode OFF */
    public static final int CstRyHaidenModeOff = 0;
	
    /** Jyoui Mode ON */
    public static final int CstRyJyouiModeOn = 1;
	
    /** Jyoui Mode OFF */
    public static final int CstRyJyouiModeOff = 0;

	
/**  ############################################################################# */
/**  以下には、追加しないこと。 */
/**  ############################################################################# */

  /**
   * コンストラクタ.
   * <pre>
   * </pre>
   */
  public CstRyConst()
  {
  }
}

