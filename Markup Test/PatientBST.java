import java.util.*;

public class PatientBST {
    public class Node {
        Patient patient;
        Node left, right;
        Node(Patient patient) {
            this.patient = patient;
            left = right = null;
        }
    }
    
    Node root;
    
    public void insert(Patient patient) {
        root = insertRec(root, patient);
    }
    
    private Node insertRec(Node root, Patient patient) {
        if (root == null) return new Node(patient);
        if (patient.ssn < root.patient.ssn) root.left = insertRec(root.left, patient);
        else root.right = insertRec(root.right, patient);
        return root;
    }
    
    Patient search(int ssn) {
        return searchRec(root, ssn);
    }
    
    private Patient searchRec(Node root, int ssn) {
        if (root == null || root.patient.ssn == ssn) return root != null ? root.patient : null;
        return ssn < root.patient.ssn ? searchRec(root.left, ssn) : searchRec(root.right, ssn);
    }
}
