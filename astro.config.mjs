// @ts-check
import {defineConfig} from 'astro/config';
import tailwind from "@astrojs/tailwind";

// https://astro.build/config
export default defineConfig({
    vite: {
        server: {
            proxy: {
                '/api': {
                    target: 'http://localhost:8080',
                    changeOrigin: true,
                },
            },
        },
    },
    integrations: [tailwind()],
    devToolbar: {
        enabled: false,
  },
});
