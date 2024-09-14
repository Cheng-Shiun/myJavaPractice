package src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

// 製作一個 基本資訊 的填寫
public class JOptionPaneToBuildASystem {
	public static void main(String[] args) {
		// 顯示標題
		JOptionPane.showMessageDialog(null, "第一次看診，需填寫您的基本資訊", "掛號初診", JOptionPane.INFORMATION_MESSAGE);
		
		// 確認為本人填寫
		int result = JOptionPane.showConfirmDialog(null, "請確認以下資訊由本人正確填寫", "確認", JOptionPane.YES_NO_CANCEL_OPTION);
		
		switch(result) {
			case JOptionPane.YES_OPTION:
				String name = JOptionPane.showInputDialog(null, "請輸入您的大名: ");
				JOptionPane.showMessageDialog(null, "你好, " + name + "!");
				System.out.println("使用者的姓名為: " + name);
				break;
			case JOptionPane.NO_OPTION:
				JOptionPane.showMessageDialog(null, "不好意思本系統須由本人填寫!");
				break;
			case JOptionPane.CANCEL_OPTION:
				break;
			case JOptionPane.CLOSED_OPTION:
				JOptionPane.showMessageDialog(null, "已結束填寫資訊!");
				break;
		}
		
		// 基本資訊填寫
		String age = JOptionPane.showInputDialog(null, "請輸入您的年齡: ");
		System.out.println("使用者輸入的年齡為:" + age);
		
		// 出生年月日
		String birthDate = null;
        boolean validInput = false;

        // 定義日期格式的正規表達式 YYYY-MM-DD
        String datePattern = "\\d{4}-\\d{2}-\\d{2}";
        Pattern pattern = Pattern.compile(datePattern);
        
        // 日期格式化
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        while (!validInput) {
            // 使用者輸入出生年月日
            birthDate = JOptionPane.showInputDialog(null, "請输入出生日期 (格式: YYYY-MM-DD)", "出生日期输入", JOptionPane.QUESTION_MESSAGE);

            // 如果使用者取消輸入，跳出迴圈
            if (birthDate == null) {
                break;
            }

            // 驗證使用者輸入日期格式是否符合 YYYY-MM-DD
            Matcher matcher = pattern.matcher(birthDate);
            if (matcher.matches()) {
            	try {
            		// 將日期字串轉成 LocalDate 類
            		LocalDate parseDate = LocalDate.parse(birthDate, dateFormatter);
            		
            		// 確認年份為 1900 後，並且在今年之前
            		if (parseDate.getYear() < 1900 || parseDate.getYear() >= LocalDate.now().getYear()) {
            			JOptionPane.showMessageDialog(null, "年份輸入有誤，請輸入正確的年份 (1900年之後，今年之前)", "無效的年份值", JOptionPane.ERROR_MESSAGE);
            		} else {
            			validInput = true;
                		System.out.println("使用者輸入的出生日期為: " + parseDate);
            		}
            		
            	} catch (DateTimeParseException e) {
            		JOptionPane.showMessageDialog(null, "日期格式錯誤，請重新輸入 (例如: 2023-02-28)", "日期無效", JOptionPane.ERROR_MESSAGE);
            	}
            // 使用者輸入日期以外的字串
            } else {
                JOptionPane.showMessageDialog(null, "輸入格式錯誤，請重新輸入 (格式: YYYY-MM-DD)", "格式有誤", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        // 病例選項
        String[] cases = {"高血壓", "氣喘", "糖尿病", "心臟病", "無"};
        int choice = JOptionPane.showOptionDialog(null, "請問您是否有以下病史：", "病例調查",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, cases, cases[0]);

        System.out.println("使用者的病例:" + cases[choice]);
		
		
	}
}
