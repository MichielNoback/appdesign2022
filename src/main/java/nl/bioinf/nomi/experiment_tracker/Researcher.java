package nl.bioinf.nomi.experiment_tracker;

public record Researcher (String researcherName, String researcherId){
    String getResearcherDisplayName() {
        return researcherName() + "[" + researcherId() + "]";
    }
}