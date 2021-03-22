/**
 * SCADA & DAS Systems Group
 * Power Control Computer Systems Department
 * Fuchu Operations-Energy Systems & Solutions
 *
 * Copyright(c) TOSHIBA CORPORATION Energy Systems &
 * Solutions Company 2017 All Rights Reserved.
 *
 * �ե�����̾��CstRyConst.java
 * �ѥå�����̾��jp.co.tmtd.fuchu.xp.dr.py
 *
 * �ѹ�����
 * �ʽ��Ǻ����ˡ����������ֹ桧XT52-000��
 *   �߷ס��� YYYY/MM/DD����ǧ��������Ĵ����������ô����
 *   ��¤���� YYYY/MM/DD����ǧ��������Ĵ����������ô����
 *   ñ�λ YYYY/MM/DD����ǧ��������Ĵ����������ô����
 *
 * ���������ֹ桧XT52-000
 *
 * Rev.i01������2018/02/28����ǧ��������Ĵ����������ô����(SCSK)������
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #172685
 *   �����̳�ǧ���������������˼�����ɽ�����õ����Զ�罤��������ɲá�
 *
 * Rev.i02������2018/03/01����ǧ��������Ĵ����������ô����(SCSK)������
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #176455
 *   �����������ξ������̤λ��ξ���������ʡˤǡֺơ��������ɻ��Ρפ����Ϥ���ʤ���
 *
 * Rev.i03����2018/3/02����ǧ��������Ĵ����������ô����(SCSK)����
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *    ���������ֹ� #176312
 *    ����ư�ϵ��¹��б�
 *
 * Rev.i04����2018/03/30����ǧ��������Ĵ����������ô����(SCSK)������
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #177000
 *   ��ͭ��������ɽ�������ʽ�λ���郎Max�ͤξ���
 *
 * Rev.i05������2018/04/04����ǧ��������Ĵ��������ô��(SCSK)���š�
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *    ���������ֹ� #168297
 *    ��������������������ֲ��̤�ñ�������ޤ�ɽ���б�
 *    �����֤β�������ѹ��ΰ١��־��ѵ�Ͽ�����Ž�ˡײ��̤�����б���̳���֤ǸƤӽФ���褦�˽���
 *
 * Rev.i06������2018/04/19����ǧ��������Ĵ����������ô����(SCSK)������
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #169696
 *   �����ɽ����������®�٤��٤��ٽ�������ǽ�к���
 *
 * Rev.i07������2018/4/23����ǧ��������Ĵ����������ô����(SCSK)������
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *    ���������ֹ� #188319
 *    ����ư�ϵ��¹��б��ʵ���PSR�ǤΥ�����ȥ�ɽ����
 *
 * Rev.i08������2018/5/11����ǧ��������Ĵ����������ô����(SCSK)������
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *    ���������ֹ� #XXXXXX
 *    �������Ʒ�ΰ�
 *
 * Rev.i09������2019/7/23����ǧ��������Ĵ����������ô����(SCSK)��¼
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *    ���������ֹ� ##244460
 *    ��SF��å����������б�
 *
 * Rev.i10������2019/8/05����ǧ��������Ĵ����������ô����(SCSK)�񡡹�
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *    ���������ֹ� ##245265
 *    ����̾���֤�����ʳ���ɽ��
 *
 * Rev.i11������2019/8/29����ǧ��������Ĵ����������ô����(SCSK)�񡡹�
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *    ���������ֹ� ##245265
 *    ����̾���֤�����ʳ���ɽ��
 *
 * Rev.i12������2019/9/26����ǧ��������Ĵ����������ô����(SCSK)����
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *    ���������ֹ�
 *    �������Ʒ��б�
 *
 * Rev.i13������2019/12/17����ǧ��������Ĵ����������ô����(SCSK)�񡡹�
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #XXXXXX
 *   ������־�̷������ξ�������
 *
 * Rev.i14������2019/12/17����ǧ��������Ĵ����������ô����(SCSK)���
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #XXXXXX
 *   ���ƻ��оݳ�ǧ���٥�ȷѾ����饹(�����ɲ�)
 *
 * Rev.i15������2020/1/6����ǧ��������Ĵ����������ô����(SCSK)����
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *    ���������ֹ�
 *    �������Ʒ��б�
 *
 * Rev.i16������2020/1/17����ǧ��������Ĵ����������ô����(SCSK)���
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *    ���������ֹ� #XXXXXX
 *    ���쥳���ɤκ������ѹ��б�
 *
 * Rev.i17������2020/01/23����ǧ��������Ĵ����������ô������
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #XXXXXX
 *   �����δ�Ϣ�ݥ�����������������
 *
 * Rev.i18������2020/01/28����ǧ��������Ĵ����������ô������
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #309487  �ѹ��ե���ɼ #309489
 *   �����������������Ƚ��ޥȥꥯ������
 *
 * Rev.i19������2020/01/23����ǧ��������Ĵ����������ô������¼
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #XXXXXX
 *   ���٤����������μ�ư���쵡ǽ��å�����
 *
 * Rev.i19������2020/02/04����ǧ��������Ĵ����������ô�����ݰ�
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #XXXXXX
 *   �����š����줪�Ҥ��ް��������������̡ʿ����ٶ�ʬ�ɲá�
 *
 * Rev.i21������2020/02/05����ǧ��������Ĵ����������ô��������
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #XXXXXX
 *   �����δ�Ϣ�ݥ���������
 *
 * Rev.i22������2020/02/05����ǧ��������Ĵ����������ô����(SCSK)ݯ��
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #XXXXXX
 *   ���ƣ���������̥�ݡ��Ȱ�������(ɽ������ɲ�)
 *
 * Rev.i23������2020/02/02����ǧ��������Ĵ����������ô��������
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #XXXXXX
 *   ���ѹ����ơ�ɽ�������ѹ���ȼ������
 *
 * Rev.i24������2020/02/10����ǧ��������Ĵ����������ô����(SCSK)��
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #XXXXXX
 *   �����������������Ƚ�������������������(���ɲ�)
 *
 * Rev.i25������2020/02/10����ǧ��������Ĵ����������ô����(SCSK)������
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *    ���������ֹ� #311207
 *    �������ѥХ󥯡ץܥ����ɲ�
 *
 * Rev.i26������2020/02/10����ǧ��������Ĵ����������ô����(SCSK)���
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #XXXXXX
 *   ���������б�
 *
 * Rev.i27������2020/02/19����ǧ��������Ĵ����������ô����(SCSK)�ݰ�
 *   �ѹ���ͳ�������������ֹ桧��
 *   ���������ֹ� #XXXXXX
 *   �����������Υȥ�åײ��̤β���ɽ���ǻ��Ѥ���ʸ������ɲ�
 *
 * Rev.i28������2020/02/21����ǧ��������Ĵ����������ô����(SCSK)ݯ��
 *   �ѹ���ͳ�������������ֹ桧��
 *   ���������ֹ� #311205
 *   ������ϩ������ʸ���ѹ��Τ��ὤ��
 *
 * Rev.i29������2020/03/24����ǧ��������Ĵ��������ô����(SCSK)��
 *   �ѹ���ͳ�������������ֹ桧��
 *    ���������ֹ� #XXXXXX
 *    �����������������֥ѥͥ���̤�Ϣ�Ȥ��뤿��
 *
 * Rev.i30������2020/03/24����ǧ��������Ĵ��������ô����(SCSK)���
 *   �ѹ���ͳ�������������ֹ桧��
 *    ���������ֹ� #318844
 *    �����������������֥ѥͥ����(Subpry000155)��Ϣ�Ȥ��뤿����б�
 *
 * Rev.i31������2020/04/03����ǧ��������Ĵ��������ô����(SCSK)��
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *    ���������ֹ� #318844  �ѹ��ե���ɼ#318858
 *    �����������������֥ѥͥ����(Subpry000154)��Ϣ�Ȥ��뤿����б�
 *
 * Rev.i32������2020/07/02����ǧ��������Ĵ����������ô����(�ᥤ��)��ƣ
 *   �ѹ���ͳ�������������ֹ桧��
 *   ���������ֹ� #
 *   �����׷�No268�ۼ¹Ժ����ꡢ�¹����ǡ�����¹ԡ���λ�γƥܥ���γ���������������ɲ�
 *   ����WT��ŦNo670�ۻ���¹ԥܥ��󲡲����˸�������׵�λ���¹Խ�����¹Ԥ���������ɲ�
 *                    ��λ�ܥ��󲡲����˸�������׵����λ������¹Ԥ���������ɲ�
 *   ���ڻ��ͷ���No129�ۥ��֤������ܤ������˥��֥ե�å�����ߤ�����ͤ��ɲ�
 *
 * Rev.i33������2020/07/27����ǧ��������Ĵ����������ô����(PS��)����
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #327372   �ѹ��ե���ɽ #327373
 *   ����WT��ŦNo709�ۻ��ξ������̤������������������Ͽ�б�
 *
 * Rev.i34    2020/07/29  ��ǧ��      Ĵ����    ô����(SCSK)��
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ�#328773  �ѹ��ե���ɼ#351624
 *     ��Ϣ�֥ơ��֥��ɳ�Ť����η�̾�����ơ��֥��TblReSubjectList��
 *     ����ƥå���������̾���ѹ�
 *
 * Rev.i35������2020/08/25����ǧ��������Ĵ����������ô����(PS��)����
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #327372   �ѹ��ե���ɽ #327373
 *   �����׷�No.277��22kV�������򡦤������������ξ��������߷������б�
 *
 *
 * Rev.i36������2020/09/7����ǧ��������Ĵ����������ô����(SCSK)��
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #355285
 *   ���ޥȥꥯ����Ϣ���̤��Զ������б�
 *
 * Rev.i37������2020/09/10����ǧ��������Ĵ����������ô����(PS��)����
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #355282
 *    ���׷�No.293
 *        ���ֽ���ɽ���׵�Υ��塼���ν������ɲ��б�
 *    ���׷�No.302
 *        ������ɽ�����ˤ���������å��ܥå�����ɽ�������ɲ�
 *
 * Rev.i38������2020/09/17����ǧ��������Ĵ����������ô����(�ᥤ��)��ƣ
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #357631
 *   ���Ʒ�No,309:������Ͽ�����ɲä�ȼ���������ɲùԥ���å����˥����������̤��Ϥ����֥ѥ�᡼�����ɲ�
 *
 * Rev.i39������2020/09/30����ǧ��������Ĵ����������ô����(PS��)����
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #355282
 *   ����¸�����б�
 *        ������������������ˤ������ɲ��б�
 *
 * Rev.i40    2020/09/30  ��ǧ��      Ĵ����    ô����(SCSK)ݯ��
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *    ���������ֹ� #363828  �ѹ��ե���ɼ#363829
 *    ���׷�No.364
 *    ������پ㻻���ѥ��ե饤��ԣ�������̡�ȯ�Żپ�ɽ���ѽ�̾�Ѵ�����ˤκ���ɽ������ν���
 *
 * Rev.i41������2020/10/12����ǧ��������Ĵ����������ô����(PS��)����
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #355282
 *   ����¸�����б�
 *        ������������������ˤ������ɲ��б�
 *
 * Rev.i42������2020/11/19����ǧ��������Ĵ����������ô����(SCSK)��߷
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ����¸�����б�
 *        �������η�̾�������̤�ɽ������ν���
 *
 * Rev.i43������2020/11/24����ǧ��������Ĵ����������ô����(PS��)����
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ����¸�����б�
 *        6kV���������ξ������̤λ��ξ���������ʡˤξ�����ɽ��ʸ������
 *
 * Rev.i44��������2020/12/11����ǧ��������Ĵ����������ô����(SCSK)ݯ��
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #367776  �ѹ��ե���ɼ#367777
 *   ��CstRyFdrLnTrblKindStr������������ѹ��˴�Ϣ������ʬ�ν���
 * 
 * Rev.i45��������2020/12/17����ǧ��������Ĵ����������ô����(PS��)����
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #367776  �ѹ��ե���ɼ#367777
 *   ���׷�No.375  ��������С��ΰ��֤ν�����б���ȼ������������ɲ�
 * 
 * Rev.i46��������2021/01/13����ǧ��������Ĵ����������ô����(SCSK)��߷
 *   �ѹ���ͳ�������������ֹ桧XT52-000��
 *   ���������ֹ� #367778  �ѹ��ե���ɼ#367779
 *   ���ƥ��ȥǡ����������̤Υ��饹̾��Winpry010053�˽������줿����Const��̾�Τ�ʻ���ƽ����б�
 * 
 */

package jp.co.tmtd.fuchu.xp.dr.py;

/** import jp.co.tmtd.fuchu.xp.da.p0.A0Color; */

/**
 * ��̳����������饹
 * <Pre>
 * �㳲������
 * �ץ����ͣӣǡ� ̵
 * WorkGroup����ߤ����륨�顼��̵
 * �ʵץ롼�פ��륨�顼��̵
 * ���󥿡���å���̵
 * ������
 * 100Kbyte�ʾ������̵
 * ��ά���ԡ��ɡ�
 * ���������׽�������
 * ���׽�������
 * ���ƥåס�11  ή��Ψ��0% (ή�Ѹ���)
 * ��ǽ������
 * �����б���̳�ˤƻ��Ѥ��������������륯�饹�Ǥ���
 * </Pre>
 */
public class CstRyConst
{
  /** ==========================================================================// */
  /**  ��� */
  /** ==========================================================================// */
  /** �ڶ��̡� */
  /**  ����ʸ�� */
  public static final String CstRyDefault_Zero = "0";

  /**  ��ʸ�� */
  public static final String CstRyBlankStr = "";

  /**  ���ڤ�ʸ�� */
  public static final String CstRySplitStr1 = ",";
  public static final String CstRySplitStr2 = "��";
  public static final String CstRySplitStr3 = "\\.";

  /**  ����� */
  public static final String CstRyColonStr = ":";
  public static final String CstRyColonStr2 = "��";
  /**  ����å��� */
  public static final String CstRySlashStr = "/";
  /**  �ԥꥪ�� */
  public static final String CstRyPeriodStr = ".";
  /**  �ϥ��ե� */
  public static final String CstRyHyphenStr = "-";
  /**  �ϥ��ե�����ѡ� */
  public static final String CstRyHyphenZenStr = "��";
  /**  �������ꥹ�� */
  public static final String CstRyAsteriskStr = "*";
  /**  ���ߥ���� */
  public static final String CstRySemicolonStr = ";";
  /**  ����� */
  public static final String CstRyCommaStr = "��";
  /**  ���� */
  public static final String CstRyDokutennStr = "��";
  /**  ���� */
  public static final String CstRyNewLine = "\n";
  public static final String CstRyNewLineStr = "\\n";

  /**  �ե����ޥåȷ��� */
  public static final String CstRyFormatSp4s = "%4s";

  /**  ���̥ꥹ��ɽ����� */
  public static final int CstRyDisplayLineCount30 = 30;
  public static final int CstRyDisplayLineCount100 = 100;

  /**  �в���� */
  public static final String CstRyHourTimeStr = "����";
  public static final String CstRyHourStr = "��";
  public static final String CstRyMiniStr = "ʬ";


  /** Max���� */
  /** Rev.i04 Mod Start */
  /** public static final String CstRyMaxDateTime = "9999/12/3123:59"; */
  /**  9999ǯ����DB����Ͽ�Ǥ��ʤ��١�2035ǯ�ˤ��Ƥޤ��� */
  public static final String CstRyMaxDateTime = "2035/12/3123:59";
  /** Rev.i04 Mod End */

  /**  ���ڡ��� */
  public static final String CstRySpace1 = " ";
  public static final String CstRySpace4 = "    ";
  public static final String CstRySpace5 = "     ";
  public static final String CstRySpaceZen = "��";

  /**  Boolean�� */
  public static final String CstRyTrue = "true";
  public static final String CstRyFalse = "false";

  /**  �����å��ܥå��� */
  public static final String CstRyChekOn = "1";
  public static final String CstRyChekOff = "0";
  public static final String CstRyChekNull = "null";

  /**  ̵ͭ�ե饰 */
  public static final int CstRyFlgMu = 0;  /**  ̵�� */
  public static final int CstRyFlgYu = 1;  /**  ͭ�� */

  /**  ɽ���ե饰 */
  public static final int CstRyDisplayOff = 0; /**  ��ɽ�� */
  public static final int CstRyDisplayOn = 1;  /**  ɽ�� */

  /**  �ե�å�Ƚ��ե饰 */
  public static final int CstRyFlickerOff = 0; /**  ���� */
  public static final int CstRyFlickerLit = 1; /**  ���� */


  /**  ̵ͭʸ�� */
  public static final String[] CstRyYuMuStr = new String[]{ "̵","ͭ"};

  /** Rev.i08 Add Start */
  /**  ̵ͭʸ���� */
  public static final String[] CstRyYuMuStr2 = new String[]{ "�ʤ�","����"};
  /** Rev.i08 Add End */

  /** �á��ߥ��ä��Ѵ����� */
  public static final int CstRyScaleMilli = 1000;

  /**  ����ʸ�� */
  public static final String CstRyMeisaiStr = "����";
  /**  ����ʸ�� */
  public static final String CstRyIchiranStr = "����";

/**  Rev.i45 Add Start */
  /**  ��������С�������� */
  public static final int CstRyScrollBarInitialPosition = 0;  /**  ��Ƭ */
/**  Rev.i45 Add End */

  /** �ڶ�̳�� */

  /** �Ը�̾���� */
  public static final String[] CstRyPrefecturesStr = new String[]{"", "�����", "�����", "��̸�", "���ո�", "�Ų���", "��븩", "���ڸ�", "���ϸ�", "������"};

  /** �Ѱ���Σ */
  public static final String[] CstRyTransformerNoStr = new String[]{"", "����", "����", "����", "����"};

  /**  TM����No.ʸ�� */
  public static final String[] CstRyTMItems = new String[]{"","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��"};

  /** �������η�̾���� ʸ���� */
  public static final int CstRyGreen = 0;
  public static final int CstRyWhite = 1;

  /** �������ξ������� ʸ���� */
  public static final int CstRyRed = 1;
  public static final int CstRyYell2 = 2;
  public static final int CstRyCYAN  = 0;
  public static final int CstRyGreen2 = 1;


 /** �������η�̾���� ��̾�����ơ��֥���ܿ� */
  public static final int CstRySubListColMax = 13;

  /** �������ξ������� �������ƥơ��֥���ܿ� */
  public static final int CstRyTrblecontsColMax = 5;

  /** �������ξ������� ���������ơ��֥���ܿ� */
  public static final int CstRyTrbleeqpColMax = 4;

  /** ��̾�������� */
  public static final int CstRyMakeMode_Auto   = 0;     /** ��ư���� */
  public static final int CstRyMakeMode_Manual = 1;     /** ��ư���� */

  /** ��̾�������� */
  public static final int CstRyTrblPrmtRep_Not   = 0;   /** ̤���� */
  public static final int CstRyTrblPrmtRep_Jin   = 1;   /** ������ */

  /** �۾���ɽ�� */
  public static final int CstRyRPowAbnFlg = 1;
  public static final int CstRyRPowAbnFlg_On = 1;
  public static final int CstRyRPowAbnFlg_Off = 0;
  public static final String CstRyPowAbnStr = "E0";
  public static final String CstRyZPhsVoltAbnStr = "E0.0";
  public static final String CstRyPowAbnAllStr = "E";

  /**  ����̵ͭ */
  public static final int CstRyImplFlag_False = 0;    /**  ̵ */
  public static final int CstRyImplFlag_True =  1;    /**  ͭ */

  /** Rev.i26 Add Start */
  /** ����Բ�Ƚ�� */
  public static final int CstRyDelete_Zero = 0;    /**  ����� */
  public static final int CstRyDelete_One =  1;    /**  ����Բ� */
  /** Rev.i26 Add End */

  /**  �������� */
  public static final int  CstRyManagemenRunningCd = 0;
  public static final int  CstRyManagemenClosingCd = 1;

  /** ���η�̾�ɲå��ơ����� */
  public static final int  CstRyNewMake_Suces  = 1;
  public static final int  CstRyNewMake_Err    = 2;
  public static final int  CstRyNewMake_Cancel = 3;

  /** �桼�����٥�ȥѥ�᡼�� */
  public static final String CstRyWinpry000002_1500_1 = "JKNO";

  /**  ���������ե饰 */
  public static final int CstRyFinalRestrPrcDtr_False = 0;
  public static final int CstRyFinalRestrPrcDtr_True = 1;

  /**  ���θ�ƻ륭�塼�������� */
  public static final int CstRyAftTrblQueStatus_False = 0;
  public static final int CstRyAftTrblQueStatus_True = 1;

  public static final String[] CstRyManagemenStr = new String[]{"������", "������λ"};

  /** �������η�̾���� ����ȯ�����������������ѥ�᡼�� */
  public static final int CstRyTrblDateStart = 1;
  public static final int CstRyTrblDateEnd = 2;

  /** �������η�̾���� ���η�̾������о�� */
  public static final String CstRyVewRes0001main_Restriction = "'bImplFlag' == 1";

  /** �������ξ��� ���η�̾��о�� */
  public static final String CstRyVewRes0002Add_Restriction = "'bImplFlag' == 1&&'PK_TblReSubjectList' == ";
  public static final String CstRyVewRes0002New_Restriction = "'PK_TblReSubjectList' == ";


  /** �������ξ��� ���ξ�����о�� */
  public static final String CstRyVewRes0002cont_TableName = "TblReTroubleContents";
  public static final String CstRyVewRes0002cont_Restriction = "";

  /** �������ξ��� ���ξ���������о�� */
  public static final String CstRyVewRes0002eqp_Restriction = "'nTrblIndexNo' == ";

  /** �������ξ��� ���ξ����ݰ·״���о�� */
  public static final String CstRyVewRes0002sec_Restriction = "'nTrblIndexNo' == ";

  /** ���ť�å����̰�����о�� */
  public static final String CstRy0052Restriction = "'bImplFlag' == 1";

  /**  ���ť�å�����������������ֽ����ž��� */
  public static final String CstRySquare = "��";

  /** �������η�̾���� ����ܥ���ɽ�� */
  public static final int CstRyDefPrint = 0;
  public static final int CstRySendRecoPrint = 1;
  public static final int CstRySendNamePrint = 2;

  /** �Ű����� */
  public static final int CstRyVolClass_275kVOV   = 1;  /**  275kV�ʾ� */
  public static final int CstRyVolClass_154kV     = 2;  /**  154kV */
  public static final int CstRyVolClass_66kV      = 3;  /**  66kV */
  public static final int CstRyVolClass_21kV      = 4;  /**  22kV */

  /** ���μ��� */
  /** ���� */
  public static final int CstRyTrblKind_PowerSupply      = 1;  /**  �Ÿ� */
  public static final int CstRyTrblKind_Bank             = 2;  /**  �Х� */
  public static final int CstRyTrblKind_Bus              = 3;  /**  ���� */
  public static final int CstRyTrblKind_GrndFlt          = 4;  /**  ���� */
  public static final int CstRyTrblKind_PowMeasu         = 5;  /**  ���� */
  public static final int CstRyTrblKind_22kVTMLine       = 6;  /**  22kV������ */
  public static final int CstRyTrblKind_6kVTMLine        = 7;  /**  6kV������ */
  /** Rev.i08 Add Start */
  public static final int CstRyTrblKind_22kVLineSelect   = 12;  /**  22kV�������򼰳��Ĵ� */
  public static final int CstRyTrblKind_22kVCustomer     = 13;  /**  22kV���Ҥ��� */
  /** Rev.i08 Add End */
  /** ���� */
  public static final int CstRyTrblKind_TransmissionLine = 8;  /**  ������ */
  public static final int CstRyTrblKind_PowerTransformer = 9;  /**  �Ѱ��� */
  public static final int CstRyTrblKind_BusBarSection    = 10; /**  ���� */
  public static final int CstRyTrblKind_Other            = 11; /**  ����¾ */
  /** Rev.i08 Mod Start */
  /** public static final String[] CstRyTrblKindStr = new String[]{"", "�Ÿ�", "�Х�", "����", "����", "����", "22kV������","6kV������","������","�Ѱ���","����","����¾" }; */
  public static final String[] CstRyTrblKindStr = new String[]{"", "�Ÿ�", "�Х�", "����", "����", "����", "22kV������","6kV������","������","�Ѱ���","����","����¾","��������\n�Ѱ���","���Ҥ���\n����" };
  public static final String[] CstRyTrblKindStr22kv = new String[]{"", "�Ÿ�", "�Х�", "����", "����", "����", "22kV������","6kV������","������","�Ѱ���","����","����¾","���������Ѱ���","���Ҥ�������" };
  /** Rev.i08 Mod End */
  /** ���ξ��� */
  public static final int CstRyTrblSitu_Judge   = 1;  /**  ȯ����ʶ���پ�Ƚ����� */
  public static final int CstRyTrblSitu_Final   = 2;  /**  ȯ����ʶ���پ����� */
  public static final int CstRyTrblSitu_lRes    = 3;  /**  ����� */

  public static final String[] CstRyTrblSituStr = new String[]{"", "ȯ����ʶ���پ�Ƚ�����", "ȯ����ʶ���پ�����", "�����" };

  /** ������ */
  public static final String[] CstRyTrblPhaseStr = new String[]{"��", "��", "��"};

  public static final int CstRyTrblPhaseOn = 1;
  public static final int CstRyTrblPhaseOff = 0;

  /** �������� */
  public static final int CstRyTrblEquipment = 1;
  public static final int CstRyTrblCandidateEquipment = 2;

  public static final String[] CstRyEquipmentKindStr = new String[]{"","��������", "���θ�������"};

  /** ��̾�������� */
  public static final int CstRyMakeModeAutoCreate = 0;
  public static final int CstRyMakeModeManualCreate = 1;

  /** ����®��������� */
  public static final int CstRyTrblPrmtRepStsNotCreate = 0;
  public static final int CstRyTrblPrmtRepStsCreate = 1;

  /** �õ����� */
  public static final int CstRySpecialMention_Eqpmntdmg  = 1;   /**  ����»�� */
  public static final int CstRySpecialMention_Fire       = 2;   /**  �б� */
  public static final int CstRySpecialMention_Explosion  = 3;   /**  ��ȯ */
  public static final int CstRySpecialMention_Flooding   = 4;   /**  ���� */
  public static final int CstRySpecialMention_Collapse   = 5;   /**  �ݲ� */
  public static final int CstRySpecialMention_OilSpill   = 6;   /**  ��ή�� */
  public static final int CstRySpecialMention_Rad        = 7;   /**  ����ǽ */
  public static final int CstRySpecialMention_Person     = 8;   /**  �Ϳ� */
  public static final int CstRySpecialMention_Earthquake = 9;   /**  �Ͽ� */
  public static final int CstRySpecialMention_Tsunami    = 10;  /**  ���� */
  public static final int CstRySpecialMention_Typhoon    = 11;  /**  ���� */
  public static final int CstRySpecialMention_Thunder    = 12;  /**  �볲 */
  public static final int CstRySpecialMention_Snow       = 13;  /**  �㳲 */
  public static final int CstRySpecialMention_Flood      = 14;  /**  ���� */
  public static final int CstRySpecialMention_Tornado    = 15;  /**  ε�� */
  public static final int CstRySpecialMention_Gust       = 16;  /**  ���� */
  public static final int CstRySpecialMention_Other      = 17;  /**  ����¾ */

  public static final String[] CstRySpecialMentionStr = new String[]{"","����»��", "�к�", "��ȯ", "����","�ݲ�", "��ή��", "����ǽ", "�Ϳ�", "�Ͽ�", "����", "����", "�볲", "�㳲", "����", "ε��", "����", "����¾", ""};

  /** ���� */
  public static final int CstRySituation_TrblJudgRun         = 1; /**  ����Ƚ���� */
  public static final int CstRySituation_TrblJudgEnd         = 2; /**  ����Ƚ�꽪λ */
  public static final int CstRySituation_TrblMonitorRun      = 3; /**  ���λ��ƻ��� */
  public static final int CstRySituation_TrblMonitorErr      = 4; /**  ���λ��ƻ�۾� */
  public static final int CstRySituation_TrblMonitorEnd      = 5; /**  ���λ��ƻ뽪λ */
  public static final int CstRySituation_AutoCreateWait      = 6; /**  ��ư�����Ԥ� */
  public static final int CstRySituation_AutoCreateRun       = 7; /**  ��ư������ */
  public static final int CstRySituation_AutoCreateNo        = 8; /**  ��ư�����Բ� */
  public static final int CstRySituation_AutoCreateEnd       = 9; /**  ��ư������λ */
  public static final int CstRySituation_PseudoRunning       = 10; /**  �ϵ��¹��� */
  public static final int CstRySituation_PseudoRunningErr    = 11; /**  �ϵ��¹԰۾� */
  public static final int CstRySituation_PseudoRunningEnd    = 12; /**  �ϵ��¹Խ�λ */
  public static final int CstRySituation_ProcedureRunning    = 13; /**  ���¹��� */
  public static final int CstRySituation_ProcedureStop       = 14; /**  ��������� */
  public static final int CstRySituation_RestorationStop     = 15; /**  ������� */
  public static final int CstRySituation_ProcedureErrEnd     = 16; /**  ���۾ｪλ */
  public static final int CstRySituation_ProcedureCraWait    = 17; /**  ���ƺ����Ԥ� */
  public static final int CstRySituation_AllSendTimeWait     = 18; /**  �������������Ԥ� */
  public static final int CstRySituation_ProcedureTimWait    = 19; /**  �������������Ԥ� */
  public static final int CstRySituation_ManagemenEnd        = 20; /**  ������λ */
  public static final int CstRySituation_SwitchwayLckRun     = 21; /**  ����ϩ��å��� */
  public static final int CstRySituation_InputPowerLckRun    = 22; /**  �����Ÿ���å��� */
  public static final int CstRySituation_RetransmissionOK    = 23; /**  �ƻ��κ��������� */
  public static final int CstRySituation_RetransmissionNG    = 24; /**  �ƻ��κ��������� */
  public static final int CstRySituation_MultipleTrbl        = 25; /**  ¿�Ż��� */
  public static final int CstRySituation_GroundFaltLckRun    = 26; /**  �������å��� */
  public static final int CstRySituation_SituationUnknown    = 27; /**  �������� */
/** Rev.i31 Add Start */
  public static final int CstRySituation_LocalOperationWait  = 28; /**  ��������Ԥ� */
  public static final int CstRySituation_LocalOperationRun   = 29; /**  ��������� */
/** Rev.i31 Add End */
/** Rev.i32 Mod Start */
/**   public static final String[] CstRySituationStr = new String[]{"", "����Ƚ����", "����Ƚ�꽪λ", "���λ��ƻ���", "���λ��ƻ�۾�", "���λ��ƻ뽪λ", */
/**   "��ư�����Ԥ�", "��ư������", "��ư�����Բ�", "��ư������λ", "�ϵ��¹���", "�ϵ��¹԰۾�", "�ϵ��¹Խ�λ", "���¹���", */
/**   "���������", "�������", "���۾ｪλ", "���ƺ����Ԥ�", "�������������Ԥ�", "�������������Ԥ�", "������λ", "����ϩ��å���", */
/**   "�����Ÿ���å���", "�ƻ��κ���������", "�ƻ��κ���������", "¿�Ż���", "�������å���", "��������" }; */
  public static final String[] CstRySituationStr = new String[]{"", "����Ƚ����", "����Ƚ�꽪λ", "���λ��ƻ���", "���λ��ƻ�۾�", "���λ��ƻ뽪λ",
  "��ư�����Ԥ�", "��ư������", "��ư�����Բ�", "��ư������λ", "�ϵ��¹���", "�ϵ��¹԰۾�", "�ϵ��¹Խ�λ", "���¹���",
  "���������", "�������", "���۾ｪλ", "���ƺ����Ԥ�", "�������������Ԥ�", "�������������Ԥ�", "������λ", "����ϩ��å���",
  "�����Ÿ���å���", "�ƻ��κ���������", "�ƻ��κ���������", "¿�Ż���", "�������å���", "��������", "��������Ԥ�", "���������" };
/** Rev.i32 Mod Start */
  /** ���θ�ƻ�ǿ����� */
  public static final int CstRyAftStatus_Notimplemented = 1; /**  ̤�»� */
  public static final int CstRyAftStatus_Progress       = 2; /**  �»��� */
  public static final int CstRyAftStatus_Suspended      = 3; /**  ������ */
  public static final int CstRyAftStatus_Restarting     = 4; /**  �Ƴ��� */
  public static final int CstRyAftStatus_Aborted        = 5; /**  ��ߺ� */
  public static final int CstRyAftStatus_Implemented    = 6; /**  �»ܺ� */

  public static final String[] CstRyAftStatusStr = new String[] {"", "̤�»�", "�»���", "������", "�Ƴ���", "��ߺ�", "�»ܺ�"};
  /** Rev.i08 Add Start */
  /**  ���θ�ƻ�¹Ծ��� */
  public static final int CstRyExeStatus_Notimplemented = 0; /**  ̤�»� */
  public static final int CstRyExeStatus_MntrgNormal    = 1; /**  �̾� */
  public static final int CstRyExeStatus_MntrgClbrtn    = 2; /**  Ϣ�� */
  public static final int CstRyExeStatus_MntrgEnd       = 3; /**  ��ü */
  public static final String[] CstRyAftExeStatusStr = new String[] {"", "�̾�", "Ϣ��", "��ü"};
  /** Rev.i08 Add End */

  /** ���θ�ƻ��̾Ϣ�� */
  public static final int CstRyAftTrblMntrgNot = 0; /**  ̤ */
  public static final int CstRyAftTrblMntrgOK  = 1; /**  �� */

  public static final String[] CstRyAftTrblMntrgStr = new String[] {"̤", "��"};

  /**  ������� */
  public static final int CstRyLocalCtrl_NO  = 0; /**  ̵ */
  public static final int CstRyLocalCtrl_YES = 1; /**  ͭ */

  /** Rev.i13 Mod Start */
/**   public static final String[] CstRyLocalCtrlStr = new String[] {"̵", ""}; */
  public static final String[] CstRyLocalCtrlStr = new String[] {"", "��"};
  /** Rev.i13 Mod End */

  /**  �»ܷ�� */
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
  public static final int CstRyImpResult_LocalOpeWait = 9;  /**  ��������Ԥ� */
  public static final int CstRyImpResult_LocalOpe = 10;     /**  ��������� */
/** Rev.i32 Add End */

  /**  �»ܷ�� */
  public static final String[] CstRyImplementationRstStr = new String[] {"̤�»�","�ϵ��¹���","�ϵ��¹�����","�ϵ��۾�","�¼¹���","�¼¹ԥ����å�����",
    "�¼¹ԥ����å��۾�","�����۾�","���������"};

  /**  �»ܷ�̥��顼 */
  public static final int CstRyImpRsltErr_Level1 = 1;
  public static final int CstRyImpRsltErr_Level2 = 2;

  /** ��ģ��� */
  public static final int CstRyGovRep_NO = 0;
  public static final int CstRyGovRep_YES = 1;
  public static final String[] CstRyGovRepStr = new String[]{"", "ͭ"};

  /** ��־��� */
  public static final String[] CstRySectionFdrStsStr = new String[]{"��������", "��������", "ͻ�̸�", "ͻ����","��������", "�۵�����", "���ѽ���", "�롼����", "��������롼����", "��������������", ""};

  /** ��־���No */
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

  /** ������ž��� */
  public static final int CstRySectionBoutSts0 = 0; /**  ̤�����ʶ���� */
  public static final int CstRySectionBoutSts1 = 1; /**  �ġ����ѽ��� */
  public static final int CstRySectionBoutSts2 = 2; /**  �֡����šʽ����� */
  public static final int CstRySectionBoutSts3 = 3; /**  �ޥ���������š�ͻ�̡� */
  public static final int CstRySectionBoutSts4 = 4; /**  �����������šʤޤ��Ϲ������š��۵����Ŵޤ�� */
  public static final int CstRySectionBoutSts5 = 5; /**  �С��������� */

  /** ����¾���� */
  public static final int CstRyBoutPlace  = 1;
  public static final String CstRyBoutPlaceStr = "��¾";

  /** Ķ���פ����� */
  public static final int CstRySImpCustBout = 1;
  public static final String[] CstRySImpCustBoutStr = new String[]{"", "ͭ"};

  /** �������η�̾���� ���쥹�ơ����� */
  public static final int CstRyRes_NO = 0;
  public static final int CstRyRes_YES = 1;

  /** ����ϩ������ */
  public static final int CstRyReClosTrans_No        = 0;
  public static final int CstRyReClosTrans_Reclosure = 1;
  public static final int CstRyReClosTrans_Reclosing = 2;
  public static final String[] CstRyReClosTransStr = new String[]{"", "����ϩ", "������"};

  /** û������ */
  public static final int CstRySCirGFault_Unknown       = 1;
  public static final int CstRySCirGFault_Shortcircuit  = 2;
  public static final int CstRySCirGFault_Earthfault    = 3;
  public static final int CstRySCirGFault_Same          = 4;

  public static final String[] CstRySCirGFault_Str = new String[]{"", "û��", "����","û��"};

  /** �������Ƶ�Ͽ����������ʬ */
  public static final int CstRyParamRequestNormal = 0;    /**  ��������������ξ������̤����ɽ�����̾������ */
  public static final int CstRyParamRequestAdd = 1;       /**  ��̾�ɲå������������ɽ���ʷ�̾�ɲý����� */

  /**  ���ꥢ */
  public static final int CstRyAreaCode_Tochigi   = 1;  /**  ���� */
  public static final int CstRyAreaCode_Gunma     = 2;  /**  ���� */
  public static final int CstRyAreaCode_Ibaraki   = 3;  /**  ��� */
  public static final int CstRyAreaCode_Saitama   = 4;  /**  ��� */
  public static final int CstRyAreaCode_Chiba     = 5;  /**  ���� */
  public static final int CstRyAreaCode_Tokyo     = 6;  /**  ��� */
  public static final int CstRyAreaCode_Tama      = 7;  /**  ¿�� */
  public static final int CstRyAreaCode_Kanagawa  = 8;  /**  ������ */
  public static final int CstRyAreaCode_Yamanashi = 9;  /**  ���� */
  public static final int CstRyAreaCode_Shizuoka  = 10; /**  �Ų� */

  /**  �ơ��֥�̾ */
  public static final String CstRyTblReFLBoutRcvryConsumer = "TblReFLBoutRcvryConsumer";     /** ����������������ײȾ��� */
  public static final String CstRyTblReUSBoutRcvryConsumer = "TblReUSBoutRcvryConsumer";   /** ��̷�������������ײȾ��� */

  /**  ����ɽ����� */
  public static final int  CstRyWinpry000001_ListDispCnt01 = 50;      /**  �������η�̾�����ʻ��η�̾������ */
  public static final int  CstRyWinpry000002_ListDispCnt01 = 100;      /**  �������ξ��������ʻ������Ƶ�Ͽ�� */
  public static final int  CstRyWinpry000002_ListDispCnt02 = 30;       /**  �������ξ��������ʻ��������� */
  public static final int  CstRyWinpry000002_ListDispCnt03 = 30;       /**  �������ξ����������ݰ·״�ؼ������� */
  /** Rev.i04 Mod Start */
  /** public static final int  CstRyWinpry000003_ListDispCnt01 = 100;    // �����پ���� ���̡ʶ���پ�� */
  /** public static final int  CstRyWinpry000003_ListDispCnt02 = 100;    // �����پ���� ���̡�ȯ�Żپ�� */
  /** public static final int  CstRyWinpry000003_ListDispCnt03 = 100;    // �����پ���� ���̡ʴ�Ϣ���Ƚ�̾�� */
  public static final int  CstRyWinpry000003_ListDispCnt01 = 150;     /**  �����پ���� ���̡ʶ���پ�� */
  public static final int  CstRyWinpry000003_ListDispCnt02 = 150;      /**  �����پ���� ���̡�ȯ�Żپ�� */
  public static final int  CstRyWinpry000003_ListDispCnt03 = 150;     /**  �����پ���� ���̡ʴ�Ϣ���Ƚ�̾�� */
  /** Rev.i04 Mod End */
  public static final int  CstRyWinpry000004_ListDispCnt01 = 50;      /**  �����ۿ������������� */
  public static final int  CstRyWinpry000005_ListDispCnt01 = 100;      /**  �����ù���ײ���߼��Ӱ������̡���߼��Ӱ����� */
  public static final int  CstRyWinpry000010_ListDispCnt01 = 80;      /**  Ĵ��������Ư������������ */
  public static final int  CstRyWinpry000010_ListDispCnt02 = 80;      /**  Ĵ��������Ư������������ */
  public static final int  CstRyWinpry000010_ListDispCnt03 = 80;      /**  Ĵ��������Ư������������ */
  public static final int  CstRyWinpry000011_ListDispCnt01 = 20;     /**  ���Ѿ���������̡����Ѿ�������� */
  /** Rev.i42 Mod Start */
/**   public static final int  CstRyWinpry000040_ListDispCnt01 = 45;     // �������η�̾�������̡ʻ��η�̾������ */
  public static final int  CstRyWinpry000040_ListDispCnt01 = 9000;     /**  �������η�̾�������̡ʻ��η�̾������ */
  /** Rev.i42 Mod End */
  public static final int  CstRyWinpry000041_ListDispCnt01 = 30;       /**  ��������������ξ������̡���������������ή�� */
  public static final int  CstRyWinpry000041_ListDispCnt02 = 100;      /**  ��������������ξ������̡ʻ��λ������� */
  public static final int  CstRyWinpry000041_ListDispCnt03 = 100;     /**  ��������������ξ������̡ʻ��η�̾������ */
  public static final int  CstRyWinpry000041_ListDispCnt05 = 30;       /**  ����־�̷������ξ������̡ʻ�������ή�� */
  public static final int  CstRyWinpry000042_ListDispCnt01 = 30;       /**  ����־�̷������ξ������̡ʻ��ξ����� */
  public static final int  CstRyWinpry000042_ListDispCnt02 = 100;      /**  ����־�̷������ξ������̡ʻ������Ƶ�Ͽ�� */
  public static final int  CstRyWinpry000042_ListDispCnt03 = 100;      /**  ����־�̷������ξ������̡ʻ��λ������� */
  public static final int  CstRyWinpry000042_ListDispCnt04 = 150;     /**  ����־�̷������ξ������̡ʻ��η�̾������ */
  public static final int  CstRyWinpry000042_ListDispCnt05 = 30;       /**  ����־�̷������ξ������̡ʻ�������ή�� */
  public static final int  CstRyWinpry000043_ListDispCnt01 = 100;      /**  ������ַ������ξ������̡ʻ������Ƶ�Ͽ�� */
  public static final int  CstRyWinpry000043_ListDispCnt02 = 100;      /**  ������ַ������ξ������̡ʻ��������� */
  public static final int  CstRyWinpry000043_ListDispCnt03 = 100;      /**  ������ַ������ξ������̡��ݰ·״�ؼ������� */
  public static final int  CstRyWinpry000043_ListDispCnt04 = 150;     /**  ������ַ������ξ������̡ʻ��η�̾������ */
  /** Rev.i22 Add Start */
  public static final int  CstRyWinpry020046_ListDispCnt01 = 1000;     /**  �ƣ���������̥�ݡ��Ȱ������� */
  /** Rev.i22 Add End */
  /** Rev.i10 Mod Start */
  public static final int  CstRyWinpry000043_ListDispCnt05 = 80;     /**  ������ַ����������ʳ����ϡ�N��Ƚ��� */
  /** Rev.i10 Mod End */
  /** Rev.i04 Mod Start */
  /** public static final int  CstRyWinpry000044_ListDispCnt01 = 100;    // �����پ�������̡ʶ���پ�� */
  /** public static final int  CstRyWinpry000044_ListDispCnt02 = 100;    // �����پ�������̡�ȯ�Żپ�� */
  /** public static final int  CstRyWinpry000044_ListDispCnt03 = 100;    // �����پ�������̡ʴ�Ϣ���Ƚ�̾�� */
  public static final int  CstRyWinpry000044_ListDispCnt01 = 150;     /**  �����پ�������̡ʶ���پ�� */
  public static final int  CstRyWinpry000044_ListDispCnt02 = 150;      /**  �����پ�������̡�ȯ�Żپ�� */
  public static final int  CstRyWinpry000044_ListDispCnt03 = 150;     /**  �����پ�������̡ʴ�Ϣ���Ƚ�̾�� */
  /** Rev.i04 Mod End */
  public static final int  CstRyWinpry000046_ListDispCnt01 = 45;     /**  �����ۿ������������̡��ۿ����������� */
  public static final int  CstRyWinpry000047_ListDispCnt01 = 100;      /**  �����ù���ײ���߼��Ӱ������̡���߼��Ӱ����� */
  /** Rev.i01 Mod Start */
  /** public static final int  CstRyWinpry000050_ListDispCnt01 = 100;    // ��������������ή�������̡ʻ�������ή����� */
  public static final int  CstRyWinpry000050_ListDispCnt01 = 110;    /**  ��������������ή�������̡ʻ�������ή����� */
  /** public static final int  CstRyWinpry000052_ListDispCnt01 = 100;    // ���������Υȥ�å״��� */
  public static final int  CstRyWinpry000052_ListDispCnt01 = 100;     /**  ���������Υȥ�å״��� */
  /** public static final int  CstRyWinpry000053_ListDispCnt01 = 100;    // ���ž����å��������̡����ť�å������ */
  public static final int  CstRyWinpry000053_ListDispCnt01 = 220;     /**  ���ž����å��������̡����ť�å������ */
  /** public static final int  CstRyWinpry000054_ListDispCnt01 = 100;    // �����������Ž�������̡ʻ���������������������� */
  public static final int  CstRyWinpry000054_ListDispCnt01 = 220;     /**  �����������Ž�������̡ʻ���������������������� */
  /** public static final int  CstRyWinpry000055_ListDispCnt01 = 100;    // ���������������������̡ʻ���������������������� */
  public static final int  CstRyWinpry000055_ListDispCnt01 = 220;     /**  ���������������������̡ʻ���������������������� */
  /** Rev.i01 Mod End */
  /** Rev.i25 Mod Start */
  public static final int  CstRyWinpry000070_ListDispCnt01 = 100;     /**  ���ե饤��ԣ�������̡ʥ��ե饤��ԣ��оݡ� */
  public static final int  CstRyWinpry000070_ListDispCnt02 = 50;     /**  ���ե饤��ԣ�������̡����ѥХ��оݡ� */
  /** public static final int  CstRyWinpry000070_ListDispCnt01 = 140;     // ���ե饤��ԣ�������̡ʥ��ե饤��ԣ��оݡ� */
  /** Rev.i25 Mod End */
  public static final int  CstRyWinpry100001_ListDispCnt01 = 140;     /**  ���ե饤��ԣ�������̡ʥ��ե饤��ԣ��оݡ� */
  public static final int  CstRyWinpry000071_ListDispCnt01 = 100;    /**  ����پ㻻���ѥ��ե饤��ԣ�������̡ʥ���饤����̣ԣ�̤�����̾�� */
  public static final int  CstRyWinpry000071_ListDispCnt02 = 15;       /**  ����پ㻻���ѥ��ե饤��ԣ�������̡�TM������ */
  /**  Rev.i40 MOD Start */
/**   public static final int  CstRyWinpry000071_ListDispCnt03 = 80;      // ����پ㻻���ѥ��ե饤��ԣ�������̡�ȯ�Żپ�ɽ���ѽ�̾�Ѵ������ */
  public static final int  CstRyWinpry000071_ListDispCnt03 = 15;      /**  ����پ㻻���ѥ��ե饤��ԣ�������̡�ȯ�Żپ�ɽ���ѽ�̾�Ѵ������ */
  /**  Rev.i40 MOD End */
  /** Rev.i08 Add Start */
  public static final int  CstRyWinpry000007_ListDispCnt01 = 100;      /**  ��������®����� */
  public static final int  CstRyWinpry000045_ListDispCnt01 = 100;      /**  ��������®����� */
  public static final int  CstRyWinpry000057_ListDispCnt01 = 150;     /**  ��ü���θ�ƻ�������� */
  public static final int  CstRyWinpry000058_ListDispCnt01 = 100;      /**  �����Ѳ���������ư�������(���ֵ��������ơ��֥�) */
  public static final int  CstRyWinpry000058_ListDispCnt02 = 24;       /**  �����Ѳ���������ư�������(�����������ơ��֥�) */
  public static final int  CstRyWinpry000059_ListDispCnt01 = 100;      /**  ���������������Ƚ��ޥȥꥯ�� */
  public static final int  CstRyWinpry000060_ListDispCnt01 = 100;      /**  ����־�̷�������Ƚ��ޥȥꥯ�� */
/** Rev.i38 Mod Start */
/**   public static final int  CstRyWinpry000061_ListDispCnt01 = 100;      // ������ַ�������Ƚ��ޥȥꥯ�� */
  public static final int  CstRyWinpry000061_ListDispCnt01 = 176;      /**  ������ַ�������Ƚ��ޥȥꥯ�� */
/** Rev.i38 Mod End */
  public static final int  CstRyWinpry000072_ListDispCnt01 = 100;      /**  �����ϰ�������̥ơ��֥룱 */
  public static final int  CstRyWinpry000072_ListDispCnt02 = 100;      /**  �����ϰ�������̥ơ��֥룲 */
  public static final int  CstRyWinpry000073_ListDispCnt01 = 500;     /**  ���Ѷ����ϰ�������̥ơ��֥� */
  public static final int  CstRyWinpry010007_ListDispCnt01 = 100;      /**  ��������®���õ������������ */
  public static final int  CstRyWinpry010045_ListDispCnt01 = 100;      /**  ��������®���õ������������ */
  /** Rev.i08 Add End */
  /** Rev.i15 Add Start */
  public static final int  CstRyWinpry000062_ListDispCnt01 = 44;       /**  ���δ�Ϣ�ݥ���������  // Rev.i21 Mod */
  /** Rev.i15 Add Start */

  public static final int  CstRyPoppry000204_ListDispCnt01 = 187;   /**  ������������(��̾�����ơ��֥�) */
  /** Rev.i06 Mod Start */
  /** public static final int  CstRyPoppry000204_ListDispCnt02 = 300;    // ������������(����̾�����ơ��֥�) */
  public static final int  CstRyPoppry000204_ListDispCnt02 = 250;     /**  ������������(����̾�����ơ��֥�) */
  /** Rev.i06 Mod End */
  public static final int  CstRyPoppry000209_ListDispCnt01 = 181;   /**  ��̾�Ѵ�����(��̾�����ơ��֥�) */
  /** Rev.i06 Mod Start */
  /** public static final int  CstRyPoppry000209_ListDispCnt02 = 300;    // ��̾�Ѵ�����(����̾�����ơ��֥�) */
  public static final int  CstRyPoppry000209_ListDispCnt02 = 250;     /**  ��̾�Ѵ�����(����̾�����ơ��֥�) */
  /** Rev.i06 Mod End */
  public static final int  CstRyPoppry000210_ListDispCnt01 = 181;   /**  �������Ƶ�Ͽ����(��̾�����ơ��֥�) */
  /** Rev.i06 Mod Start */
  /** public static final int  CstRyPoppry000210_ListDispCnt02 = 2000;   // �������Ƶ�Ͽ����(����̾����̾�����ơ��֥�) */
  public static final int  CstRyPoppry000210_ListDispCnt02 = 500;     /**  �������Ƶ�Ͽ����(����̾����̾�����ơ��֥�) */
  /** Rev.i06 Mod End */
  public static final int  CstRyPoppry000211_ListDispCnt01 = 181;   /**  �ݰ·״�����(��̾�����ơ��֥�) */
  /** Rev.i06 Mod Start */
  /** public static final int  CstRyPoppry000211_ListDispCnt02 = 300;    // �ݰ·״�����(����̾�����ơ��֥�) */
  public static final int  CstRyPoppry000211_ListDispCnt02 = 250;     /**  �ݰ·״�����(����̾�����ơ��֥�) */
  /** Rev.i06 Mod End */
  /** Rev.i02 Mod Start */
  /** public static final int  CstRyPoppry000245_ListDispCnt01 = 100;    // ���š����줪�Ҥ��ް��������������� */
  public static final int  CstRyPoppry000245_ListDispCnt01 = 200;      /**  ���š����줪�Ҥ��ް��������������� */
  /** Rev.i02 Mod End */
  public static final int  CstRyPoppry000248_ListDispCnt01 = 100;      /**  �������Ƶ�Ͽ */
  public static final int  CstRyPoppry000249_ListDispCnt01 = 30;       /**  �ݰ·״�ؼ������������� */
  public static final int  CstRyPoppry000273_ListDispCnt01 = 100;      /**  �ۿ����������������� */
  public static final int  CstRyPoppry000275_ListDispCnt01 = 187;   /**  ����̾������(��̾�����ơ��֥�) */
  /** Rev.i06 Mod Start */
 /**  public static final int  CstRyPoppry000275_ListDispCnt02 = 300;    // ����̾������(����̾�����ơ��֥�) */
  public static final int  CstRyPoppry000275_ListDispCnt02 = 250;     /**  ����̾������(����̾�����ơ��֥�) */
  /** Rev.i06 Mod End */

  public static final int  CstRyPoppry000278_ListDispCnt01 = 187;   /**  ���ե饤��ԣ�����(��̾�����ơ��֥�) */
  /** Rev.i06 Mod Start */
  /** public static final int  CstRyPoppry000278_ListDispCnt02 = 250;    // ���ե饤��ԣ�����(����̾�����ơ��֥�) */
  public static final int  CstRyPoppry000278_ListDispCnt02 = 20;     /**  ���ե饤��ԣ�����(����̾�����ơ��֥�) */
  /** Rev.i06 Mod End */
  public static final int  CstRyPoppry000282_ListDispCnt01 = 50;      /**  ���η�̾��������������� */

  /** Rev.i08 Add Start */
  public static final int  CstRyPoppry000217_ListDispCnt01 = 100;      /**  ȯ�ŵ�������̥ơ��֥� */
  public static final int  CstRyPoppry000217_ListDispCnt02 = 100;      /**  ȯ�ŵ���������������̥ơ��֥� */
  public static final int  CstRyPoppry000218_ListDispCnt01 = 100;      /**  ���ײ�������̥ơ��֥� */
  public static final int  CstRyPoppry000256_ListDispCnt01 = 100;      /**  ����������ư����������̥ơ��֥� */
  public static final int  CstRyPoppry000276_ListDispCnt01 = 100;      /**  ���Ѷ����ϰ�������̥ơ��֥� */
  public static final int  CstRyPoppry000283_ListDispCnt01 = 100;      /**  Ķ���פ�������������������� */
  public static final int  CstRyPoppry000219_ListDispCnt01 = 100;     /**  ��������������������� */
  public static final int  CstRyPoppry000219_ListDispCnt02 = 100;      /**  ��������������������� */
  public static final int  CstRyWinpry010043_ListDispCnt01 = 30;       /**  ������ֲ������򡦤��Ҥ����������ξ������̡ʻ��θ��������� */
  /** Rev.i16 Mod Start */
/**   public static final int  CstRyWinpry010043_ListDispCnt02 = 1500;     // ������ֲ������򡦤��Ҥ����������ξ������̡ʻ��η�̾������ */
  public static final int  CstRyWinpry010043_ListDispCnt02 = 3000;     /**  ������ֲ������򡦤��Ҥ����������ξ������̡ʻ��η�̾������ */
  /** Rev.i16 Mod End */
  /** Rev.i08 Add End */

  public static final int  CstRySubpry000110_ListDispCnt01 = 1000;     /**  Ĵ������������� */
  public static final int  CstRySubpry000111_ListDispCnt01 = 1000;     /**  ���Ѿ���������֥ѥͥ���� */
  public static final int  CstRySubpry000145_ListDispCnt01 = 180;   /**  ��������������(��������ή����)(��̾�����ơ��֥�) */
  public static final int  CstRySubpry000145_ListDispCnt02 = 200;      /**  ��������������(��������ή����)(������̾�����ơ��֥�) */
  public static final int  CstRySubpry000146_ListDispCnt01 = 181807;   /**  ��������������(��������ή����)(��̾�����ơ��֥�) */
  public static final int  CstRySubpry000146_ListDispCnt02 = 300;      /**  ��������������(��������ή����)(������̾�����ơ��֥�) */
  public static final int  CstRySubpry000148_ListDispCnt01 = 200;      /**  �����ŵ���̾���򥵥֥ѥͥ���� */
  /** Rev.i08 Add Start */
  public static final int  CstRySubpry000150_ListDispCnt01 = 200;      /**  ��ü���θ�ƻ����������掠�֥ѥͥ����(��̾�����ơ��֥�) */
  public static final int  CstRySubpry000151_ListDispCnt01 = 200;      /**  ����������ư���긡����掠�֥ѥͥ����(��̾�����ơ��֥�) */
  public static final int  CstRySubpry000151_ListDispCnt02 = 100;      /**  ����������ư���긡����掠�֥ѥͥ����(���ֵ��������ơ��֥�) */
  public static final int  CstRySubpry000152_ListDispCnt01 = 100;      /**  ����Ƚ��ޥȥꥯ��������� */
  public static final int  CstRySubpry000152_ListDispCnt02 = 100;      /**  ����Ƚ��ޥȥꥯ��������� */
  public static final int  CstRySubpry000171_ListDispCnt01 = 800;      /**  �����ϰ踡����掠�֥ѥͥ���� */
  /** Rev.i08 Add End */
  /**  �ᥤ����̥ԥ�����̾ */
  public static final String  CstRyWinpry000001 = "Winpry000001";  /**  �������η�̾���� ���� */
  public static final String  CstRyWinpry000002 = "Winpry000002";  /**  �������ξ��� ���� */
  public static final String  CstRyWinpry000003 = "Winpry000003";  /**  �����پ���� ���� */
  public static final String  CstRyWinpry000004 = "Winpry000004";  /**  �����ۿ��������� ���� */
  public static final String  CstRyWinpry000005 = "Winpry000005";  /**  �����ù���ײ���߼��Ӱ��� ���� */
  public static final String  CstRyWinpry000006 = "Winpry000006";  /**  ������������������� ���� */
  public static final String  CstRyWinpry000007 = "Winpry000007";  /**  ��������®�� ���� */
  public static final String  CstRyWinpry000008 = "Winpry000008";  /**  �ƣ���������������� */
  public static final String  CstRyWinpry000009 = "Winpry000009";  /**  ����®���õ��������� ���� */
  public static final String  CstRyWinpry000010 = "Winpry000010";  /**  Ĵ��������Ư������������ */
  public static final String  CstRyWinpry000011 = "Winpry000011";  /**  ���Ѿ���������� */
  public static final String  CstRyWinpry000040 = "Winpry000040";  /**  �������η�̾���� */
  public static final String  CstRyWinpry000041 = "Winpry000041";  /**  ��������������ξ������� */
  public static final String  CstRyWinpry000042 = "Winpry000042";  /**  ����־�̷������ξ������� */
  public static final String  CstRyWinpry000043 = "Winpry000043";  /**  ������ַ������ξ������� */
  public static final String  CstRyWinpry000044 = "Winpry000044";  /**  �����پ�������� */
  public static final String  CstRyWinpry000045 = "Winpry000045";  /**  ��������®����� */
  public static final String  CstRyWinpry000046 = "Winpry000046";  /**  �����ۿ������������� */
  public static final String  CstRyWinpry000047 = "Winpry000047";  /**  �����ù���ײ���߼��Ӱ������� */
  public static final String  CstRyWinpry000048 = "Winpry000048";  /**  ������������������ֲ��� */
  public static final String  CstRyWinpry000049 = "Winpry000049";  /**  ��������®���õ������������ */
  public static final String  CstRyWinpry000050 = "Winpry000050";  /**  ��������������ή�������� */
  public static final String  CstRyWinpry000051 = "Winpry000051";  /**  ��������������ή������� */
  public static final String  CstRyWinpry000052 = "Winpry000052";  /**  ���������Υȥ�å״������� */
  public static final String  CstRyWinpry000053 = "Winpry000053";  /**  ���ž����å��������� */
  public static final String  CstRyWinpry000054 = "Winpry000054";  /**  �����������Ž�������� */
  public static final String  CstRyWinpry000055 = "Winpry000055";  /**  ���������������������� */
  public static final String  CstRyWinpry000056 = "Winpry000056";  /**  ��ư�ϵ��¹�������ϩ���ֲ��� */
  public static final String  CstRyWinpry010004 = "Winpry010004";  /**  ����FAX������������� */
  public static final String  CstRyWinpry010006 = "Winpry010006";  /**  ������ʬ�����ޥ�����ȥ���� */
  public static final String  CstRyWinpry010007 = "Winpry010007";  /**  ��������®���õ������������ */
  public static final String  CstRyWinpry010045 = "Winpry010045";  /**  ��������®���õ������������ */
  public static final String  CstRyWinpry010046 = "Winpry010046";  /**  ����FAX������������� */
  public static final String  CstRyWinpry010048 = "Winpry010048";  /**  ������ʬ�����ޥ�����ȥ���� */
  public static final String  CstRyWinpry020006 = "Winpry020006";  /**  ����ñ�������ޥ�����ȥ���� */
  public static final String  CstRyWinpry020048 = "Winpry020048";  /**  ����ñ�������ޡ�22kV�����ޥ�����ȥ���� */
  public static final String  CstRyWinpry030006 = "Winpry030006";  /**  Ĵ��������Ư������������ */

  /** Rev.i05 Add Start */
  public static final String  CstRyWinpry000030 = "Winpry000030";  /**  ���ѵ�Ͽ�����Ž�˲��� */
  /** Rev.i05 Add End */
  /** Rev.i08 Add Start */
  public static final String  CstRyWinpry000057 = "Winpry000057";  /**  ̤ü���θ�ƻ�������� */
  public static final String  CstRyWinpry000058 = "Winpry000058";  /**  �����Ѳ���������ư������� */
  public static final String  CstRyWinpry000059 = "Winpry000059";  /**  ���������������Ƚ��ޥȥꥯ������ */
  public static final String  CstRyWinpry000060 = "Winpry000060";  /**  ����־�̷�������Ƚ��ޥȥꥯ������ */
  public static final String  CstRyWinpry000061 = "Winpry000061";  /**  ������ַ�������Ƚ��ޥȥꥯ������ */
  public static final String  CstRyWinpry010043 = "Winpry010043";  /**  ������ֲ������򡦤��Ҥ����������ξ������� */
  public static final String  CstRyWinpry000073 = "Winpry000073";  /**  ���Ѷ����ϰ����� ���� */
  public static final String  CstRyWinpry020004 = "Winpry020004";  /**  �ƣ���������̥�ݡ��Ȱ������� */
  public static final String  CstRyWinpry020046 = "Winpry020046";  /**  �ƣ���������̥�ݡ��Ȱ������� */
  /** Rev.i08 Add End */
  /** Rev.i15 Add Start */
  public static final String  CstRyWinpry000062 = "Winpry000062";  /**  ���δ�Ϣ�ݥ��������� */
  /** Rev.i46 Mod Start */
/**   public static final String  CstRyWinpry000063 = "Winpry000063";  // �ƥ��ȥǡ����������� */
  public static final String  CstRyWinpry010053 = "Winpry010053";  /**  �ƥ��ȥǡ����������� */
  /** Rev.i46 Mod End */
  public static final String  CstRyWinpry000064 = "Winpry000064";  /**  ��������Ƚ���������������� */
  /** Rev.i15 Add End */
  /** ������ȥ��̳ */
  public static final String  CstRyWinpdy000001 = "Winpdy000001";  /**  ��ʬ�����޲��� */
  public static final String  CstRyWinpdy000002 = "Winpdy000002";  /**  ñ�������޲��� */
  public static final String  CstRyWinpdy000003 = "Winpdy000003";  /**  �������޲��� */
  public static final String  CstRyWinpdy000008 = "Winpdy000008";  /**  ������ϩ�� */
  public static final String  CstRyWinpcy000021 = "Winpcy000021";  /**  ���ѵ�Ͽ�����Ž�˲��� */

  /** �����������̥ԥ�����̾ */
  public static final String  CstRyPoppry000200 = "Poppry000200";  /**  �ù���ײ���������������� */
  public static final String  CstRyPoppry000201 = "Poppry000201";  /**  ����ȯ���Ը����� ������������ */
  public static final String  CstRyPoppry000202 = "Poppry000202";  /**  ������������������������� */
  public static final String  CstRyPoppry000203 = "Poppry000203";  /**  �������ξ���������������������� */
  public static final String  CstRyPoppry000205 = "Poppry000205";  /**  ����������� ������������ */
  public static final String  CstRyPoppry000208 = "Poppry000208";  /**  ��̾��������������� */
  public static final String  CstRyPoppry000204 = "Poppry000204";  /**  ����������������������� */
  public static final String  CstRyPoppry000206 = "Poppry000206";  /**  Ĭή�ް�����ǧ������������ */
  public static final String  CstRyPoppry000207 = "Poppry000207";  /**  �پ�������� ������������ */
  public static final String  CstRyPoppry000209 = "Poppry000209";  /**  ��̾�Ѵ���������������� */
  public static final String  CstRyPoppry000210 = "Poppry000210";  /**  �������Ƶ�Ͽ��������������� */
  public static final String  CstRyPoppry000211 = "Poppry000211";  /**  �ݰ·״���������������� */
  public static final String  CstRyPoppry000240 = "Poppry000240";  /**  �������η�̾���������������� */
  public static final String  CstRyPoppry000241 = "Poppry000241";  /**  �ȥ�å״�����ǧ������������ */
  public static final String  CstRyPoppry000242 = "Poppry000242";  /**  ������λ��������������� */
  public static final String  CstRyPoppry000243 = "Poppry000243";  /**  �ƻ��оݳ�ǧ������������ */
  public static final String  CstRyPoppry000244 = "Poppry000244";  /**  �������ξ���������������������� */
  public static final String  CstRyPoppry000245 = "Poppry000245";  /**  ���š����줪�Ҥ��ް��������������� */
  public static final String  CstRyPoppry000246 = "Poppry000246";  /**  ������������������������� */
  public static final String  CstRyPoppry000247 = "Poppry000247";  /**  �ȥ�å״��������������� */
  public static final String  CstRyPoppry000248 = "Poppry000248";  /**  �������Ƶ�Ͽ������������ */
  public static final String  CstRyPoppry000249 = "Poppry000249";  /**  �ݰ·״�ؼ����� */
  public static final String  CstRyPoppry000250 = "Poppry000250";  /**  ��̾�ɲå����������� */
  /** Rev.03 Add Start */
  public static final String  CstRyPoppry000251 = "Poppry000251";  /**  �����������������ȥ�� */
  /** Rev.03 Add End */
  /** Rev.i07 Add Start */
  public static final String  CstRyPoppry000252 = "Poppry000252";  /**  �����������������ȥ��Pic_1 */
  public static final String  CstRyPoppry000253 = "Poppry000253";  /**  �����������������ȥ��Pic_2 */
  public static final String  CstRyPoppry000254 = "Poppry000254";  /**  �����������������ȥ��Pic_3 */
  /** Rev.i07 Add End */
  /**  Rev.i12 Add Start */
  public static final String  CstRyPoppry000259 = "Poppry000259";  /**  ���������������Ƚ��������������� */
/**   public static final String  CstRyPoppry000260 = "Poppry000260";  // ����־�̷�������Ƚ��������������� */
  public static final String  CstRyPoppry000261 = "Poppry000261";  /**  XXXXXX����Ƚ��������������� */
  public static final String  CstRyPoppry000262 = "Poppry000262";  /**  XXXXXXX�������� */
  public static final String  CstRyPoppry000263 = "Poppry000263";  /**  XXXXXXX�������� */
  /**  Rev.i12 Add End */
  /**  Revi15 Add Start */
  public static final String  CstRyPoppry000264 = "Poppry000264";  /**  �����������ư��ư��ǧ������������ */
  public static final String  CstRyPoppry000265 = "Poppry000265";  /**  ���δ�Ϣ�ݥ��������������������� */
  public static final String  CstRyPoppry000266 = "Poppry000266";  /**  ��������������������� */
  /**  Revi15 Add End */
  public static final String  CstRyPoppry000273 = "Poppry000273";  /**  �ۿ����������������� */
  public static final String  CstRyPoppry000274 = "Poppry000274";  /**  �������ϥ����������� */
  public static final String  CstRyPoppry000275 = "Poppry000275";  /**  ����̾����������������� */

  public static final String  CstRyPoppry000278 = "Poppry000278";  /**  ���ե饤��ԣ�����ʥ��֡� */
  public static final String  CstRyPoppry000281 = "Poppry000281";  /**  �׻������������������ */
  public static final String  CstRyPoppry000282 = "Poppry000282";  /**  ���η�̾��������������� */
  /** Rev.i08 Add Start */
  public static final String  CstRyPoppry000217 = "Poppry000217";  /**  ȯ�ŵ���������������� */
  public static final String  CstRyPoppry000218 = "Poppry000218";  /**  ���ײ���������������� */
  public static final String  CstRyPoppry000219 = "Poppry000219";  /**  ��������������������� */
  /** Rev.i25 Add Start */
  public static final String  CstRyPoppry000222 = "Poppry000222";  /**  ���ѥХ���������������� */
  /** Rev.i25 Add End */
  public static final String  CstRyPoppry000256 = "Poppry000256";  /**  ����������ư������������������� */
  public static final String  CstRyPoppry000260 = "Poppry000260";  /**  ������֡���ϩ���Ĵ����ǧ������������ */
  public static final String  CstRyPoppry000276 = "Poppry000276";  /**  ���Ѷ����ϰ���������������� */
  public static final String  CstRyPoppry000283 = "Poppry000283";  /**  Ķ���פ�������������������� */
  public static final String  CstRyPoppry000284 = "Poppry000284";  /**  ����®���������᡼�������������� */
  public static final String  CstRyPoppry000220 = "Poppry000220";  /**  �õ�������������������� */
  /** Rev.i08 Add End */
  /**  ���ֲ��̥ԥ�����̾ */
  public static final String  CstRySubpry000101 = "Subpry000101";  /**  �������η�̾�������֥ѥͥ���� */
  public static final String  CstRySubpry000102 = "Subpry000102";  /**  �����������ܥ��֥ѥͥ���� */
  public static final String  CstRySubpry000104 = "Subpry000104";  /**  ���η�̾�������(�õ��ʤ�)���֥ѥͥ���� */
  public static final String  CstRySubpry000106 = "Subpry000106";  /**  ������������������֥ѥͥ���� */
  public static final String  CstRySubpry000110 = "Subpry000110";  /**  Ĵ������������� */
  public static final String  CstRySubpry000111 = "Subpry000111";  /**  ���Ѿ���������֥ѥͥ���� */
  public static final String  CstRySubpry000141 = "Subpry000141";  /**  �������η�̾�������֥ѥͥ���� */
  public static final String  CstRySubpry000142 = "Subpry000142";  /**  �����������ܥ��֥ѥͥ���� */
  public static final String  CstRySubpry000143 = "Subpry000143";  /**  �����ۿ������������֥ѥͥ���� */
  public static final String  CstRySubpry000144 = "Subpry000144";  /**  ������������������֥ѥͥ���� */
  public static final String  CstRySubpry000145 = "Subpry000145";  /**  ��������������ή�������֥ѥͥ���� */
  public static final String  CstRySubpry000146 = "Subpry000146";  /**  ���������������ʻ�������ή����� */
  public static final String  CstRySubpry000147 = "Subpry000147";  /**  ���������Υȥ�å״������֥ѥͥ���� */
  public static final String  CstRySubpry000148 = "Subpry000148";  /**  �����ŵ���̾���򥵥֥ѥͥ���� */
  /** Rev.i05 Add Start */
  public static final String  CstRySubpry000131 = "Subpry000131";  /**  ���ѵ�Ͽ�����Ž�˥��֥ѥͥ���� */
  public static final String  CstRySubpry000149 = "Subpry000149";  /**  ñ�������ޥ��֥ѥͥ���� */
  /** Rev.i05 Add End */
  /** Rev.i08 Add Start */
  public static final String  CstRySubpry000150 = "Subpry000150";  /**  ��ü���θ�ƻ����������掠�֥ѥͥ���� */
  public static final String  CstRySubpry000151 = "Subpry000151";  /**  ����������ư���긡����掠�֥ѥͥ���� */
  public static final String  CstRySubpry000152 = "Subpry000152";  /**  ����Ƚ��ޥȥꥯ��������掠�֥ѥͥ���� */
  /** Rev.i29 Add Start */
  public static final String  CstRySubpry000153 = "Subpry000153";  /**  6Kv��̻���Ƚ��ޥȥꥯ��������掠�֥ѥͥ���� */
  /** Rev.i29 Add End */
  /** Rev.i31 Add Start */
  public static final String  CstRySubpry000154 = "Subpry000154";  /**  22Kv��������Ƚ��ޥȥꥯ��������掠�֥ѥͥ���� */
  /** Rev.i31 Add End */
  /** Rev.i30 Add Start */
  public static final String  CstRySubpry000155 = "Subpry000155";  /**  ���δ�Ϣ�ݥ�����󸡺���掠�֥ѥͥ���� */
  /** Rev.i30 Add End */
  public static final String  CstRySubpry000171 = "Subpry000171";  /**  �����ϰ踡����掠�֥ѥͥ���� */
  /** Rev.i08 Add End */
  /**  ���� */
  public static final int CstRyCrntTrmPeriod_CurrentTerm      = 1;  /**  ���� */
  public static final int CstRyCrntTrmPeriod_PreviousTerm     = 2;  /**  ���� */
  public static final int CstRyCrntTrmPeriod_BefSecndTerm     = 3;  /**  ������ */

  public static final String[] CstRyCrntTrmPeriodStr    = new String[]{"����", "����", "������"};
  /** Rev.i19 Add Start */
  /** �٤����������μ�ư���쵡ǽ��å����� */
  public static final int CstRyMTZidoufukyuStatus_use      = 1;  /**  ���� */
  public static final int CstRyMTZidoufukyuStatus_Lockyu     = 2;  /**  ��å���¾�ɳ�������ͭ���� */
  public static final int CstRyMTZidoufukyuStatus_Lockmu     = 3;  /**  ��å���¾�ɳ�������̵���� */

  public static final String[] CstRyMTZidoufukyuStatusStr    = new String[]{"����", "��å���¾�ɳ�������ͭ����", "��å���¾�ɳ�������̵����"};
  /** Rev.i19 Add End */
  /**  ������ʬ */
  public static final int CstRyManagementDivision_FdrLin   = 1; /**  ������ */
  public static final int CstRyManagementDivision_6kV       = 2; /**  6kV��� */
  public static final int CstRyManagementDivision_22kV      = 3; /**  22kV */
  public static final int CstRyManagementDivision_RelatedPos = 4; /**  ���δ�Ϣ�ݥ������  // Rev.i21 Add */

  public static final String[] CstRyManagementDivisionStr = new String[]{"","������","6kV���","22kV"};

  /**  �ղ������� */
  public static final int CstRyBtnKindOK = 1;
  public static final int CstRyBtnKindCancel = 0;

  /**  �����ʬ */
  public static final String CstRyTokuteiMu = "̵��";
  public static final String CstRyTokuteiYu = "ͭ��";

  /**  �����ʬ */
  public static final int CstRyPatternFlgMu = 0;  /**  ̵�� */
  public static final int CstRyPatternFlgYu = 1;  /**  ͭ�� */

  public static final String[]CstRyPatternFlgStr = new String[]{"̵��","ͭ��"};

  /**  �����������ե饰 */
  public static final int CstRyKeisei = 0;  /**  ���� */
  public static final int CstRyHaisei = 1;  /**  ���� */

  /**  ���ζ�ʬ */
  public static final int CstRyTrblDivisionSerious = 1;       /**  ������� */
  public static final int CstRyTrblDivisionGeneral = 2;       /**  ���̻��� */
  public static final int CstRyTrblDivisionSystem = 3;        /**  �������� */
  public static final int CstRyTrblDivisionNuclearPower = 4;  /**  �����Ͼ��� */
  public static final int CstRyTrblDivisionOtherCompany = 5;  /**  ¾�Ҿ��� */
  public static final int CstRyTrblDivisionVoltageDown = 6;   /**  �ֻ��Ű��㲼 */

  public static final String[] CstTrblDivisionStr = new String[]{"","�������","���̻���","��������","�����Ͼ���","¾�Ҿ���","�ֻ��Ű��㲼"};

  /**  ����®���å������������� */
  public static final int CstRyMsgSendStateinit = 0;    /**  ����� */
  public static final int CstRyMsgSendStateComp = 1;    /**  ������ */
  public static final int CstRyMsgSendStateNotSend = 2; /**  ̤���� */
  public static final int CstRyMsgSendStateSend = 3;    /**  ������ */
  public static final int CstRyMsgSendStateFailure = 4; /**  �������� */

  public static final String[] CstRyMsgSendStateStr = new String[]{"","������","̤����","������","��������"};

  /**  ����®��FAX�������� */
  public static final int CstRyFaxSendStateinit = 0;    /**  ����� */
  public static final int CstRyFaxSendStateComp = 1;    /**  ������ */
  public static final int CstRyFaxSendStateNotSend = 2; /**  ̤���� */
  public static final int CstRyFaxSendStateSend = 3;    /**  ������ */
  public static final int CstRyFaxSendStateFailure = 4; /**  �������� */
  public static final int CstRyFaxSendStateLock = 5;    /**  ��å��� */

  public static final String[] CstRyFaxSendStateStr = new String[]{"","������","̤����","������","��������","��å���"};

/**  Rev.i35 Add Start */
  /**  �����׵���� */
  public static final int CstRyReqInf5= 5;    /**  ���ξ��󹹿��׵��� */
/**  Rev.i35 Add End */

  /**  ��������®��(����ȥ�) */
  public static final int CstRyIntraSendStateinit = 0;    /**  ����� */
  public static final int CstRyIntraSendStateComp = 1;    /**  ������ */
  public static final int CstRyIntraSendStateNotSend = 2; /**  ̤���� */
  public static final int CstRyIntraSendStateSend = 3;    /**  ������ */
  public static final int CstRyIntraSendStateFailure = 4; /**  �������� */
  public static final int CstRyIntraSendStateLock = 5;    /**  ��å��� */
  public static final int CstRyIntraSendDeleteFailure = 6; /**  ����� */

  public static final String[] CstRyIntraSendStateStr = new String[]{"","������","̤����","������","��������","��å���","�����"};


  /** �ۿ��������������������� */
  public static final int CstRyRcSendStsComp = 1;      /**  ������ */
  public static final int CstRyRcSendStsFailure = 3;   /**  �������� */

  public static final String[] CstRyRcSendStsStr = new String[] { "", "������", "", "��������" };

  /**  ��������� */
  public static final int CstRySendDestInfo_Fax = 1;    /**  ����®��FAX */
  public static final int CstRySendDestInfo_Msg = 2;    /**  ����®���å����� */
  public static final int CstRySendDestInfo_Auto = 3;   /**  ��ư����(�������ť��롼��) */
  public static final int CstRySendDestInfo_Intra = 4;  /**  ��������®��(����ȥ�) */
  public static final int CstRySendDestInfo_XML = 6;    /**  ����®��XML */

  /** public static final String[] CstRySendInfoStr = new String[]{"","����®��","����®��","��ư����","����ȥ�"}; */
  public static final String[] CstRySendInfoStr = new String[]{"","����®��","����®��","��ư����","����ȥ�","","����®��"};
  public static final String[] CstRySendDestStr = new String[]{"","�ƣ���Ʊ�󥰥롼�ץ�����","��ϵ륷���ƥ�","�У���ü","����ȥ饷���ƥ�"};

  /**  ��N�� */
  public static final String CstRySendRepNo = "��N��";

  /**  ��� */
  public static final String CstRyDelete = "���";

  /**  Ķ�� */
  public static final String CstRySuperHeavey = "Ķ��";

  /**  �ǡ��������� */
  public static final String CstRyShomeiStr = "��̾";

  /**  �ǡ��������� */
  public static final String CstRyHaidenStr = "������̾";

  /**  �ǡ��������� */
  public static final String CstRySetteiStr = "�����ʬ";

  /**  �ǡ��������� */
  public static final int CstRyDataAcqstnDstntn_Online = 0;
  public static final int CstRyDataAcqstnDstntn = 1;

  /** PV�û� */
  public static final int CstRyPVAddition_True = 1;
  public static final int CstRyPVAddition_False = 0;

  /** ����ͭ�� */
  public static final int CstRyPattern_True = 1;
  public static final int CstRyPattern_False = 0;

  /**  ��٥�ǥ� */
  public static final int CstRyFukaModel_Weekday1 = 1;  /**  ʿ���� */
  public static final int CstRyFukaModel_Weekday2 = 2;  /**  ʿ���� */
  public static final int CstRyFukaModel_Weekday3 = 3;  /**  ʿ���� */
  public static final int CstRyFukaModel_saturday = 4;  /**  ������ */
  public static final int CstRyFukaModel_Sunday = 5;    /**  ������ */

  public static final String[] CstRyFukaModelStr = new String[]{"","ʿ����","ʿ����","ʿ����","������","������"};
  public static final String[] CstRyFukaModelKey = new String[]{"","RETA","RETB","RETC","RETD","RETE"};

  /**  ����ϩ�ңټ�ư��å� */
  public static final int CstRyAutoReclosureStatus_True = 1; /** ͭ�� */
  public static final int CstRyAutoReclosureStatus_False = 0; /** ̵�� */

  public static final String[] CstRyAutoReclosureStatusStr = new String[]{"����ϩ�ңټ�ư��å�̵��","����ϩ�ңټ�ư��å�ͭ��"};

  /**  ����ϩRY���� */
  public static final int CstRyReclosureStatus_True = 1; /** ���� */

  public static final String CstRyReclosureStatusStr = "����";

  /** Rev.i27 Add Start */
  public static final String CstRyLockStatusStr = "��å�";
  /** Rev.i27 Add End */

  /**  �ȥ�å�ȯ������ */
  public static final String CstRyTripOccTim = "�ȥ�å�ȯ������";

  /**  ��å����� */
  public static final int CstRyLockStatus_True = 1;
  public static final int CstRyLockStatus_False = 0;

  /**  ��å����� */
  public static final String CstRyLockStatus = "��å�����";
  /**  ��å��� */
  public static final String CstRyLock = "��å���";
  /**  �ȥ�å״������� */
  public static final String CstRyTripMngState = "�ȥ�å״�������";

  /**  ������� */
  public static final int CstRyOprHistory_1 = 1; /** ��ư����ϩ��å� */
  public static final int CstRyOprHistory_2 = 2; /** ��å����ͭ */
  public static final int CstRyOprHistory_3 = 3; /** ��å����̵ */
  public static final int CstRyOprHistory_4 = 4; /** ���Ѹ��� */
  public static final int CstRyOprHistory_5 = 5; /** ���۾ｪλ */

  public static final String[] CstRyOprHistoryStr = new String[]{"","��ư����ϩ��å�","��å����ͭ","��å����̵","���Ѹ���","���۾ｪλ"};

  /**  �ȥ�å״������� */
  public static final int CstRyTripMngState_True = 1; /** ������ */
  public static final int CstRyTripMngState_False = 0; /** �����оݳ� */

  public static final String[] CstRyTripMngStateStr = new String[]{"�����оݳ�","������"};

  /**  ��å������ǽ���� */
  public static final int CstRyLockAbleState_True = 1; /** ��å������ǽ */

  /**  �ȥ�å״��� */
  public static final int CstRyRimitRY =10;   /**  ��ư����ϩRY��å�����ξ�� */
  public static final int CstRyRimitTrip =10; /**  ��å����������ȥ�åײ���ξ�� */
  public static final int CstRyRimitMM =99;   /**  �������֤λ��֤ξ�� */
  public static final int CstRyRimitSS =59;   /**  �������֤�ʬ�ξ�� */
  public static final int CstRyReqReMode =61;   /**  �׵���̡�����⡼�������׵� */
  public static final int CstRyReqKind =62;   /**  �׵���� */

  /**  ���塼�μ��̥����� */
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
  public static final int CstRyQueKind92 = 92;  /**  ���֥ե�å�����׵� */
/** Rev.i32 Add End */
/** Rev.i36 Add Start */
  public static final int CstRyQueKind93 = 93;  /**  ���ֽ���ɽ������׵� */
/** Rev.i36 Add End */
  /** Rev.i09 Add Start */
  public static final int CstRyQueKind101 = 101;
/**  Rev.i037 Add Start */

  /**  �����׵���� */
  public static final int CstRySubReqKind4 =4;  /**  ���������������Ƚ��ޥȥꥯ�� */
  public static final int CstRySubReqKind5 =5;  /**  ����־�̷�������Ƚ��ޥȥꥯ�� */
  public static final int CstRySubReqKind6 =6;  /**  ������ַ�������Ƚ��ޥȥꥯ�� */
  public static final int CstRySubReqKind7 =7;  /**  ���δ�Ϣ�ݥ������ */
/**  Rev.i037 Add End */

  /**  �������� */
  public static final int CstRySendKind_Initial = 0; /**  ����� */
  public static final int CstRySendKind_Auto = 1;    /**  ��ư */
  public static final int CstRySendKind_Manual = 2;  /**  ��ư */

  /**  ��ư�������� */
  public static final int CstRyManuSendKind1 = 1; /**  ����ȥ飱�� */
  public static final int CstRyManuSendKind2 = 2; /**  ����ȥ飲�� */
  public static final int CstRyManuSendKind3 = 3; /**  ����ȥ飳�� */
  public static final int CstRyManuSendKind4 = 4; /**  ��ư���� */
  public static final int CstRyManuSendKind5 = 5; /**  ��å����� */
  public static final int CstRyManuSendKind6 = 6; /**  DWH(csv) */
  public static final int CstRyManuSendKind7 = 7; /**  FAX��DWH(pdf) */
  public static final int CstRyManuSendKind8 = 8; /**  ����ȥ��� */
  public static final int CstRyManuSendKind9 = 9; /**  �ƥ��ȥǡ������� */

  /**  �����оݼ��� */
  public static final int CstRyPrintKind1  = 1;  /**  ���η�̾����             (����) */
  public static final int CstRyPrintKind2  = 2;  /**  �������Ƶ�Ͽ             (����) */
  public static final int CstRyPrintKind3  = 3;  /**  ������������             (����) */
  public static final int CstRyPrintKind4  = 4;  /**  �ݰ·״�ؼ���������     (����) */
  public static final int CstRyPrintKind5  = 5;  /**  ����پ����             (����������) */
  public static final int CstRyPrintKind6  = 6;  /**  ȯ�Żپ����             (����������) */
  public static final int CstRyPrintKind7  = 7;  /**  �ù���ײ���߼��Ӱ���   (����������) */
  public static final int CstRyPrintKind8  = 8;  /**  ����®��                 (����������) */
  public static final int CstRyPrintKind9  = 9;  /**  ����������               (����) */
  public static final int CstRyPrintKind10 = 10; /**  ���θ����              (����) */
  public static final int CstRyPrintKind11 = 11; /**  ��ư������裱���      (����) */
  public static final int CstRyPrintKind12 = 12; /**  ��ư������裲���      (����) */
  public static final int CstRyPrintKind13 = 13; /**  ��ư������裳���      (����) */
  public static final int CstRyPrintKind14 = 14; /**  ���š����줪�Ҥ��ް���  (����) */
  public static final int CstRyPrintKind15 = 15; /**  ���������ɽ          (����) */
  public static final int CstRyPrintKind16 = 16; /**  ��������ή����          (����) */
  public static final int CstRyPrintKind17 = 17; /**  ������������������      (����) */

  /**  �ƻ륹�ơ����� */
  public static final String CstRyStatusMishori = "̤����";
  public static final String CstRyStatusShorichuu = "������";
  public static final String CstRyStatusChuushichuu = "�����";

  /**  �װ� */
  public static final String CstRyFactor = "����";

  /**  �����о� */
  public static final int CstRyPrintTagetFalse = 0; /**  �оݳ� */
  public static final int CstRyPrintTagetTrue = 1;  /**  �о� */

  public static final String[] CstRyPrintTarget = new String[]{"�оݳ�",""};

  /**  ���ե饤��ԣͥХ������� */
  public static final String CstRyWinpry000070Bias = "0.1";
  public static final String CstRyWinpry100001Bias = "0.1";

  /**  ��̾�ɲý������ */
  public static final int CstRyNNoake = 0;        /** �̾�ɽ�� */
  public static final int CstRyNewMakeNormal = 1; /** �����ɲ����� */
  public static final int CstRyNewMakeErr = 2;    /** �����ɲå��顼 */
  public static final int CstRyNewMakeCancel = 3; /** �����ɲå���󥻥� */

  /**  ������ */
  public static final int CstRynTblRmPictureBef = 1; /** ������������ */
  public static final int CstRynTblRmPictureAft = 2; /** ���θ������ */
  public static final int CstRynTblRmPictureAll = 3; /** �������� */

  /**  �����Ű��Ͱ۾� */
  public static final int CstRyZPhsVoltAbn = 0;   /** ������ */
  public static final int CstRyZPhsVoltAbnErr = 1;/** �۾��� */

  /**  �����Ű��� */
  public static final String CstRyZPhsVoltAbnErrStr = "E0.0";

  /**  �������� */
  public static final int CstRyManageSituation_Kanrichu = 0;  /**  ������ */
  public static final int CstRyManageSituation_Kanriend =  1;  /**  ������λ */

  public static final String[] CstRyManagemenSituationStr = new String[]{"������","������λ"};

  /**  ư��RY */
  public static final int CstRyOperateRYOCR    = 1;  /**  OCR */
  public static final int CstRyOperateRYDGR    = 2;  /**  DGR */
  public static final int CstRyOperateRYOCRDGR = 3;  /**  OCR��DGR */

  public static final String[] CstRyOperateStr = new String[]{"","�ϣã�","�ģǣ�","�ϣã�\n�ģǣ�"};
  public static final String[] CstRyOperateStr2 = new String[]{"","�ϣã�","�ģǣ�","�ϣãҡ��ģǣ�"};

  /**  �������η�̾�������� �ȥ���ܥ������ */
  public static final int CstRyToggleButton_Haiden = 0; /**  ��������ư����ܥ��� */
  public static final int CstRyToggleButton_Jyoui = 1;  /**  ��kV��̷�����ư����ܥ��� */

  /**  �������η�̾�������� �ȥ���ܥ���ɽ��̾�� */
  public static final String CstRyToggleButton_Haiden_Yu = "��������ư����\r\nͭ��";
  public static final String CstRyToggleButton_Haiden_Mu = "��������ư����\r\n̵��";
  public static final String CstRyToggleButton_Jyoui_Yu = "6KV��̷���\r\n��ư����ͭ��";
  public static final String CstRyToggleButton_Jyoui_Mu = "6KV��̷���\r\n��ư����̵��";

  /**  ��������®����� */
  public static final String CstRyReason ="Ĵ����";

  /** �������츫�̤������ꥹ�� */
  public static final String[] CstRyResPrspctStn = new String[]{"̤��","���츫��","�������촰λ"};

  /** ���ζ�ʬ�ꥹ�� */
  public static final String[] CstRyDivisionStr = new String[]{"�������","���̻���","��������","�����Ͼ���","¾�Ҿ���"};

  /**  ��������ư���졦��kV��̷�����ư������� */
  public static final int CstRyRestorationYu = 1; /**  ͭ�� */
  public static final int CstRyRestorationMu = 0; /**  ̵�� */

  /**  FAX��ư����̵ͭ */
  public static final int CstRyFaxAutoSendYu = 1;
  public static final int CstRyFaxAutoSendMu = 0;

  /**  �ۿ������������� �ȥ���ܥ���ɽ��̾�� */
  public static final String CstRyToggleButton_Fax_Yu = "FAX��ư����ͭ��";
  public static final String CstRyToggleButton_Fax_Mu = "FAX��ư����̵��";
  /** Rev.i08 Add Start */
  /**  �ۿ������������� �ȥ���ܥ���ɽ��̾�� */
  public static final String CstRyToggleButton_Xml_Yu = "XML������å����";
  public static final String CstRyToggleButton_Xml_Mu = "XML������å�";
  /**  XML�������ơ����� */
  public static final int CstRyXmlModeSt_Mu = 3; /**  XML������å� */
  public static final int CstRyXmlModeSt_Yu = 4; /**  XML������å���� */
  /** Rev.i08 Add End */

  /**  ͻ���������� */
  public static final int CstRyFlxbDstnFeederLine0 = 0; /**  ���������� */
  public static final int CstRyFlxbDstnFeederLine1 = 1; /**  ͻ���������� */

  /**  ���Ѹ����ʳ� */
  public static final int CstRyStChgStage1 = 1; /** ��1�ʳ� */
  public static final int CstRyStChgStage2 = 2; /** ��2�ʳ� */
  public static final int CstRyStChgStage3 = 3; /** ��3�ʳ� */
  public static final int CstRyStChgStage4 = 4; /** �ǽ����� */

  /** Rev.i11 Mod Start */
  /** 6KV���Ѹ����ʳ� */
  public static final String[] CstRyFdrLnTrblKindStr3 = new String[] { "","��1�ʳ�",
      "��2�ʳ�","��3�ʳ�", "�ǽ�����"};

  /** 6KV���μ��� */
  public static final String[] CstRyFdrLnTrblKindStr4 = new String[] { "","�Ÿ�",
      "�Х�", "����","����","����"};

  /** ���� */
  public static final String CstRyHaidenteiden = "����";

  /** �����ܺ����å���� */
  public static final String CstRyHaidenkuukann = "�����ܺ����å����";

  /** �����ܺ����å���֡�̵ */
  public static final String CstRyHaidennasi = "̵";

  /** 6KV���ʼ��� */
  public static final String[] CstRyFdrLnTrblKindStr5 = new String[] { "","","",
      "������", "����","�������","�����������"};

  /** ��ư�������֥�å��� */
  public static final String CstRyHaidenjidou = "��ư�������֥�å���";

  /** �������졼��å��� */
  public static final String CstRyHaidenrire = "�������졼��å���";

  /** �ã�������å��� */
  public static final String CstRyHaidentounyu = "������å���";

  /** ���� */
  public static final String CstRyHaidenkuuhaku = "";

  /** ������������ */
  public static final String CstRyHaidenhaithi = "������������";

  /** �������� */
  public static final String CstRyHaidenbothi = "��������";

  /** �ԣ����� */
  public static final String CstRyHaidenTRthi = "�ԣ�����";

  /** �������� */
  public static final String CstRyHaidenfukae = "�������� ";

  /** �� */
  public static final String CstRyHaidenkiri = "��";

  /** ��߸����� */
  public static final String CstRyHaidenteisisou = "��߸�����";

  /** �������ȯ�� */
  public static final String CstRyHaidenkessoujiko = "�������ȯ��";

  /** iBj �������� */
  public static final String CstRyHaideniBj = "iBj ��������";
  /** Rev.i11 Mod End */
  /** Rev.i10 Mod Start */
  /** ����KV���Ѹ����ʳ� */
  public static final String[] CstRyFdrLnTrblKindStr1 = new String[] { "","��1�ʳ�",
      "��2�ʳ�", "�ǽ�����"};

  /** ���μ��� */
  public static final String[] CstRyFdrLnTrblKindStr2 = new String[] { "","�Ÿ�",
      "�Х�", "����","","", "������"};

  /** ����ȯ�� */
  public static final String CstRyHaidenjikohasei = "����ȯ��";

  /** ������� */
  public static final String CstRyHaidenbosen = "�������";

  /** ��������� */
  public static final String CstRyHaidentehai = "���������";

  /** ���������� */
  public static final String CstRyHaidensouhai = "����������";

  /** �Ű�̤���� */
  public static final String CstRyHaidenmifukyu = "�Ű�̤����";

  /** �Ű����� */
  public static final String CstRyHaidenfukyu = "�Ű�����";

  /** ư��Ry */
  public static final String CstRyHaidenry = "ư��Ry";

  /** ư��CB */
  public static final String CstRyHaidencb = "ư��CB";

  /** ������ή̤���� */
  public static final String CstRyHaidenmifuki = "������ή̤����";

  /** ������ή���� */
  public static final String CstRyHaidenfuki = "������ή����";

  /**  ����Σ� */
  public static final String CstRyHaidenkikino = "����Σ�";

  /**  �����Ťʤ� */
  public static final String CstRyHaidensaisounasi = "�����Ťʤ�";

  /**  ���������� */
  public static final String CstRyHaidensaisouseikou = "����������";

  /**  ���������� */
  public static final String CstRyHaidensaisoufuryou = "����������";

  /** �оݥХ󥯡����� */
  public static final String CstRyHaidentaisyou = "�оݥХ󥯡�����";
  /** Rev.i10 Mod End */

  /**  ���������� */
  public static final String CstRyHaidenJiko = "����������";

  /**  ���������� */
  public static final String CstRyHaidenJikoHassei = "����������ȯ��";

  /**  ���������μ��� */
  /**  Rev.i44 MOD Start */
/**   public static final int CstRyFdrLnTrblKind1 = 1; //�������������� */
/**   public static final int CstRyFdrLnTrblKind2 = 2; //���������ɻ��� */
/**   public static final int CstRyFdrLnTrblKind3 = 3; //�ơ������������� */
/**   public static final int CstRyFdrLnTrblKind4 = 4; //�ơ��������ɻ��� */
/**   public static final int CstRyFdrLnTrblKind5 = 5; //�ƻ��κ������������� */
/**   public static final int CstRyFdrLnTrblKind6 = 6; //�ƻ��κ��������ɻ��� */
/**   public static final int CstRyFdrLnTrblKind7 = 7; //���������ɡʺ��������� */
/**   public static final int CstRyFdrLnTrblKind8 = 8; //�ơ��������� */
/**   public static final int CstRyFdrLnTrblKind9 = 9; //�ơ��������ɡʺ��������� */
/**   public static final int CstRyFdrLnTrblKind10 = 10; //�ƻ���ȯ�� */
/**   public static final int CstRyFdrLnTrblKind11 = 11; //�ƻ��κ��������ɡʺ��������� */
/**   public static final int CstRyFdrLnTrblKind12 = 12; //���ξ���Ƚ���Բ� */
/**   public static final int CstRyFdrLnTrblKind13 = 13; //������å��� */
  public static final int CstRyFdrLnTrblKind1 = 1; /** ���������� */
  public static final int CstRyFdrLnTrblKind2 = 2; /** �������������� */
  public static final int CstRyFdrLnTrblKind3 = 3; /** ���������ɻ��� */
  public static final int CstRyFdrLnTrblKind4 = 4; /** �ơ������������� */
  public static final int CstRyFdrLnTrblKind5 = 5; /** �ơ��������ɻ��� */
  public static final int CstRyFdrLnTrblKind6 = 6; /** �ƻ��κ������������� */
  public static final int CstRyFdrLnTrblKind7 = 7; /** �ƻ��κ��������ɻ��� */
  public static final int CstRyFdrLnTrblKind8 = 8; /** ���������ɡʺ��������� */
  public static final int CstRyFdrLnTrblKind9 = 9; /** �ơ��������� */
  public static final int CstRyFdrLnTrblKind10 = 10; /** �ơ��������ɡʺ��������� */
  public static final int CstRyFdrLnTrblKind11 = 11; /** �ƻ���ȯ�� */
  public static final int CstRyFdrLnTrblKind12 = 12; /** �ƻ��κ��������ɡʺ��������� */
  public static final int CstRyFdrLnTrblKind13 = 13; /** ���ξ���Ƚ���Բ� */
  public static final int CstRyFdrLnTrblKind14 = 14; /** ������å��� */
  public static final int CstRyFdrLnTrblKind15 = 15; /** ����ϩ��å��� */
  /**  Rev.i44 MOD End */

  /** Rev.i02 Mod Start */
  /** public static final String[] CstRyFdrLnTrblKindStr = new String[] { "", */
  /**     "��������������", "���������ɻ���", "�ơ�������������","�ƻ��κ�������������", "�ƻ��κ��������ɻ���", */
  /**     "���������ɡʺ���������", "�ơ���������", "�ơ��������ɡʺ���������", "�ƻ���ȯ��", "�ƻ��κ��������ɡʺ���������", */
  /**     "���ξ���Ƚ���Բ�", "������å���", "����ϩ��å���" }; */
/**  Rev.i43 Mod Start */
/**   public static final String[] CstRyFdrLnTrblKindStr = new String[] { "", */
/**       "��������������", "���������ɻ���", "�ơ�������������", "�ơ��������ɻ���","�ƻ��κ�������������", "�ƻ��κ��������ɻ���", */
/**       "���������ɡʺ���������", "�ơ���������", "�ơ��������ɡʺ���������", "�ƻ���ȯ��", "�ƻ��κ��������ɡʺ���������", */
/**       "���ξ���Ƚ���Բ�", "������å���", "����ϩ��å���" }; */
  public static final String[] CstRyFdrLnTrblKindStr = new String[] { "",
      "����������","��������������", "���������ɻ���", "�ơ�������������", "�ơ��������ɻ���","�ƻ��κ�������������", "�ƻ��κ��������ɻ���",
      "���������ɡʺ���������", "�ơ���������", "�ơ��������ɡʺ���������", "�ƻ���ȯ��", "�ƻ��κ��������ɡʺ���������",
      "���ξ���Ƚ���Բ�", "������å���", "����ϩ��å���" };
/**  Rev.i43 Mod End */
  /** Rev.i02 Mod End */

  /**  ��������ե饰 */
  public static final int CstRyRestrPrcssDtrrnc_True = 1;

  /**  OK */
  public static final String CstRyOK = "�ϣ�";
  /**  NG */
  public static final String CstRyNG = "�Σ�";

  /**  �桼�����٥��ID */
  /**  public static final int CstRyUsrEventXXXXXXXX = 9999; */

  /**  ��̳�ɣ� */
  public static final int CstRyFunctionID_Skelton      = 1000; /** ������ȥ� */
  public static final int CstRyFunctionID_Distribution = 2000; /** ������ϩ�� */
  public static final int CstRyFunctionID_Trbl         = 7000; /** �����б� */

  /** ������ꥢϢ�� */
  /** Rev.i16 Mod Start */
/**   public static final int CstRyWorkIndex_ReFdrLine = 4600; // ������ */
  public static final int CstRyWorkIndex_ReFdrLine = 9000; /**  ������ */
/**   public static final int CstRyWorkIndex_6kV       = 4800; // 6kV��� */
  public static final int CstRyWorkIndex_6kV       = 9030; /**  6kV��� */
/**   public static final int CstRyWorkIndex_22kV      = 5000; // 22kV */
  public static final int CstRyWorkIndex_22kV      = 9060; /**  22kV */
  /** Rev.i16 Mod End */
  public static final int CstRyWorkIndex_Keisei    = 600;  /**  ���� */
  /** Rev.i16 Mod Start */
/**   public static final int CstRyWorkIndex_ChildTableKey    = 1600; // �ҥơ��֥륭�� */
  /** Rev.i34 Mod Start */
  /** public static final int CstRyWorkIndex_ChildTableKey    = 3000; // �ҥơ��֥륭�� */
  public static final int CstRyWorkIndex_nTableIdx    = 3000; /**  �ҥơ��֥륭�� */
  /** Rev.i34 Mod End */
  /** Rev.i01 Add Start */
/**   public static final int CstRyWorkIndex_Haisei    = 4500; // ���� */
  public static final int CstRyWorkIndex_Haisei    = 9000; /**  ���� */
  /** Rev.i16 Mod End */
  /** Rev.i01 Add End */
  /**  ���� */
  public static final String CstRyAllZenkakuStr = "����";

  /**  ���� */
  public static final String CstRyTotalStr = "������";

  /** �쥳���ɶ�ʬ */
  public static final int CstRyRecordClass_Total      = 1;   /**  ���� */
  public static final int CstRyRecordClass_FeederLine = 2;   /**  ������ */
  public static final int CstRyRecordClass_Section    = 3;   /**  ��� */
  public static final int CstRyRecordClass_Consumer   = 4;   /**  ���ײ� */

  /** ����ɽ�� */
  public static final int CstRyRecoveryFlg_Bout        = 0;    /**  ������ */
  public static final int CstRyRecoveryFlg_Restoration = 1;    /**  ����� */

  /** ���ξ��� */
  public static final int CstRyTrblSituationBlackOut1 = 1;     /**  ȯ����ʶ���پ�Ƚ����) */
  public static final int CstRyTrblSituationBlackOut2 = 2;     /**  ȯ����ʶ���پ����� */
  public static final int CstRyTrblSituationRestoration = 3;   /**  ����� */

  /** ��֥ե����ޥå� */
  public static final String CstRySectionNoFormat = "��%d���";

  /** ���ײȶ�ʬ̾�Ρ� */
  public static final String[] CstRyConsumersClsNameStr = new String[]{"","�ⰵ����", "�ⰵ����", "�ⰵʬ��", "�㰵����", "���׿���"};

  /** �����ٶ�ʬ */
  public static final String[] CstRyReliabilityCls = new String[]{"", "����", "��", "��", "��", "�����", "���", "Ķ��"};

  /**  ����̾����ܥܥå���������� */
  public static final int CstRyFkClassIdxblank     = 0;    /**  �֥�� */
  public static final int CstRyFkClassIdxCB        = 1;    /**  CB */
  public static final int CstRyFkClassIdxRY        = 2;    /**  ��졼 */
  public static final int CstRyFkClassIdxDMS       = 3;    /**  ����¾���Ĵ� */

  /**  ����̾����ܥܥå���������� */
  public static final String[] CstRyFkClass = new String[]{"","�ã�","�ң�","����¾���Ĵ�"};

  /**  TM���ॳ��ܥܥå���������� */
  public static final int CstRyEngineerUnitIdxblank  = 0; /**  �֥�� */
  public static final int CstRyEngineerUnitIdxP = 1; /**  ͭ������ */
  public static final int CstRyEngineerUnitIdxV = 2; /**  �Ű� */
  public static final int CstRyEngineerUnitIdxI = 3; /**  ��ή */
  public static final int CstRyEngineerUnitIdxWh = 4; /**  �ף� */
  /**  TM���ॳ��ܥܥå���������� */
  public static final String[] CstRyEngineeringUnits = new String[]{"","ͭ������","�Ű�","��ή","�ף�"};

  /**  TM���� */
  public static final int CstRyEngineerUnitP = 1;   /**  ���� */
  public static final int CstRyEngineerUnitV = 4;   /**  ���� */
  public static final int CstRyEngineerUnitI = 5;   /**  ���� */
  public static final int CstRyEngineerUnitWh = 9;  /**  ���ѣףȡݣ̡ʽ�Ĭή����Ĭή������ѻ��� */
  public static final int CstRyEngineerUnitPL = 10; /**  �ù�Сʣ̡� */
  public static final int CstRyEngineerUnitPG = 11; /**  �ù�Сʣǡ� */

  /**  ����ե饰 */
  public static final int CstRyFinalRepFlagNormal = 0;
  public static final int CstRyFinalRepFlagFinal = 1;

  /**  �ƥ����ȥ��ꥢʸ���� */
  public static final int CstRyTextAreaTokki =9760;
  public static final int CstRyTextAreaTokki1 =360;

  /**  �ơ��֥���ϰ��� */
  public static final int CstRyPositionLeft = 1;  /** ���ơ��֥� */
  public static final int CstRyPositionCentr = 2; /** ����ơ��֥� */
  public static final int CstRyPositionRight = 3; /** ���ơ��֥� */

  /**  Ĵ���������� */
  public static final int CstRySC =1;   /** SC */
  public static final int CstRyShr =2;  /** ShR */

  /**  ��Ư���� */
  public static final int CstRyOperatingException = 1;    /**  ����۾� */
  public static final int CstRyOperatingOperation = 2;    /**  ����� */
  public static final int CstRyOperatingLiberation = 3;   /**  �б�CB���� */
  public static final int CstRyOperatingCharge = 4;       /**  �б�CB���� */

  /**  ��Ư�����۾� */
  public static final int CstRyOperatingflg0 = 0;    /**  �� */
  public static final int CstRyOperatingflg1 = 1;    /**  �� */

  /**  ��������_���饹 */
  public static final int CstRyFKClassSubstation = 2;          /**  �ŵ��� */
  public static final int CstRyFKClassTransmissionLine = 3;    /**  ������ */
  public static final int CstRyFKClass7 = 7;                   /**  */
  public static final int CstRyFKClassLine = 21;               /**  ������ */
  public static final int CstRyFKClassCB = 23;                 /**  CB */
  public static final int CstRyFKClassDMeasurementStatus1 = 24;/**  ����¾���Ĵ� */
  public static final int CstRyFKClassDMeasurementStatus2 = 25;/**  ����¾���Ĵ� */
  public static final int CstRyFKClassRY = 29;                 /**  ��졼 */
  public static final int CstRyFKClassManagementOffice = 47;   /**  ���ѻ��ݽ� */

  /**  ȯ�Żپ�ɽ�� */
  public static final int CstRyPGenHidFlag1 = 1;
  public static final int CstRyPGenHidFlag2 = 0;

  /**  ��Ҿ��� */
  public static final int CstRyDstrStnFalse = 1;
  public static final int CstRyDstrStnTrue = 2;
  public static final int CstRyDstrStnUnkwnoun = 3;

  /** �������츫�̤����� */
  public static final int CstRyResPrspctStnMitei = 1;
  public static final int CstRyResPrspctStnStnMikomi = 2;
  public static final int CstRyResPrspctStnKanryo = 3;

  /**  ������������ */
  public static final String CstRyKaNaA = "��";
  public static final String CstRyKaNaK = "��";
  public static final String CstRyKaNaS = "��";
  public static final String CstRyKaNaT = "��";
  public static final String CstRyKaNaN = "��";
  public static final String CstRyKaNaH = "��";
  public static final String CstRyKaNaM = "��";
  public static final String CstRyKaNaY = "��";
  public static final String CstRyKaNaR = "��";
  public static final String CstRyKaNaW = "��";
  public static final String CstRyKaNaZ = "��";
  public static final int CstRyCustomerKind = 1;  /**  ���ײ������������:1 */
  public static final int CstRyPowerGeneratorsKind = 2;  /**  ȯ�ŵ������������:2 */
  /**  �ơ��֥�ܥ���ɽ���� */
  public static final String CstRyAllPowerSysResName1 = "�����Ž�ɽ��";

  /**  50������ */
  public static final String[] CstRyKana1 = new String[]{"��","��","��","��","��","��","��","��","��","��","��","��","��","��","��",
                                                         "��","��","��","��","��","��","��","��","��","��","��","��","��","��","��",
                                                         "��","��","��","��","��","��","��","��","��","��","��","��","��","��"};
  public static final String[] CstRyKana2 = new String[]{"��","��","��","��","��","��","��","��","��","��","��","��","��","��","��",
                                                         "��","��","��","��","��","��","��","��","��","��","��","��","��","��","��",
                                                         "��","��","��","��","��","��","��","��","��","��","��","��","��","��"};
  public static final String[] CstRyKana3 = new String[]{"��","��","��","��","��","��","��","��","��","��","��","��","��","��","��",
                                                         "��","��","��","��","��","��","��","��","��","��","��","��","��","��","��",
                                                         "��","��","��","��","��","��","��","��","��","��","��","��","��","��"};
  public static final String[] CstRyKana4 = new String[]{"��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","","","","","","��","��","��","��","��","","","","","","��","��","��","","","","","",""};
  public static final String[] CstRyKana5 = new String[]{"","","","","","","","","","","","","","","","","","��","","","","","","","","��","��","��","��","��","","","","","","","","","","","","","",""};
  public static final String[] CstRyKana6 = new String[]{"��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","","","","","","��","��","��","��","��","","","","","","��","��","��","","","","","",""};
  public static final String[] CstRyKana7 = new String[]{"","","","","","","","","","","","","","","","","","��","","","","","","","","��","��","��","��","��","","","","","","","","","","","","","","",};
  public static final String[] CstRyKana8 = new String[]{"��","��","��","��","��","����","����","����","����","����","����","����","����","����","����","����","����","��","�Î�","�Ď�","","","","","","�ʎ�","�ˎ�","�̎�","�͎�","�Ύ�","","","","","","��","��","��","","","","","",""};
  public static final String[] CstRyKana9 = new String[]{"","","","","","","","","","","","","","","","","","��","","","","","","","","�ʎ�","�ˎ�","�̎�","�͎�","�Ύ�","","","","","","","","","","","","","",""};

  /** Rev.i17 Add Start */
  /** 50������ */
  public static final String[] CstRykana1 = new String[]{"��","��","��","��","��","��"};
  public static final String[] CstRykana2 = new String[]{"��","��","����","��","��","��"};
  public static final String[] CstRykana3 = new String[]{"��","��","��","��","��","��","��"};
  public static final String[] CstRykana4 = new String[]{"��","��","��","��","��","��"};
  public static final String[] CstRykana5 = new String[]{"��","��","��","��","��","��"};
  public static final String[] CstRykana6 = new String[]{"��","����","��","��","��","��"};
  public static final String[] CstRykana7 = new String[]{"��","����","��","��","��","��"};
  public static final String[] CstRykana8 = new String[]{"��","����","��","��","��","��"};
  public static final String[] CstRykana9 = new String[]{"��","����","��","��","��","��"};
  public static final String[] CstRykana10 = new String[]{"��","����","��","��","��","��"};
  public static final String[] CstRykana11 = new String[]{"��","����","��","��","��","��"};
  public static final String[] CstRykana12 = new String[]{"��","����","��","��","��","��"};
  public static final String[] CstRykana13 = new String[]{"��","����","��","��","��","��"};
  public static final String[] CstRykana14 = new String[]{"��","����","��","��","��","��"};
  public static final String[] CstRykana15 = new String[]{"��","����","��","��","��","��"};
  public static final String[] CstRykana16 = new String[]{"��","����","��","��","��","��"};
  public static final String[] CstRykana17 = new String[]{"��","����","��","��","��","��"};
  public static final String[] CstRykana18 = new String[]{"��","��","��","��","��","��","��","��","��"};
  public static final String[] CstRykana19 = new String[]{"��","�Î�","��","��","��","��"};
  public static final String[] CstRykana20 = new String[]{"��","�Ď�","��","��","��","��"};
  public static final String[] CstRykana21 = new String[]{"��","��","��",};
  public static final String[] CstRykana22 = new String[]{"��","��","��"};
  public static final String[] CstRykana23 = new String[]{"��","��","��"};
  public static final String[] CstRykana24 = new String[]{"��","��","��"};
  public static final String[] CstRykana25 = new String[]{"��","��","��"};
  public static final String[] CstRykana26 = new String[]{"��","�ʎ�","�ʎ�","��","��","��","��","��","��"};
  public static final String[] CstRykana27 = new String[]{"��","�ˎ�","�ˎ�","��","��","��","��","��","��"};
  public static final String[] CstRykana28 = new String[]{"��","�̎�","�̎�","��","��","��","��","��","��"};
  public static final String[] CstRykana29 = new String[]{"��","�͎�","�͎�","��","��","��","��","��","��"};
  public static final String[] CstRykana30= new String[]{"��","�Ύ�","�Ύ�","��","��","��","��","��","��"};
  public static final String[] CstRykana31 = new String[]{"��","��","��"};
  public static final String[] CstRykana32 = new String[]{"��","��","��"};
  public static final String[] CstRykana33 = new String[]{"��","��","��"};
  public static final String[] CstRykana34 = new String[]{"��","��","��"};
  public static final String[] CstRykana35 = new String[]{"��","��","��"};
  public static final String[] CstRykana36 = new String[]{"��","��","��","��","��","��"};
  public static final String[] CstRykana37 = new String[]{"��","��","��","��","��","��"};
  public static final String[] CstRykana38 = new String[]{"��","��","��","��","��","��"};
  public static final String[] CstRykana39 = new String[]{"��","��","��"};
  public static final String[] CstRykana40 = new String[]{"��","��","��"};
  public static final String[] CstRykana41 = new String[]{"��","��","��"};
  public static final String[] CstRykana42 = new String[]{"��","��","��"};
  public static final String[] CstRykana43 = new String[]{"��","��","��"};
  public static final String[] CstRykana44 = new String[]{"��","��","��"};
  public static final String[] CstRykana45 = new String[]{};
  /** Rev.i17 Add End */


  /**  10������ */
  public static final String[] CstRyKANA1 = new String[]{"��","��","��","��","��","��","��","��","��","��","����","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��"};
  public static final String[] CstRyKANA2 = new String[]{"��","��","��","��","��","����","����","����","����","����","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��"};
  public static final String[] CstRyKANA3 = new String[]{"��","��","��","��","��","����","����","����","����","����","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��"};
  public static final String[] CstRyKANA4 = new String[]{"��","��","��","��","��","����","����","��","�Î�","�Ď�","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��"};
  public static final String[] CstRyKANA5 = new String[]{"��","��","��","��","��","��","��","��","��","��","��","��","��","��","��"};
  public static final String[] CstRyKANA6 = new String[]{"��","��","��","��","��","�ʎ�","�ˎ�","�̎�","�͎�","�Ύ�","�ʎ�","�ˎ�","�̎�","�͎�","�Ύ�","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��"};
  public static final String[] CstRyKANA7 = new String[]{"��","��","��","��","��","��","��","��","��","��","��","��","��","��","��"};
  public static final String[] CstRyKANA8 = new String[]{"��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��"};
  public static final String[] CstRyKANA9 = new String[]{"��","��","��","��","��","��","��","��","��","��","��","��","��","��","��"};
  public static final String[] CstRyKANA10 = new String[]{"��","��","��"};
  public static final String[] CstRyKANA11 = new String[]{};

  /** Rev.i05 Add Start */
  public static final String CstRyREGGREX_A    = "^[�����������������������ޤ�����������������������������������������].*";
  public static final String CstRyREGGREX_KA   = "^[�������������ގ��ގ��ގ��ގ��ޤ���������������������������������������].*";
  public static final String CstRyREGGREX_SA   = "^[�������������ގ��ގ��ގ��ގ��ޤ���������������������������������������].*";
  public static final String CstRyREGGREX_TA   = "^[�����ÎĎ��ގ��ގގÎގĎގ������ĤƤȤ��¤ŤǤɤå����ĥƥȥ��¥ťǥɥ�].*";
  public static final String CstRyREGGREX_NA   = "^[�ŎƎǎȎɤʤˤ̤ͤΥʥ˥̥ͥ�].*";
  public static final String CstRyREGGREX_HA   = "^[�ʎˎ͎̎Ύʎގˎގ̎ގ͎ގΎގʎߎˎߎ̎ߎ͎ߎΎߤϤҤդؤۤФӤ֤٤ܤѤԤפڤݥϥҥեإۥХӥ֥٥ܥѥԥץڥ�].*";
  public static final String CstRyREGGREX_MA   = "^[�ώЎюҎӤޤߤ���ޥߥ���].*";
  public static final String CstRyREGGREX_YA   = "^[�ԎՎ֎��������������������].*";
  public static final String CstRyREGGREX_RA   = "^[�׎؎َڎۤ����������].*";
  public static final String CstRyREGGREX_WA   = "^[�������܎���].*";
  /** Rev.i05 Add End */

  /** Rev.i08 Add Start */
  public static final String[] CstRyZEN_EIJI = new String[]{"��","��","��","��","��","��","��","��","��","��","��","��","��","��","��",
      "��","��","��","��","��","��","��","��","��","��","��",
      "��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��"};
  public static final String[] CstRyHAN_EIJI = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O",
      "P","Q","R","S","T","U","V","W","X","Y","Z",
      "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
  public static final String[] CstRyZEN_SUUJI = new String[]{"��","��","��","��","��","��","��","��","��","��"};
  public static final String[] CstRyHAN_SUUJI = new String[]{"0","1","2","3","4","5","6","7","8","9"};
  public static final String[] CstRyZEN_OTHER = new String[]{"��","��","��","��"};
  public static final String[] CstRyHAN_OTHER = new String[]{" ","��","��",","};

  /** ���ζ�ʬ�ꥹ�� */
  public static final String[] CstRyDivision = new String[]{"�������®��","���̻���®��","��������","�����Ͼ���","¾�Ҿ���"};
  /**  SV/TM��ʬ */
  public static final int CstRySvTmKindNot = 0; /**  ̤��� */
  public static final int CstRySvTmKindSv = 1;  /**  SV */
  public static final int CstRySvTmKindTm = 2;  /**  TM */
  public static final String[] CstRySvTmStr = new String[]{ "","SV","TM"};
  public static final String CstRyManagemenSituationEnd = "(��̾��λ)";
  /**  ������� */
  public static final String[] CstRyMachineStatusStr = new String[]{ "��","��"};

  public static final String[] CstRyReclosureSituation = new String[]{"","�ǽ�����","����ϩ����","����ϩ�ǽ�����"};
  /** Rev.i28 Add Start */
  public static final String[] CstRyReclosureSituation1 = new String[]{"","��������������","���������ɻ���","�ơ�������������","�ơ��������ɻ���" ,"�ƻ��κ�������������","�ƻ��κ��������ɻ���"};
  /** Rev.i28 Add End */
  /** Poppry000284������� */
  public static final String CstRySpaceZen2 = "����";
  public static final String CstRySpaceZen3 = "������";
  public static final String CstRySpaceZen4 = "��������";
  public static final String CstRySpaceZen5 = "����������";
  public static final String CstRyFinalRepStr = "����";
  public static final String CstRyKunaichouStr = "��ģ���ͭ";
  public static final String CstRyDaisanjyouStr = "�����裳����";
  public static final String CstRyMillionKWAOverSupHid = "����������װʾ嶡��پ���Զ��⣵������ס�";
  public static final String CstRyGaitou = "����";
  public static final String CstRyGoro = "��";
  public static final String[] CstRyResPrspctStn1 = new String[]{"̤��","�������츫��","�������촰λ"};
  public static final String CstRySocietyEffectTitle = "�Ҳ�Ū�ƶ�";
  public static final String CstRyMediaInqryNews = "�ޥ������䤤��碌����ƻ";
  public static final String CstRyOtherImpact = "����¾�ƶ�";
  public static final String CstRyContent = "���ơ�";
  public static final String CstRyNoZero = "��";
  public static final String CstRyNoSix = "����";
  public static final String CstRyNoSeven = "����";
  public static final String CstRyNoEight = "����";
  public static final String CstRyNoNine = "����";
  public static final String CstRyPlaceTitle = "���βս�";
  public static final String CstRyTrblCauseTitle = "���θ���";
  public static final String CstRySpecialMentionTitle = "����������õ�����";
  public static final String CstRyKakko = "��";
  public static final String CstRyKakkotoji = "��";
  public static final String CstRygDstrStnTitle = "�ﳲ����Ҿ�����ͭ";
  public static final String[] CstRygDstrStn = new String[]{"����»��","�к�","��ȯ","����","�ݲ�","��ή�л���","����������","�ͿȺҳ�","�Ͽ�","����","����","�볲","�㳲","����","ε��","����","����¾"};
  public static final String CstRyWeatherInforTitle = "ȯɽ��ε��ݾ���";
  public static final String CstRyInstntVltgDrpTitle = "�ֻ��Ű��㲼��ȯ����ͭ";
  public static final String CstRygTrblJudgResTitle = "���ڽ������Ƚ���̡�\n";
  public static final String CstRyTensen = "��������������������������\n";
  public static final String CstRyTrblJudgResStr1 = "����Ķ���פʤ��Ҥ��ޤ���ʬ�ʾ����Ť������\n���ʤ��Ҥ����Թ�ˤ�꽼�ŤǤ��ʤ�����ޤ��\n";
  public static final String CstRyTrblJudgResStr2 = "�������������ˤ����ơ����Ž�� ��kV ����������\n���ˤ�ꤪ�Ҥ��ޤ����Ť������Τ����Ż��֤���ʬ��\n����ξ��ʤ�������������Ͻ�����\n";
  public static final String CstRyTrblJudgResStr3 = "������������褪��Ӳ��͡�����϶�ˤ����ơ�ȯ��\n���Ž�Σ���kV�ʾ���������Ťˤ�ꤪ�Ҥ��ޤ�����\n���������Ρʤ�������������Ͻ�����\n"
                                                  + "���ʺ���ϩ���������Ѽ������֤���Ӻ������ɹ��ξ�\n�����ޤࡣ���������Ž�Σ���¦���������ŤϽ���\n����������Žꤪ��ӿ���ȯ�Ž���������Ѱ���Σ�\n"
                                                  + "����¦���������ŤϽ�����\n";
  public static final String CstRyTrblJudgResStr4 = "�������������ϰ�ʸ�ģ����ϡˤ˶��뤹��ȯ���Ž�\n�������Ľꣶ��kV�ʾ�����������Ťˤ�ꤪ�Ҥ��ޤ�\n�����Ť�������\n"
                                                  + "���ʺ���ϩ���������Ѽ������֤���Ӻ������ɹ��ξ�\n�����ޤࡣ���������Ž�Σ���¦���������ŤϽ���\n����������Žꤪ��ӿ���ȯ�Ž���������Ѱ���Σ�\n"
                                                  + "����¦���������ŤϽ�����\n";
  public static final String CstRyTrblJudgResStr5 = "��������¾���ϰ�ˤ����ơ�ȯ���Žꡦ���Ľ�Σ���\n����kV�ʾ�����������Ťˤ�ꤪ�Ҥ��ޤ����Ť�����\n����\n"
                                                  + "���ʺ���ϩ���������Ѽ������֤���Ӻ������ɹ��ξ�\n�����ޤࡣ���������Ž�Σ���¦���������ŤϽ���\n����������Žꤪ��ӿ���ȯ�Ž���������Ѱ���Σ�\n"
                                                  + "����¦���������ŤϽ�����\n";
  public static final String CstRyTrblJudgResStr6 = "�������٤Ƥ��ϰ�ˤ����ơ�����پ����Ϥ�����kW��\n����ζ���پ���ΤǤ��äơ����λپ���֤�����ʬ\n���ʾ�ξ��\n";
  public static final String CstRyTrblJudgResStr7 = "�������٤Ƥ��ϰ�ˤ����ơ�����پ����Ϥ�����kW��\n���壷��kW̤���ζ���پ���ΤǤ��äơ����λپ��\n���֤������ְʾ�ξ��\n";
  public static final String CstRyTrblJudgResStr8 = "�������٤Ƥ��ϰ�ˤ����ơ���������kW�ʾ�������\n��������ϣ�����kW�ʾ�ˤζ���پ㤬ȯ���������\n";
  public static final String CstRyTrblJudgResStr9 = "����¾��Ϣ�Ϥˤ�������������Τξ��\n";
  /** Poppry000212������� */
  public static final String CstRyBosenKousei1 = "ʣ�����ʣ�����֡ݣ�����";
  public static final String CstRyBosenKousei2 = "ʣ�����ʣ�����֡ݣ�����";
  public static final String CstRyBosenKousei3 = "ʣ�����ʣ�������֡ݣ�����";
  public static final String CstRyBosenKousei4 = "ʣ�����ʣ�������֡ݣ�����";
  public static final String CstRyBosenKousei5 = "ʣ�����ʣ�������֡ݣ�����";
  public static final String CstRyBosenKousei6 = "ʣ�����ʣ�������֡ݣ�����";
  public static final String CstRyBosenKousei7 = "��˥å������ʣ�����֡ݣ�����";
  public static final String CstRyBosenKousei8 = "��˥å������ʣ�����֡ݣ�����";
  public static final String CstRyBosenKousei9 = "��˥å������ʣ�������֡ݣ�����";
  public static final String CstRyBosenKousei10 = "��˥å������ʣ�������֡ݣ�����";
  public static final String CstRyBosenKousei11 = "��˥å������ʣ�������֡ݣ�����";
  public static final String CstRyBosenKousei12 = "��˥å������ʣ�������֡ݣ�����";
  public static final String CstRyBosenKousei13 = "��˥å������������ʣ�����֡ݣ�����";
  public static final String CstRyBosenKousei14 = "��˥å������������ʣ�����֡ݣ�����";
  public static final String CstRyBosenKousei15 = "��˥å������������ʣ�������֡ݣ�����";
  public static final String CstRyBosenKousei16 = "��˥å������������ʣ�������֡ݣ�����";
  public static final String CstRyBosenKousei17 = "��˥å������������ʣ�������֡ݣ�����";
  public static final String CstRyBosenKousei18 = "��˥å������������ʣ�������֡ݣ�����";
  public static final int[]  CstRyBosen= new int[]{1,2,3,4,5,6,11,12,13,14,15,16,21,22,23,24,25,26};
  /** Rev.i08 Add End */
  /** Rev.i08 Add Start */
  public static final int CstRyTextAreaTokki2 =100;
  /** Rev.i08 Add End */
  /**  ��å�����No (HMI) */
  public static final int CstRyMsg00001 =  1; /**  ɽ���׵�ǡ����������Ǥ��ޤ��� */
  public static final int CstRyMsg00002 =  2; /**  �����н����ǰ۾郎ȯ�����ޤ����� */
  public static final int CstRyMsg00003 =  3; /**  �����Фؤ��׵᤬�����ॢ���Ȥ��ޤ����� */
  public static final int CstRyMsg00004 =  4; /**  �����ǡ�����¸�ߤ��ޤ��� */
  public static final int CstRyMsg00005 =  5; /**  �����ͤ���¤�Ķ���Ƥ��ޤ��� */
  public static final int CstRyMsg00006 =  6; /**  �����ͤ����¤�Ķ���Ƥ��ޤ��� */
  public static final int CstRyMsg00007 =  7; /**  �����ͤ��۾�Ǥ��� */
  public static final int CstRyMsg00008 =  8; /**  ȯ��������������̷�⤬����ޤ��� */
  public static final int CstRyMsg00009 =  9; /**  ���ϻ����λ�����̷�⤬����ޤ��� */
  public static final int CstRyMsg00010 = 10; /**  ���դޤ��ϻ���ǡ����������Ǥ��� */
  public static final int CstRyMsg00011 = 11; /**  ����ǡ����������ͤ�������������ߤ��ޤ����� */
  public static final int CstRyMsg00012 = 12; /**  ������̤��۾�Τ����������ߤ��ޤ����� */
  public static final int CstRyMsg00013 = 13; /**  �ϡ��ɥ��ԡ��Υե�����ž���˼��Ԥ��ޤ����� */
  public static final int CstRyMsg00014 = 14; /**  Ⱦ�ѥ��ʤ⤷�����ü�ʸ������Ͽ�Ǥ��ޤ��� */
  public static final int CstRyMsg00015 = 15; /**  �Ǿ��������̷�⤬����ޤ��� */
  public static final int CstRyMsg00016 = 16; /**  �׵ᤷ���ץ�󥿤��������ʤ����ᡤ�����Ǥ��ޤ��� */
  public static final int CstRyMsg00017 = 17; /**  ��³�極���Фξ��ѷϤ��ڤ��ؤ��ޤ����� */
  public static final int CstRyMsg00018 = 18; /**  �׵���̤ϡ����硼�ȥ��åȳ���դ��ѤߤǤ��� */
  public static final int CstRyMsg00019 = 19; /**  �׵���̤ϡ����ߤΥ⡼�ɤǤ�ɽ���Ǥ��ޤ��� */
  public static final int CstRyMsg00020 = 20; /**  ���̾õ���Τ��ᡤ��Ͽ�Ǥ��ޤ��� */
  public static final int CstRyMsg00021 = 21; /**  �׵���̤ϡ����ߥ��硼�ȥ��å���Ͽ�Ǥ��ޤ��� */
  public static final int CstRyMsg00022 = 22; /**  �����ɤ�ǧ�ڤ���Ƥ��ޤ��� */
  public static final int CstRyMsg00023 = 23; /**  ǧ���楫���ɤǤ������׵��»ܤ��븢�¤�����ޤ��� */
  public static final int CstRyMsg00024 = 24; /**  ���渢�¤�����ޤ��� */
  public static final int CstRyMsg00025 = 25; /**  ����ǧ�ڤ������ॢ���Ȥ��ޤ����� */
  public static final int CstRyMsg00026 = 26; /**  �ǡ����ν���ǰ۾郎ȯ�����ޤ����� */
  public static final int CstRyMsg00027 = 27; /**  �ǡ������ɹ��ǰ۾郎ȯ�����ޤ����� */
  public static final int CstRyMsg00028 = 28; /**  ������ǡ������˴����ޤ���������Ǥ����� */
  public static final int CstRyMsg00029 = 29; /**  �������ϥ��顼�Ǥ��� */
  public static final int CstRyMsg00030 = 30; /**  ���������׵������դ��ޤ����� */
  public static final int CstRyMsg00031 = 31; /**  ���������׵�˼��Ԥ��ޤ����� */
  public static final int CstRyMsg00032 = 32; /**  ������¸�׵������դ��ޤ����� */
  public static final int CstRyMsg00033 = 33; /**  ������¸�׵�˼��Ԥ��ޤ����� */
  public static final int CstRyMsg00034 = 34; /**  ��˥���󥰤��۾ｪλ���ޤ����� */
  public static final int CstRyMsg00035 = 35; /**  ������ȥ�ε����ư�Ԥ��Τ��ᡤ���̾õ�Ǥ��ޤ��� */
  public static final int CstRyMsg00036 = 36; /**  ������Ǥβ���ɽ����ͥ�褹�뤿�ᡤ���̤�õ�ޤ����� �õ�줿���̤�ɽ���ϡ����Ф餯�ԤäƤ���ԤäƲ������� */
  public static final int CstRyMsg00037 = 37; /**  ɽ���׵ᤷ�����̤Υ꥽��������ݤǤ��ޤ���Ǥ�����¾��β��̤�õ�Ƥ��顤����ɽ���׵��ԤäƲ������� */
  public static final int CstRyMsg00038 = 38; /**  ��̳�¹���Τ���ɽ���Ǥ��ޤ��� */
  public static final int CstRyMsg00039 = 39; /**  �׻��򳫻Ϥ��ޤ����� */
  public static final int CstRyMsg00040 = 40; /**  �׻�����λ���ޤ����� */
  public static final int CstRyMsg00041 = 41; /**  �������ʤ�������Ͽ�Ǥ��ޤ�����Ͽ�������Ԥ����򤷤Ƥ�����Ͽ���Ƥ��������� */
  public static final int CstRyMsg00042 = 42; /**  ����ȥ�������׵ᤷ�ޤ����� */

  /**  ��å�����No (�����б�) */
  public static final int CstRyMsg07001 = 7001; /**  ���η�̾�������ޤ����� */
  public static final int CstRyMsg07002 = 7002; /**  ��������®��(����ȥ�)���������ޤ����� */
  public static final int CstRyMsg07003 = 7003; /**  ��ư����(��������G)���������ޤ����� */
  public static final int CstRyMsg07004 = 7004; /**  ����®���ƣ����������ޤ����� */
  public static final int CstRyMsg07005 = 7005; /**  ����®����å������������ޤ����� */
  public static final int CstRyMsg07006 = 7006; /**  ��������®��(����ȥ�)�������ޤ����� */
  public static final int CstRyMsg07007 = 7007; /**  Ʊ����η�̾��¾��ˤ��Խ���Ǥ��� */
  public static final int CstRyMsg07008 = 7008; /**  �裴��٥�ʳ��ζ����ϰ褬���򤵤�Ƥ��ޤ��� */
  public static final int CstRyMsg07009 = 7009; /**  ��̤�̤�����ιԤ����򤵤�Ƥ��ޤ��� */
  public static final int CstRyMsg07010 = 7010; /**  �����ϰ褬���̥�٥�˳������Ƥ��ޤ��� */
  public static final int CstRyMsg07011 = 7011; /**  �����ϰ�̾�����ꤵ��Ƥ��ޤ��� */
  public static final int CstRyMsg07012 = 7012; /**  ���򤷤������ϰ�ν�̤ϺǾ�̤Ǥ��� */
  public static final int CstRyMsg07013 = 7013; /**  ���򤷤������ϰ�ν�̤Ϻǲ��̤Ǥ��� */
  public static final int CstRyMsg07014 = 7014; /**  ��̤�̤�����ιԤ���̥�٥�����򤵤�Ƥ��ޤ��� */
  public static final int CstRyMsg07015 = 7015; /**  ���ꤷ�������ϰ�Ϻ������ޤ����� */
  public static final int CstRyMsg07016 = 7016; /**  ���򤷤��ԣ������Ϸ׻����ǻ��Ѥ��Ƥ��ޤ��� */
  public static final int CstRyMsg07017 = 7017; /**  �����оݤ�¸�ߤ��ޤ��� */
  public static final int CstRyMsg07018 = 7018; /**  ����оݤ������ѤǤϤ���ޤ��� */
  public static final int CstRyMsg07019 = 7019; /**  ����оݤ��������Ѱ�������ꤵ��Ƥ��ޤ��� */
  public static final int CstRyMsg07020 = 7020; /**  ���ꤷ�������ϰ�̾���ѹ�����Ƥ��ޤ��� */
  public static final int CstRyMsg07021 = 7021; /**  ���η�̾���ɲä��ޤ������ɲû���No.��ZZ9 */
  public static final int CstRyMsg07022 = 7022; /**  �����оݤ������Ǥ��ޤ��� */
  public static final int CstRyMsg07023 = 7023; /**  �����Ф��������λ��Υȥ�å״��������׵�򤷤ޤ����� */
  public static final int CstRyMsg07024 = 7024; /**  �����Ф��������λ��Υȥ�å״�����λ�׵�򤷤ޤ����� */
  public static final int CstRyMsg07025 = 7025; /**  �����Фغ���ϩRY��ư��å��׵�򤷤ޤ����� */
  public static final int CstRyMsg07026 = 7026; /**  �����Фغ���ϩRY��ư��å�����׵�򤷤ޤ����� */
  public static final int CstRyMsg07027 = 7027; /**  �����Ф����ž����å��׵�򤷤ޤ����� */
  public static final int CstRyMsg07028 = 7028; /**  �����Ф����ž����å�����׵�򤷤ޤ����� */
  public static final int CstRyMsg07029 = 7029; /**  �����Фظ�����ή�ͤι����׵�򤷤ޤ����� */
  public static final int CstRyMsg07030 = 7030; /**  �����Фشƻ��оݥ��ơ����������׵�򤷤ޤ����� */
  public static final int CstRyMsg07031 = 7031; /**  �����Ф���٥�ǥ����ή�;�����׵�򤷤ޤ����� */
  public static final int CstRyMsg07032 = 7032; /**  �����Фأƣ��ؼ�ư�������ؤ��׵�򤷤ޤ����� */
  public static final int CstRyMsg07033 = 7033; /**  �����Ф���������ư�������ؤ��׵�򤷤ޤ����� */
  public static final int CstRyMsg07034 = 7034; /**  �����Фأ���V��̷�����ư�������ؤ��׵�򤷤ޤ����� */
  public static final int CstRyMsg07035 = 7035; /**  ����®���ƥ����������ޤ����� */
  public static final int CstRyMsg07036 = 7036; /**  ����®��̤�����Ǥ��� */
  public static final int CstRyMsg07037 = 7037; /**  �����Фػ���®�����������ѹ����׵�򤷤ޤ����� */
  public static final int CstRyMsg07038 = 7038; /**  ���ť�å���Υǡ����Ϥ���ޤ��� */
  public static final int CstRyMsg07039 = 7039; /**  �ǡ�������������ޤ��������̤��ɽ�����Ƥ��������� */
  public static final int CstRyMsg07040 = 7040; /**  �����Фذ����׵�򤷤ޤ����� */
  public static final int CstRyMsg07041 = 7041; /**  �����Фأãӣֽ����׵�򤷤ޤ����� */
  public static final int CstRyMsg07042 = 7042; /**  �����Фط�̾�ɲ��׵�򤷤ޤ����� */
  public static final int CstRyMsg07043 = 7043; /**  �����Фط�̾����׵�򤷤ޤ����� */
  public static final int CstRyMsg07044 = 7044; /**  �����Фط�̾�����׵�򤷤ޤ����� */
  public static final int CstRyMsg07045 = 7045; /**  �����Фػ��ξ����Խ����Τ򤷤ޤ����� */
  public static final int CstRyMsg07046 = 7046; /**  �����Фؼ�ư�������׵�򤷤ޤ����� */
  public static final int CstRyMsg07047 = 7047; /**  �����Фػ��θ�ƻ��׵�򤷤ޤ����� */
  public static final int CstRyMsg07048 = 7048; /**  �����Ф��ϵ��¹��׵�򤷤ޤ����� */
  public static final int CstRyMsg07049 = 7049; /**  �����Ф��ܼ¹��׵�򤷤ޤ����� */
  public static final int CstRyMsg07050 = 7050; /**  �����Фط������ɽ���׵�򤷤ޤ����� */
  public static final int CstRyMsg07051 = 7051; /**  ɽ�����Ƥ�����λ��������ϵ��¹Ԥϼ¹ԺѤǤ��� */
  public static final int CstRyMsg07052 = 7052; /**  {0}�Υǡ�������{1}���Ķ���Ƥ��ޤ���{1}��ޤǤ�ɽ�����ޤ��� */
  /** Rev.i08 Add Start */
  public static final int CstRyMsg07053 = 7053; /**  ľ�����Ϥ��줿�ǡ����Υ����å�������Ƥ��ޤ��� */
  public static final int CstRyMsg07054 = 7054; /**  �������������ꤷ���ǡ�����ľ�����ϤΥ����å����դ��Ƥ��ޤ��� */
  public static final int CstRyMsg07063 = 7063; /**  ����®���XML�������ޤ����� */
  public static final int CstRyMsg07064 = 7064; /**  �����Фأأͣ�������å����ؤ��׵�򤷤ޤ����� */
  /** Rev.i08 Add End */

  /** MSG7052������ʸ�� */
  public static final String CstRyWinpry000001MSG1         = "���η�̾����";        /** �������η�̾���� */
  public static final String CstRyWinpry000002MSG1         = "�������Ƶ�Ͽ";        /** �������ξ������� */
  public static final String CstRyWinpry000002MSG2         = "��������";            /** �������ξ������� */
  public static final String CstRyWinpry000002MSG3         = "�ݰ·״�ؼ�����";    /** �������ξ������� */
  public static final String CstRyWinpry000041MSG1         = "���η�̾����";        /** ��������������ξ��� */
  public static final String CstRyWinpry000041MSG2         = "���λ������";      /** ��������������ξ��� */
  public static final String CstRyWinpry000041MSG3         = "��������ή����";      /** ��������������ξ��� */
  public static final String CstRyWinpry000042MSG1         = "��������ή";          /** ����־�̷������ξ��� */
  /**  Rev.i08 Add Start */
  public static final String CstRyWinpry000057MSG1         = "��ü���θ�ƻ��������";/** ��ü���θ�ƻ���� */
  public static final String CstRyWinpry000059MSG1         = "�ޥȥꥯ��";          /** ����V����������Ƚ��ޥȥꥯ�� */
  public static final String CstRyWinpry000072MSG1         = "�裱��٥�ơ��֥�";  /** �����ϰ����� */
  public static final String CstRyWinpry000072MSG2         = "�裲��٥�ơ��֥�";  /** �����ϰ����� */
  public static final String CstRyPoppry000276MSG2         = "���Ѷ����ϰ�����";    /** ���Ѷ����ϰ������������ */
  /**  Rev.i08 Add End */

  /**  ���̳�ǧ�������� */
  public static final String CstRySetDialogTitle         = "�����ǧ";        /**  �����ǧ�������������ȥ� */
  public static final String CstRyPrintDialogTitle       = "������ǧ";        /**  ������ǧ�������������ȥ� */
  public static final String CstRyClearDelDialogTitle    = "�ǡ����˴���ǧ";  /**  �ǡ����˴���ǧ�������������ȥ� */
  public static final String CstRyRunDialogTitle         = "�¹Գ�ǧ";        /**  �¹Գ�ǧ�������������ȥ� */
  public static final String CstRySubjectDelDialogTitle  = "��̾�����ǧ";    /**  ��̾�����ǧ�������������ȥ� */
  public static final String CstRyClearDialogTitle       = "��ó�ǧ";        /**  ��ó�ǧ�������������ȥ� */
  public static final String CstRyDeleteDialogTitle      = "�����ǧ";        /**  �����ǧ�������������ȥ� */
  public static final String CstRyClearCheckDialogTitle  = "���ꥢ��ǧ";      /**  ���ꥢ��ǧ��������  // Rev.i21 Add */

  public static final String CstRySetDialogMessage         = "�ǡ��������ꤷ�ޤ���\n������Ǥ�����";           /**  �����ǧ����������å����� */
  public static final String CstRyPrintDialogMessage       = "�ǡ�����������ޤ���\n������Ǥ�����";           /**  ������ǧ����������å����� */
  public static final String CstRyClearDelDialogMessage    = "�Խ���Υǡ������˴����ޤ���\n������Ǥ�����";   /**  �ǡ����˴���ǧ����������å����� */
  public static final String CstRyRunDialogMessage         = "�¹Ԥ��ޤ���������Ǥ�����";                     /**  �¹Գ�ǧ����������å����� */
  public static final String CstRySubjectDelDialogMessage  = "��̾�������ޤ���\n������Ǥ�����";               /**  ��̾�����ǧ����������å����� */
  public static final String CstRyClearDialogMessage       = "�������ä��ޤ���\n������Ǥ�����";           /**  ��ó�ǧ����������å����� */
  public static final String CstRyDeleteDialogMessage      = "������ޤ���\n������Ǥ�����";                   /**  �����ǧ����������å����� */
  public static final String CstRyClearCheckDialogMessage  = "�Խ��ǡ����򥯥ꥢ���ޤ���\n������Ǥ��礦����"; /**  ���ꥢ��ǧ����������å�����  // Rev.i21 Add */

  public static final String CstRyDialogbutton_YES = "�Ϥ�";    /**  ���̳�ǧ�������� �Ϥ� */
  public static final String CstRyDialogbutton_NO = "������";   /**  ���̳�ǧ�������� ������ */

  /** ���������������� */
  /** �ѻ極���� */
  public static final int CstRyPrintSizeDef = 0; /** HC���� */
  public static final int CstRyPrintSizeA4  = 1; /** A4 */
  public static final int CstRyPrintSizeA3  = 2; /** A3 */
  /** ������ˡ */
  public static final int CstRyPrintKindSingle  = 1; /** ���� */
  public static final int CstRyPrintKindDuplex  = 2; /** ξ�� */
  /** ����դ� */
  public static final int CstRyPrintSepEqual  = 1; /** ���� */
  public static final int CstRyPrintSepSplit  = 2; /** ʬ�� */
  /** �������顼 */
  public static final int CstRyPrintColorDef   = 0; /** HC���� */
  public static final int CstRyPrintColorFull  = 1; /** ���顼 */
  public static final int CstRyPrintColorMono  = 2; /** ��Υ��� */

  /** �����桼�������٥�� */
  public static final String CstRyPrintRETN = "RETN";
  public static final String CstRyPrintSIZE = "SIZE";
  public static final String CstRyPrintKIND = "KIND";
  public static final String CstRyPrintSEP  = "SEP";
  public static final String CstRyPrintCOLR = "COLR";
  public static final String CstRyPrintNAME = "NAME";
  public static final String CstRyPrintCODE = "CODE";
  public static final String CstRyPrintPRNO = "PRNO";

  /** ���̼��� */
  public static final String CstRyLevel_A0 = "A0"; /** �������� */
  public static final String CstRyLevel_B0 = "B0"; /** ���׷����� */
  public static final String CstRyLevel_C0 = "C0"; /** ��ʬ������ */
  public static final String CstRyLevel_D0 = "D0"; /** ñ�������� */
  public static final String CstRyLevel_E0 = "E0"; /** 22kV������ */
  public static final String CstRyLevel_F0 = "F0"; /** LNG������ */
  public static final String CstRyLevel_G0 = "G0"; /** ������� */
  public static final String CstRyLevel_H0 = "H0"; /** ��Ͽ� */
  public static final String CstRyLevel_I0 = "I0"; /** ����� */
  public static final String CstRyLevel_J0 = "J0"; /** ����Ĭή�� */

  /** ���̥�˥����� */
  public static final String CstRyMonitorKind_LEFT   = "1"; /** �� */
  public static final String CstRyMonitorKind_CENTER = "2"; /** ��� */
  public static final String CstRyMonitorKind_RIGHT  = "3"; /** �� */

  /** �����Ԥ����� */
  public static final int CstRyShowSleepTime = 3000;

/**  Rev.i33 Add Start */
  /**  �ޥ�ޥ���No */
  public static final int CstRyMMNumber352 = 352; /** 352����å������Σ� */
/**  Rev.i33 Add End */
/**  Rev.i41 Add Start */
  public static final int CstRyMMNumber346 = 346; /** 346������Ƚ��ޥȥꥯ�������ѹ��������δ�Ϣ�ݥ�������ѹ�������������Ƚ��������������ѹ��� */
/**  Rev.i41 Add End */
/**  Rev.i37 Add Start */
  /**  ���������θƤӽФ��⡼�� */
  public static final int CstRyDialogModeReadOnly = 0;  /**  �ɤ߹��ߤΤ� */
  public static final int CstRyDialogModeEditCondition = 1; /**  �Խ������Խ� */
  public static final int CstRyDialogModeEditStatus = 2;  /**  �Խ����֤��ѹ� */
/**  Rev.i37 Add End */

/**  ############################################################################# */
/**  �ʲ������ͥ��ꥢ�Τ��ᡢ�����������ɲä��Ƥ��������� */
/**  ############################################################################# */
/** �ڻ��͡������� */
  /**  ����դΥǡ����������� */
  public static final int Graph_DataLineSize = 1;
  /**  ȯ�Żپ���ñ��Ĵ�� */
  public static final double CstRyMWCntrol = 0.1;
  /**  ���η�̾���� ���μ��� */
  public static final int CstRyTroubleKindMax = 6;
  public static final String[] CstRyTroubleKindStr = new String[]{" ", "�ֻ�����", "�ʵ׻���", "�����", "�����۾�", "����¾����"};
  public static final int[] CstRyTroubleKindCmb = new int[]{ -1, 2, 3, 4, 1, 5, 0 };
  /**  ���η�̾���� ��̾���� */
  public static final int CstRySubjectStatusMax = 4;
  public static final String[] CstRySubjectStatusStr = new String[]{" ", "Ƚ����", "�������", "�����"};
/**   public static final Color[] CstRySubjectStatusClr = new Color[]{AColor.cyan, AColor.ORG_YELLOW2, AColor.ORG_LIGHTWHITE, AColor.ORG_GREEN2 }; */
  public static final int[] CstRySubjectStatusCmb = new int[]{ -1, 3, 2, 1 };
  /**  ���η�̾���� �������� */
  public static final int CstRySubjectSendStsMax = 5;
  public static final String[] CstRySubjectSendStsStr = new String[]{"̤����", "������", "������", "��������", "�����ѡʹ���ͭ��"};
  public static final int[] CstRySubjectSendStsCmb = new int[]{ -1, 2, 4, 3, 0, 1 };
  /**  ���η�̾���� ��̾�ݸ� */
  public static final int CstRySubjectProtectMax = 2;
  public static final String[] CstRySubjectProtectStr = new String[]{"  ", "��"};
  public static final int[] CstRySubjectProtectCmb = new int[]{ -1, 1, 0 };
  /**  ���η�̾���� ��Ͽ�����ؤμ�ư���� */
  public static final int CstRyAutoSendMax = 2;
  public static final String[] CstRyAutoSendStr = new String[]{"��å�", "����"};
  public static final int CstRyAutoSendUse  = 1;    /**  ���� */
  public static final int CstRyAutoSendLock = 0;    /**  ��å� */
  /**  ���η�̾���� ���η�̾ */
  public static final int CstRy0001OneRowStrByteMax = 40;  /**  �����������ʸ������Х��ȿ� */

  /**  ���ξ��ѵ�Ͽ �Լ��� */
  public static final int CstRySummaryRowTypeMax    = 3;
  public static final int CstRySummaryRowTypeInit   = 0;   /**  ����� */
  public static final int CstRySummaryRowTypeName   = 1;   /**  ̾��ͭ */
  public static final int CstRySummaryRowTypeEvent  = 2;   /**  ���ݤΤ� */

  /**  ���ξ��ѵ�Ͽ �ơ��֥�Max */
  public static final int CstRyStatchgRecordMax     = 3000;    /**  ����Կ� */
  public static final int CstRyStatchgRecordPMax    = 1000;    /**  �ڡ���ñ�̤κ���Կ� */
  /**  ���ξ��ѵ�Ͽ �Լ��� */
  public static final int CstRyStatchgRowTypeMax    = 3;
  public static final int CstRyStatchgRowTypeInit   = 0;   /**  ����� */
  public static final int CstRyStatchgRowTypeName   = 1;   /**  ̾��ͭ */
  public static final int CstRyStatchgRowTypeEvent  = 2;   /**  ���ݤΤ� */
  /**  ���ξ��ѵ�Ͽ ������ */
  public static final int CstRyStatchgColorMax = 4;
/**   public static final Color[] CstRyStatchgColor = new Color[]{AColor.ORG_LIGHTWHITE, AColor.ORG_BENIAKA, AColor.ORG_YELLOW2, AColor.ORG_GREEN2 }; */
  /**  ���ξ��ѵ�Ͽ �ڡ��������� */
  public static final int CstRyStatchgPageMAX = 3;

  /**  ����®���������� �ơ��֥�Max */
  public static final int CstRySendHistoryRecordMax = 1000;    /**  ����Կ� */
  /**  ����®���������� ������� */
  public static final int CstRySendHistoryResultMax = 3;
  public static final String[] CstRySendHistoryResultStr = new String[]{"  ", "����", "����"};
/**   public static final Color[] CstRySendHistoryResultClr = new Color[]{AColor.cyan, AColor.ORG_LIGHTWHITE, AColor.ORG_BENIAKA }; */
  /**  ����®���������� ������ʬ */
  public static final int CstRySubjectSendDivMax = 3;
  public static final String[] CstRySubjectSendDivStr = new String[]{"  ", "��ư", "��ư"};
  /**  ����®���������� ���η�̾ */
  public static final int CstRy0005OneRowStrByteMax = 42;      /**  �����������ʸ������Х��ȿ� */

  /**  �桼�����٥��ID */
  public static final int CstRyUsrEventUpdPicRy0001 = 1001;    /**  ���η�̾��������       ɽ���������� */
  public static final int CstRyUsrEventUpdPicRy0002 = 1002;    /**  ���γ��ײ���           ɽ���������� */
  public static final int CstRyUsrEventUpdPicRy0003 = 1003;    /**  �����������η����޲��� ɽ���������� */
  public static final int CstRyUsrEventUpdPicRy0004 = 1004;    /**  ���ξ����Խ�����       ɽ���������� */
  public static final int CstRyUsrEventUpdPicRy0005 = 1005;    /**  ����®�������������   ɽ���������� */

  /**  ���饹�ֹ� */
  public static final int CstRyClassNoLine    = 3;  /**  ������ */
  public static final int CstRyClassNoBus     = 6;  /**  ���� */
  public static final int CstRyClassNoTr      = 4;  /**  �Ѱ��� */
  public static final int CstRyClassNoG       = 12; /**  ȯ�ŵ� */

  /**  ��å�����No */
  public static final int CstRyMsgTimeOut           =    3;   /**  �����Фؤ��׵᤬�����ॢ���Ȥ��ޤ����� */
  public static final int CstRyMsgSetValueNG        =    8;   /**  �����ͤ��۾�Ǥ��� */
  public static final int CstRyMsgSendResultNG      =   11;   /**  ������̤��۾�Τ�����������Ǥ��ޤ����� */
  public static final int CstRyMsgSetSearchTimeNG   = 3700;   /**  ���ϻ����λ�����̷�⤬����ޤ��� */
  public static final int CstRyMsgDeleteSubject     = 3701;   /**  ���η�̾�������ޤ����� */
  public static final int CstRyMsgProtectSubject    = 3702;   /**  ���η�̾���ݸ�ޤ����� */
  public static final int CstRyMsgUnProtectSubject  = 3703;   /**  ���η�̾���ݸ�������ޤ����� */
  public static final int CstRyMsgSendReqExe        = 3704;   /**  ��Ͽ���������ƥ�������׵ᤷ�ޤ����� */
  public static final int CstRyMsgChgStsRestore     = 3705;   /**  ��̾���֤������ѡפˤ��ޤ����� */

    /**
     * ���θ�ƻ����enum
     *
     * @author scsk-onodera
     *
     */
    public enum MonitoringKind {
      /** Rev.i08 Mod Start */
/**       /** �̾���θ�ƻ� */ */
/**       KIND1(1), */
      /** Rev.i14 Mod Start */
      /** ���θ�ƻ����*/
      KIND1(1),
      /** Rev.i14 Mod End */
/**       /** Ϣ�����θ�ƻ� */ */
/**       KIND2(2), */
      /** Rev.i14 Mod Start */
      /** ���θ�ƻ����� */
      KIND2(2),
      /** Rev.i14 Mod End */
/**       /** ���θ�ƻ�Ƴ� */ */
/**       KIND3(3), */
      /** �̾���θ�ƻ볫�� */
      KIND5(5),
      /** Ϣ�����θ�ƻ볫�� */
      KIND6(6),
      /** ���θ�ƻ�Ƴ� */
      KIND7(7),
      /** Rev.i08 Mod End */
      /** Rev.i08 Add Start */
      /** ��ü�������θ�ƻ볫�� */
      KIND8(8);
      /** Rev.i08 Add End */
        private final int code;

        private MonitoringKind(final int code) {
            this.code = code;
        }

        /**
         * �������ͤ�������ޤ���
         * @return ���θ�ƻ����
         */
        public int getCode() {
            return this.code;
        }
    }

    /** Rev.i12 Add Start */

    /**  ���顼��å����� */
    public static final int CstRyMsg07060 = 7060; /**  {0}���Խ����ܤ��������ͤ�¸�ߤ��ޤ��� */


    /**  ���� */
    public static final String CstRyMaru = "��";
    /** Rev.i24 ADD Start */
    public static final String CstRyNijyuMaru = "��";
    /** Rev.i24 ADD End */



    /**  �Խ����ơ����� */
    public static final String[] CstRyEditStatusString =  {"������", "�Խ���λ", "�Խ���λ(����)", "�Խ���λ(���)", "����������",
            "��ǧ������", "��ǧ��", "�����ģ��԰���", "�����ģ��԰���", "���ѳ��ϼ���",};

    /**  Ƚ������� */
    public static final String[] CstRyDetectTCKindString = {
               "CDT��200bps ����",
               "CDT��1200bps ñ��������",
               "CDT��1200bps ������������",
               "HLDC ñ��������",
               "HLDC ������������",
               "������TCP/IP��³",
               "CDT��200bps ������ַ�ͳ",
               /** Rev.i18 Mod Start */
/**                "CDT��1200bps������ַ�ͳ" */
               "CDT��1200bpsñ����������ַ�ͳ",
               "CDT��1200bps��������������ַ�ͳ",
               "����TC������ַ�ͳ"
               /** Rev.i18 Mod End */
    };

    /**
     * ������
     */
    public static final int CstRyEditStatusUnderOperation = 0;
    /**
     * �Խ���λ
     */
    public static final int CstRyEditStatusEnded            = 1;
    /**
     * �Խ���λ(����)
     */
    public static final int CstRyEditStatusEndedRemand     = 2;
    /**
     * �Խ���λ(���)
     */
    public static final int CstRyEditStatusEndedChancel    = 3;
    /**
     * ����������
     */
    public static final int CstRyEditStatusApplicationPending  = 4;
    /**
     * ��ǧ������
     */
    public static final int CstRyEditStatusApprovalPending      = 5;
    /**
     * ��ǧ��
     */
    public static final int CstRyEditStatusApproved              = 6;
    /**
     * �����ģ��԰���(����������)
     */
    public static final int CstRyEditStatusDBDiscordanceAppli  = 7;
    /**
     * �����ģ��԰���(��ǧ������)
     */
    public static final int CstRyEditStatusDBDiscordanceAppro  = 8;
    /**
     * ���ѳ��ϼ���
     */
    public static final int CstRyEditStatusStartFailure  = 9;
/** Rev.i38 Add Start */
    /**
     * ������Ͽ�Խ���  ���ץ������ǤΤ߻��Ѥ���ѥ�᡼����
     */
    public static final int CstRyEditStatusNewEdit  = 99;
/** Rev.i38 Add Start */
    /**  ������ǧ���� */
    /**
     * ��������
     */
    public static final int CstRyAAStatusApplicationRequested  = 1;
    /**
     * ��������
     */
    public static final int CstRyAAStatusApplicationRejected    = 2;
    /**
     * ��ǧ����
     */
    public static final int CstRyAAStatusApprovalRequested    = 3;
    /**
     * ��ǧ�����ᤷ
     */
    public static final int CstRyAAStatusApprovalRejected  = 4;
    /**
     * ��ǧ
     */
    public static final int CstRyAAStatusApproved      = 5;
    /**
     * ��ǧ���
     */
    public static final int CstRyAAStatusApprovalChancel              = 6;
    /**
     * ������
     */
    public static final int CstRyAAStatusRequestCancel              = 9;
    /**  Rev.i21 Add S */
    /**
     * ���ѳ���
     */
    public static final int CstRyAAStatusOperationStart      = 4;
    /**
     * �����ѹ�
     */
    public static final int CstRyAAStatusConfigurationChange = 2;
    /**  Rev.i21 Add E */
/**  Rev.i41 Add Start */
        /**
     * ������Ͽ
     */
    public static final int CstRyAAStatusNewRegistration = 1;
        /**
     * ���
     */
    public static final int CstRyAAStatusDelete = 3;
/**  Rev.i41 Add End */

    /**  ư��ݥ��������� */
    /**  */
    /**
     * CB��LS
     */
    public static final int CstRyActionPositionKindCB = 1;
    /**
     * ��졼
     */
    public static final int CstRyActionPositionKindRY = 2;
    /**
     * ��Ϣ
     */
    public static final int CstRyActionPositionKindBR = 3;
    /**
     * TM
     */
    public static final int CstRyActionPositionKindTM = 4;

    /**  ư�����ͭ */
    public static final String CstRyJyouhenAri     = "���� ͭ";
    /**  ư�����̵ */
    public static final String CstRyJyouhenNashi     = "���� ̵";
    /**  ư���ھ���ͭ */
    public static final String CstRyKiriJyouhenAri = "�ھ��� ͭ";

    /** ONL���� */
    /** ȯ�� */
    public static final String CstRyONLHassei     = "ȯ��";
    /** ���� */
    public static final String CstRyONLFukki     = "����";
    /** ư�� */
    public static final String CstRyONLDousa     = "ư��";

    public static final String CstRyDialogbutton_CANCEL = "����󥻥�";   /**  ���̳�ǧ�������� ����󥻥� */

    /** Rev.i12 Add End */


/**  Rev.i23 ADD S */
    /**  ����������ư����������� */
    /**  �ŵ������� */
    public static final int CstRySetKindSS = 1;
    /**  �Х����� */
    public static final int CstRySetKindPT = 2;
    /**  ���������� */
    public static final int CstRySetKindFL = 3;
/**  Rev.i23 ADD E */

/**  Rev.i39 Add Start */
    /**  ɬ��̤���ϥե饰 */
    public static final int CstRyRequiredNotEnteredFlagYes = 0;  /**  ɬ�����Ϥ��� */
    public static final int CstRyRequiredNotEnteredFlagNo = 1;  /**  ɬ�����Ϥʤ� */
/**  Rev.i39 Add End */
/** Rev.i41 Add Start */
    /**  ��ư̤�����ե饰 */
    public static final int CstRyAutoNotCreatedFlagYes = 0;  /**  ��ư���� */
    public static final int CstRyAutoNotCreatedFlagNo = 1;  /**  ��ư̤���� */
    /**  ɬ�ܥե饰 */
    public static final int CstRyRequiredFlagNo = 0;  /**  Ǥ�� */
    public static final int CstRyRequiredFlagYes = 1;  /**  ɬ�� */
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

    /** �����ʳ������оݼ��� */
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
    public static final String CstRyHourMinStr = "H��mmʬ";

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
    public static final String CstRyZenZeroStr = "��";
    /** Number 1 */
    public static final String CstRyZenOneStr = "��";
    /** Number 2 */
    public static final String CstRyZenTwoStr = "��";
    /** Number 3 */
    public static final String CstRyZenThreeStr = "��";
    /** Number 4 */
    public static final String CstRyZenFourStr = "��";
    /** Number 5 */
    public static final String CstRyZenFiveStr = "��";
    /** Number 6 */
    public static final String CstRyZenSixStr = "��";
    /** Number 7 */
    public static final String CstRyZenSevenStr = "��";
    /** Number 8*/
    public static final String CstRyZenEightStr = "��";
    /** Number 9 */
    public static final String CstRyZenNineStr = "��";

    /** Time start */
    public static final String CstRyComboTimeStart = " 0:00";
    /** Time end */
    public static final String CstRyComboTimeEnd = "23:59";
    /** Start minute */
    public static final String CstRyStartSecondStr = "00";
    /** End minute */
    public static final String CstRyEndSecondStr = "59";



    public static final String CstRyHaidenari = "ͭ";
	
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
/**  �ʲ��ˤϡ��ɲä��ʤ����ȡ� */
/**  ############################################################################# */

  /**
   * ���󥹥ȥ饯��.
   * <pre>
   * </pre>
   */
  public CstRyConst()
  {
  }
}

