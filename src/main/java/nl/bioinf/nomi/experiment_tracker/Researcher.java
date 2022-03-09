package nl.bioinf.nomi.experiment_tracker;

public record Researcher (String researcherName, String researcherId){
    String getResearcherDisplayname() {
        return researcherName() + "[" + researcherId() + "]";
    }
}