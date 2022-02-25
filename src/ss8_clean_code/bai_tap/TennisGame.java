package ss8_clean_code.bai_tap;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        final int KHONG = 0;
        final int MOT = 1;
        final int HAI = 2;
        final int BA = 3;
        String score = "";
        int tempScore = 0;
        if (m_score1 == m_score2) {
            switch (m_score1) {
                case KHONG:
                    score = "Love-All";
                    break;
                case MOT:
                    score = "Fifteen-All";
                    break;
                case HAI:
                    score = "Thirty-All";
                    break;
                case BA:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            score = kiemTra(m_score1, m_score2);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = m_score1;
                } else {
                    score += "-";
                    tempScore = m_score2;
                }
                switch (tempScore) {
                    case KHONG:
                        score += "Love";
                        break;
                    case MOT:
                        score += "Fifteen";
                        break;
                    case HAI:
                        score += "Thirty";
                        break;
                    case BA:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }

    private static String kiemTra(int m_score1, int m_score2) {
        String score;
        int minusResult = m_score1 - m_score2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

}
