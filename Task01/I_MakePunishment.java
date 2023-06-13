package Task01;

/**
 * Укол пациенту с фиксированием дозировки и препарата.
 */
public interface I_MakePunishment {

    public void doIt(String client, String drug, int taken);
}