package mvvm;

public class model {

    public class Anime {
        private String nome;
        private String genero;
        private double nota;

        public Anime(String nome, String genero, double nota) {
            this.nome = nome;
            this.genero = genero;
            this.nota = nota;
        }

        public String getNome() {
            return nome;
        }

        public String getGenero() {
            return genero;
        }

        public double getNota() {
            return nota;
        }

        public String toString(){
            return "Nome: " + nome + " | Gênero: " + genero + " | Nota: " + nota;
        }

    }
}
