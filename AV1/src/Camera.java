package AV1;

public class Camera {

    private int qualidade;

    public Camera(int qualidade) {
        this.qualidade = qualidade;
    }
    public void acharPeca(int qualidade) {
        System.out.println("");
        (int) ((Math.random() * 9) + 1)
    }
    @Override
    public String toString() {
        return "Camera{" +
                ", qualidade=" + qualidade +
                '}';
    }
}