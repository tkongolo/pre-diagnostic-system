package ke.co.sema_atsm.UI.Models;

public interface LanguagePack {

    //Insert Phone and ID
    public String getInsertPhone_and_ID_MainTitle();
    public String getInsertPhone_and_ID_Prompt_idNumber();
    public String getInsertPhone_and_ID_Prompt_phoneNumber();
    public String getInsertPhone_and_ID_Prompt_age();
    public String getInsertPhone_and_ID_NoPhone();
    public String getInsertPhone_and_ID_DiagnosisButton();
    public String getInsertPhone_and_ID_NoValidPhone();
    public String getInsertPhone_and_ID_GenderTitle();
    public String getInsertPhone_and_ID_GenderMale();
    public String getInsertPhone_and_ID_GenderFemale();
    public String getInsertPhone_and_ID_AgeGroupTitle();
    public String getInsertPhone_and_ID_Age45();
    public String getInsertPhone_and_ID_NoGender();
    public String getInsertPhone_and_ID_NoAgeGroup();
    public String getInsertPhone_and_ID_NoFullName();

    //Questionnaire
    public String getQuestionnaire_TitleGettingQuestions();
    public String getQuestionnaire_NotSelectedAnswer();
    public String getQuestionnaire_NoQuestionsAvailable();
    public String getQuestionnaire_yesButton();
    public String getQuestionnaire_noButton();

    //Diagnosis
    public String getDiagnosis_TitleGettingDiagnosis();
    public String getDiagnosis_ShortPositiveMessage();
    public String getDiagnosis_LongPositiveMessage();
    public String getDiagnosis_ShortNegativeMessage();
    public String getDiagnosis_LongNegativeMessage();
    public String getDiagnosis_GenerateReceipt();
}
